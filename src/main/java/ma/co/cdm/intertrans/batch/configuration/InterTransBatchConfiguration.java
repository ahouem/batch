package ma.co.cdm.intertrans.batch.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.FlatFileParseException;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;

import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;
import ma.co.cdm.intertrans.batch.ItemTransferMdWriter;
import ma.co.cdm.intertrans.batch.ItemTransferWriter;
import ma.co.cdm.intertrans.batch.ItemTransfertMdProcessor;
import ma.co.cdm.intertrans.batch.ItemTransfertProcessor;
import ma.co.cdm.intertrans.batch.MiseADispositionFieldSetMapper;
import ma.co.cdm.intertrans.batch.MoveFileTasklet;
import ma.co.cdm.intertrans.batch.TransferFieldSetMapper;
import ma.co.cdm.intertrans.batch.listener.InterTransJobExecutionListener;
import ma.co.cdm.intertrans.batch.model.MiseADisposition;
import ma.co.cdm.intertrans.batch.model.Transfert;
import ma.co.cdm.intertrans.batch.model.TransfertResponse;

import org.springframework.core.io.Resource;
import org.springframework.beans.factory.annotation.Value;

@Configuration
@EnableBatchProcessing
@EnableScheduling
@Slf4j
public class InterTransBatchConfiguration {

	
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;  
    

	
	@Value("${archive.file.tr.path}")
	private String archiveTrFileResource;

	
	@Value("${archive.file.md.path}")
	private String archiveMdFileResource;
	
	private List<String> inputTrFileResourceAtMove =new ArrayList<String>();
	
	@Value("${input.file.tr.path}")
	private String inputTrFileResource;

	private List<String> inputMdFileResourceAtMove =new ArrayList<String>();
	
	@Value("${input.file.md.path}")
	private String inputMdFileResource;
	
	@Bean
	@Qualifier("multiResourceItemTrReader")
	@StepScope
	public MultiResourceItemReader<Transfert> multiResourceItemTrReader(@Value("#{jobParameters['inputTrFiles']}") Resource[] inputTrFiles) {
        log.info("*********************************************multiResourceItemTransfertReader*********************************************************");
        log.info("*********************************************input file:{}",inputTrFiles);
		MultiResourceItemReader<Transfert> reader = new MultiResourceItemReader<>();
		reader.setDelegate(customerItemTrReader());
		reader.setStrict(false);
		reader.setSaveState(false);
		reader.setResources(inputTrFiles);
		return reader;
	}

	
	@Bean
	public FlatFileItemReader<Transfert> customerItemTrReader() {
		DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
		tokenizer.setNames(new String[] { "sendingDate", "customerName", "acountDebited", "beneficiaryName","bic","iban","amount","currencyCustomer","currencyBeneficiary","costsAtPaid","countryCode","motif","adriaReference","customerReference"});
		tokenizer.setDelimiter(";");
		DefaultLineMapper<Transfert> customerLineMapper = new DefaultLineMapper<>();
		customerLineMapper.setLineTokenizer(tokenizer);
		customerLineMapper.setFieldSetMapper(new TransferFieldSetMapper());
		customerLineMapper.afterPropertiesSet();
		FlatFileItemReader<Transfert> reader = new FlatFileItemReader<>();
		reader.setLineMapper(customerLineMapper);
		return reader;
	}
	
	
	@Bean
	@Qualifier("multiResourceItemMdReader")
	@StepScope
	public MultiResourceItemReader<MiseADisposition> multiResourceItemMdReader(@Value("#{jobParameters['inputMdFiles']}") Resource[] inputMdFiles) {
        log.info("*********************************************multiResourceItemMdReader*********************************************************");
        log.info("*********************************************input file:{}",inputMdFiles);
		MultiResourceItemReader<MiseADisposition> reader = new MultiResourceItemReader<>();
		reader.setDelegate(customerItemMdReader());
		reader.setStrict(false);
		reader.setSaveState(false);
		reader.setResources(inputMdFiles);
		return reader;
	}

	@Bean
	public FlatFileItemReader<MiseADisposition> customerItemMdReader() {
		DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
		tokenizer.setNames(new String[] { "sendingDate", "acountDebited", "beneficiaryName", "identityType","identityNumber","amount","currency","costsAtPaid","countryCode","motif","adriaReference","customerReference"});
		tokenizer.setDelimiter(";");
		DefaultLineMapper<MiseADisposition> customerLineMapper = new DefaultLineMapper<>();
		customerLineMapper.setLineTokenizer(tokenizer);
		customerLineMapper.setFieldSetMapper(new MiseADispositionFieldSetMapper());
		customerLineMapper.afterPropertiesSet();
		FlatFileItemReader<MiseADisposition> reader = new FlatFileItemReader<>();
		reader.setLineMapper(customerLineMapper);
		return reader;
	}
	
	

	@Bean
    public ExecutionContext executionContext() {
		ExecutionContext context=new ExecutionContext();
		context.put("pathTrArchive", archiveTrFileResource);
		context.put("pathMrArchive", archiveMdFileResource);
		context.put("fileTrAtMove", inputTrFileResourceAtMove);
		context.put("pathTr", inputTrFileResource);
		context.put("fileMdAtMove", inputMdFileResourceAtMove);
		context.put("pathMd", inputMdFileResource);
		
        return context;
    }
	@Bean
    public ItemTransfertProcessor transfertItemTrProcessor() {
        return new ItemTransfertProcessor(executionContext());
    }
	
	@Bean
	public ItemTransferWriter transferItemTrWriter(){
		return new ItemTransferWriter();
	}
	
	@Bean
    public ItemTransfertMdProcessor transfertItemMdProcessor() {
        return new ItemTransfertMdProcessor(executionContext());
    }
	
	@Bean
	public ItemTransferMdWriter transferIteMdmWriter(){
		return new ItemTransferMdWriter();
	}
	
	@Bean
	public Step createStepTransfert(@Qualifier("multiResourceItemTrReader") MultiResourceItemReader<Transfert> reader) {
		return stepBuilderFactory.get("stepTransfert")
				.<Transfert, TransfertResponse> chunk(100)
				.reader(reader)
				.processor(transfertItemTrProcessor())
				.writer(transferItemTrWriter())
			    .faultTolerant()
			    .skip(FlatFileParseException.class)
				.build();
	}
	
	@Bean
	public Step createStepMiseADisposition(@Qualifier("multiResourceItemMdReader") MultiResourceItemReader<MiseADisposition> reader) {
		return stepBuilderFactory.get("stepMiseADisposition")
				.<MiseADisposition, TransfertResponse> chunk(100)
				.reader(reader)
				.processor(transfertItemMdProcessor())
				.writer(transferIteMdmWriter())
			    .faultTolerant()
			    .skip(FlatFileParseException.class)
				.build();
	}

	@Bean
	public Step createStepTasklet() {
		return stepBuilderFactory.get("moveFileTasklet").tasklet(new MoveFileTasklet(executionContext())).build();
	}
	
	@Bean
	public Job createJob(@Qualifier("createStepTransfert") Step createStepTransfert,@Qualifier("createStepMiseADisposition") Step createStepMiseADisposition) {
		return jobBuilderFactory.get("jobTransfertAndMiseADisposition")
				.incrementer(new RunIdIncrementer())
				.listener(new InterTransJobExecutionListener())
				.start(createStepTransfert)
				.next(createStepMiseADisposition)
				.next(createStepTasklet())
				.build();
	}
	

}
