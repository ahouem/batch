package ma.co.cdm.intertrans.api.client;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import ma.co.cdm.infopartenaire.consumesoap.presaisie.stub.CreationPreSaisieTransfertV2;
import ma.co.cdm.infopartenaire.consumesoap.presaisie.stub.CreationPreSaisieTransfertV2Response;




@Service
public class PreSaisieSoapClient {

	@Autowired
	private Jaxb2Marshaller marshaller;
	
	private WebServiceTemplate template;
	
	@Value("${pre.saisie.transfert.path}")
	private String endPointPreSaisieTransfert;
	
	public CreationPreSaisieTransfertV2Response creationPreSaisieTransfert(CreationPreSaisieTransfertV2 preSaisie) {
		template =new WebServiceTemplate(marshaller);
		final Object objectResult= template.marshalSendAndReceive(endPointPreSaisieTransfert, preSaisie);
		return (CreationPreSaisieTransfertV2Response) ((JAXBElement<CreationPreSaisieTransfertV2Response>) objectResult).getValue();
	}
}
