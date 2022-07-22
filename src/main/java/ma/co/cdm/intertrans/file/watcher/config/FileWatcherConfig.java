package ma.co.cdm.intertrans.file.watcher.config;

import java.io.File;

import javax.annotation.PreDestroy;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.devtools.filewatch.FileSystemWatcher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import ch.qos.logback.classic.Logger;

@Configuration
public class FileWatcherConfig {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(MyFileChangeListener.class);
	
	@Value("${input.file.path}")
	private String inputFileResource;
	

    @Bean
    public FileSystemWatcher fileSystemWatcher() {
        FileSystemWatcher fileSystemWatcher = new FileSystemWatcher(/*true, Duration.ofMillis(5000L), Duration.ofMillis(3000L)*/);
        fileSystemWatcher.addSourceDirectory(new File(inputFileResource));
        fileSystemWatcher.addListener(MyFileChangeListener());
        fileSystemWatcher.start();
       logger.info("*********************************************started fileSystemWatche for intertrans r******************************************************");
        return fileSystemWatcher;
    }
    
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
    @Bean
    MyFileChangeListener MyFileChangeListener() {
    	return new MyFileChangeListener();
    }

    @PreDestroy
    public void onDestroy() throws Exception {
        fileSystemWatcher().stop();
    }
}
