package ma.co.cdm.intertrans.batch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;

import ma.co.cdm.intertrans.batch.listener.InterTransJobExecutionListener;

public class MoveFileTasklet implements Tasklet  {
	
    Logger logger = LoggerFactory.getLogger(InterTransJobExecutionListener.class);
    
	private String archiveTrFileResource;
	private String archiveMdFileResource;
	private String pathTr;
	private List<String> fileTrAtMove;
	private String pathMd;
	private List<String> fileMdAtMove;	

	


	
	private ExecutionContext executionContext;
	
	 public MoveFileTasklet(ExecutionContext executionContext) {
		this.executionContext = executionContext;
	}


	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		logger.info("*****************************************************************************MoveFileTasklet");
		
		fileTrAtMove =(List<String>)executionContext.get("fileTrAtMove");
		fileMdAtMove =(List<String>)executionContext.get("fileMdAtMove");
		
		archiveTrFileResource =(String)executionContext.get("pathTrArchive");
	    archiveMdFileResource =(String)executionContext.get("pathMrArchive");
	    pathTr =(String)executionContext.get("pathTr");
	    pathMd =(String)executionContext.get("pathMd");

		if(fileTrAtMove!=null && fileTrAtMove.size()>0) {
			moveFile(archiveTrFileResource,pathTr,fileTrAtMove);
			fileTrAtMove=new ArrayList<String>();
        	executionContext.put("fileTrAtMove", fileTrAtMove);
		}
		
		if(fileMdAtMove!=null && fileMdAtMove.size()>0) {
			moveFile(archiveMdFileResource,pathMd,fileMdAtMove);
			fileMdAtMove=new ArrayList<String>();
        	executionContext.put("fileMdAtMove", fileMdAtMove);
		}
						
	return RepeatStatus.FINISHED;
	}
	
	/**
	 * Move File 
	 * 
	 * @param filesAtMove
	 * @param pathToMove
	 */
	private void moveFile(String pathToMove,String pathFromMove,List<String> filesAtMove) {
		for (String fileAtMove : filesAtMove) {
				    Path temp = null;
					try {
						temp = Files.move
						        (Paths.get(pathFromMove+fileAtMove), 
						        Paths.get(pathToMove+"ARCHIVE_"+getCurrentlyDateTimeInHourAndMinute().toString()+fileAtMove));
					} catch (IOException e) {
						logger.error(e.getMessage());
					}
				      
				            if(temp != null)
				            {
				            	logger.info("File moved successfully");
				            }
				            else
				            {
				            	logger.info("Failed to move the file");
				            }				
		

		
		}
	}
	
    public static String getCurrentlyDateTimeInHourAndMinute() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss");
        return dateFormat.format(new Date());
    }
	
	
}
