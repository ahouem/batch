package ma.co.cdm.intertrans.batch.listener;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InterTransJobExecutionListener implements JobExecutionListener{

    Logger logger = LoggerFactory.getLogger(InterTransJobExecutionListener.class);
    
	@Value("file:${archive.file.path}/")
	private Resource archiveFileResource;


	
	@Override
	public void beforeJob(JobExecution jobExecution) {
		logger.info("InterTransJobExecutionListener - beforeJob started.");
		
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		jobExecution.getExecutionContext().get("filesAtMove");
		   if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
	            logger.info("InterTransJobExecutionListener - - afterJob completed successfully");
	        } else if (jobExecution.getStatus() == BatchStatus.FAILED) {
	            logger.info("InterTransJobExecutionListener - afterJob failed.");
	        }
		
	}
	


}
