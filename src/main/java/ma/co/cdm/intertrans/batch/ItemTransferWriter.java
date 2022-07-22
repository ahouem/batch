package ma.co.cdm.intertrans.batch;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;

import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.util.CollectionUtils;

import ch.qos.logback.classic.Logger;
import ma.co.cdm.intertrans.batch.model.TransfertResponse;
import ma.co.cdm.intertrans.batch.utils.ConfigUtility;
import ma.co.cdm.intertrans.service.EmailService;

public class ItemTransferWriter implements ItemWriter<TransfertResponse> {
	

	@Value("file:${output.file.tr.path}")
	private Resource outputResource;
	
	@Value("${rejected.file.tr.path}")
	private String rejectedTrFileResource;

	@Value("${input.file.tr.path}")
	private String inputTrFileResource;
	
	@Autowired
	private ConfigUtility configUtility;
	
	@Autowired
    private EmailService emailService;
	
	
    private static final Logger logger = (Logger) LoggerFactory.getLogger(ItemTransferWriter.class);
	
	@Override
	public void write(List<? extends TransfertResponse> items) throws Exception {
		logger.info("*****************************************************************************Item Transfer writter{}",items);
		List<TransfertResponse> listSuccess =new ArrayList<TransfertResponse>();
		List<TransfertResponse> listErrors =new ArrayList<TransfertResponse>();
		
		if(!CollectionUtils.isEmpty(items)) {
			listSuccess.addAll(items.stream().filter(response->!response.isHasTechnicalError()).collect(Collectors.toList()));
			listErrors.addAll(items.stream().filter(response->response.isHasTechnicalError()).collect(Collectors.toList()));
		}
		
		if(!CollectionUtils.isEmpty(listSuccess)) {
			writeToCsv(listSuccess);			
		}
		
		if(!CollectionUtils.isEmpty(listErrors)) {
			sendNotificationAndMoveFileInError(listErrors);
		}
		
	}

	
	/**
	 * Send Notification for File In Error .
	 * 
	 * @param listErrors
	 * @throws MessagingException
	 */
	private void sendNotificationAndMoveFileInError(List<TransfertResponse> listErrors) throws MessagingException {
		InternetAddress recipients[] = new InternetAddress[100];
		String recAddr = configUtility.getProperty("recipients");
		StringTokenizer strTokenRec = new StringTokenizer(recAddr, ";");
		int i=0;
		while (strTokenRec.hasMoreElements()) {
			recipients[i] = new InternetAddress((String) strTokenRec.nextElement());
			i++;
		}
		
		String subject =configUtility.getProperty("subject.tr");
		String fromEmail =configUtility.getProperty("sender");
		listErrors.forEach(fileInError->{
		String message = MessageFormat.format(
					configUtility.getProperty("msgBody"),"", fileInError.getRefId(), fileInError.getMotifTechnicalError());
			logger.info("Move File reference Transfert in Technical Error......:"+fileInError.getRefId());
			//emailService.sendMail(fromEmail,toEmail, subject, message);
			emailService.sendMailWithFile(fromEmail,recipients, subject, message,inputTrFileResource+fileInError.getFileNameHasTechnicalError());
			logger.info("**********************************************Mail envoyé avec succees*********************************************");			
			//Move file Rejected
			moveFile(rejectedTrFileResource,  inputTrFileResource+fileInError.getFileNameHasTechnicalError());
		});
		
	}
	
	
	/**
	 * Move File Rejected .
	 * 
	 * @param pathToMove
	 * @param pathFromMove
	 * @param filesAtMove
	 */
	private void moveFile(String pathToMove,String fileAtMove) {
		Path temp = null;
			try {
				temp = Files.move
			    (Paths.get(fileAtMove), 
			      Paths.get(pathToMove+"REJECTED_TR_"+getCurrentlyDateTimeInHourAndMinute().toString()+".csv"));
				} catch (IOException e) {
					logger.error(e.getMessage());
				}
			    
			       if(temp != null){
				      logger.info("File moved successfully");
				   }else{
					logger.info("Failed to move the file");
				   }				
			
	}

	/**
	 * Convert Object To CSV files .
	 * 
	 * @param items
	 * @throws IOException
	 */
	 public void writeToCsv(List<? extends TransfertResponse> items) throws IOException {
		 	Long sizeOp=(long) items.size();
		 	sizeOp =sizeOp+2;
		 	
	        PrintWriter writer = new PrintWriter(outputResource.getURL().getPath()+"TR_"+getCurrentlyDateTimeInHourAndMinute().toString()+".csv");
	        writer.println("00|BATCH:"+UUID.randomUUID()+"|"+getCurrentlyDate().toString());
	        for (TransfertResponse response : items) {
	            writer.println(response.toStringCsvOutPut());
	        }
	        writer.println("02|"+sizeOp);
	        writer.close();
	    }
	 
	    public static String getCurrentlyDateTimeInHourAndMinute() {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss");
	        return dateFormat.format(new Date());
	    }
	    
	    public static String getCurrentlyDate() {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	        return dateFormat.format(new Date());
	    }
}
