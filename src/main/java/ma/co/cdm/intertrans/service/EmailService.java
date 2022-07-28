package ma.co.cdm.intertrans.service;

import java.io.File;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.slf4j.LoggerFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import lombok.var;

@Service
public class EmailService {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(EmailService.class);

	private JavaMailSender  javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    /**
     * Send Mail .
     * 
     * @param fromEmail
     * @param toEmail
     * @param subject
     * @param message
     */
    public void sendMail(String fromEmail,String toEmail, String subject, String message) {

        var mailMessage = new SimpleMailMessage();

        mailMessage.setTo(toEmail);
        mailMessage.setSubject(subject);
        mailMessage.setText(message);
        mailMessage.setFrom(fromEmail);

        javaMailSender.send(mailMessage);
    }
    
    
    /**
     * Send Mail with File .
     * 
     * @param fromEmail
     * @param toEmail
     * @param subject
     * @param message
     * @param fileToAttach
     */
    public void sendMailWithFile(String fromEmail,InternetAddress recipients[], String subject, String message,String fileToAttach) {
    	MimeMessagePreparator preparator = new MimeMessagePreparator()
    	{
            public void prepare(MimeMessage mimeMessage) throws Exception
            {
                mimeMessage.setFrom(new InternetAddress(fromEmail));
                mimeMessage.setSubject(subject);
                mimeMessage.setText(message);
        		for (InternetAddress adress : recipients){
        			if(adress !=null && adress.getAddress()!=null) {
            			mimeMessage.addRecipient(javax.mail.Message.RecipientType.TO,adress);        				
        			}
        		}

                FileSystemResource file = new FileSystemResource(new File(fileToAttach));
                MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
                helper.addAttachment(file.getFilename(), file);   
                helper.setText(message, false);

            }
        };

        try {
        	javaMailSender.send(preparator);
        }
        catch (MailException ex) {
           logger.error(ex.getMessage());
        }

    }
}
