package ma.co.cdm.intertrans.api.client;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import ma.co.cdm.infopartenaire.consumesoap.partenaire.stub.InfosPartenaireAPartirCompte;
import ma.co.cdm.infopartenaire.consumesoap.partenaire.stub.InfosPartenaireAPartirCompteResponse;



@Service
public class InfoPartenaireSoapClient {
	
	@Autowired
	private Jaxb2Marshaller marshallerPartenaire;
	
	private WebServiceTemplate templatePartenaire;
	
	@Value("${info.partenaire.path}")
	private String endPointinfoPartenaire;
		
	public InfosPartenaireAPartirCompteResponse getInfoPartenaire(InfosPartenaireAPartirCompte infoPartenaireAPartirCompte) {
		templatePartenaire =new WebServiceTemplate(marshallerPartenaire);
		final Object objectResult=	templatePartenaire.marshalSendAndReceive(endPointinfoPartenaire, infoPartenaireAPartirCompte);
		return (InfosPartenaireAPartirCompteResponse) ((JAXBElement<InfosPartenaireAPartirCompteResponse>) objectResult).getValue();
		
	}

}
