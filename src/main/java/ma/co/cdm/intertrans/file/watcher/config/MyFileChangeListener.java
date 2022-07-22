package ma.co.cdm.intertrans.file.watcher.config;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Set;

import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.devtools.filewatch.ChangedFile;
import org.springframework.boot.devtools.filewatch.ChangedFile.Type;
import org.springframework.boot.devtools.filewatch.ChangedFiles;
import org.springframework.boot.devtools.filewatch.FileChangeListener;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import ch.qos.logback.classic.Logger;

import ma.co.cdm.intertrans.batch.configuration.BatchLauncher;

@Component
public class MyFileChangeListener implements FileChangeListener {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(MyFileChangeListener.class);
	
	@Autowired
    private BatchLauncher batchLauncher;
	
	private final RestTemplate restTemplate = new RestTemplate();
	
    
    @Override
    public void onChange(Set<ChangedFiles> changeSet) {
        for(ChangedFiles cfiles : changeSet) {
            for(ChangedFile cfile: cfiles.getFiles()) {
                if( /* (cfile.getType().equals(Type.MODIFY) 
                     || cfile.getType().equals(Type.ADD)  
                     || cfile.getType().equals(Type.DELETE) ) && */
                		cfile.getType().equals(Type.ADD) 
                		|| !isLocked(cfile.getFile().toPath())) {
                	logger.info("Operation {} on file {} is done ", cfile.getType(),cfile.getFile().getName());                 
               }
            }
        }
        
        
        
          try {
              logger.info("*********************************************run batch launcher******************************************************");
				batchLauncher.run();
			} catch (JobParametersInvalidException | JobExecutionAlreadyRunningException | JobRestartException
					| JobInstanceAlreadyCompleteException e) {
				logger.error(e.getMessage());
			}
        
    }
    
    private boolean isLocked(Path path) {
        try (FileChannel ch = FileChannel.open(path, StandardOpenOption.WRITE); FileLock lock = ch.tryLock()) {
            return lock == null;
        } catch (IOException e) {
            return true;
        }
    }

}
