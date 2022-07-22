package ma.co.cdm.intertrans.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfiguration {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller =new Jaxb2Marshaller();
		marshaller.setPackagesToScan("ma.co.cdm.infopartenaire.consumesoap.presaisie.stub","ma.co.cdm.infopartenaire.consumesoap.partenaire.stub");
		return marshaller;
		
	}

}
