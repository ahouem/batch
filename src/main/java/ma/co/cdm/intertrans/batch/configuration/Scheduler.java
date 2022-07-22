package ma.co.cdm.intertrans.batch.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Scheduler {

    @Autowired
    private BatchLauncher batchLauncher;


    //@Scheduled(fixedDelay = 10000)
    public void perform() throws Exception {
        log.info("*********************************************Batch programm&#xE9; pour tourner toutes les 8 secondes*********************************************************");
        batchLauncher.run();       
    }
}
