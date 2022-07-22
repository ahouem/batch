package ma.co.cdm.intertrans.controller;

import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;
import ma.co.cdm.infopartenaire.consumesoap.partenaire.stub.InfosPartenaireAPartirCompte;
import ma.co.cdm.infopartenaire.consumesoap.partenaire.stub.InfosPartenaireAPartirCompteResponse;
import ma.co.cdm.intertrans.api.client.InfoPartenaireSoapClient;
import ma.co.cdm.intertrans.batch.configuration.BatchLauncher;

@RestController
public class HomeController {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(HomeController.class);

	
	@Autowired
	private InfoPartenaireSoapClient InfoPartenaireSoapClient;
	
    @Autowired
    private BatchLauncher batchLauncher;

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@PostMapping("/getInfoPartenaire")
	public InfosPartenaireAPartirCompteResponse getInfoPartenaire(@RequestBody InfosPartenaireAPartirCompte request) {
		return InfoPartenaireSoapClient.getInfoPartenaire(request);
	}
	
	@GetMapping("/perform")
	public BatchStatus perform() {
		BatchStatus response=null;
		try {
			response= batchLauncher.run();
		} catch (JobParametersInvalidException e) {
			logger.error(e.getMessage());
		} catch (JobExecutionAlreadyRunningException e) {
			logger.error(e.getMessage());
		} catch (JobRestartException e) {
			logger.error(e.getMessage());
		} catch (JobInstanceAlreadyCompleteException e) {
			logger.error(e.getMessage());		}
		return response;

	}
	
}
