package ma.co.cdm.intertrans.batch;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import ch.qos.logback.classic.Logger;
import ma.co.cdm.infopartenaire.consumesoap.partenaire.stub.InfosPartenaireAPartirCompteResponse;
import ma.co.cdm.infopartenaire.consumesoap.presaisie.stub.CreationPreSaisieTransfertV2Response;
import ma.co.cdm.intertrans.api.client.InfoPartenaireSoapClient;
import ma.co.cdm.intertrans.api.client.PreSaisieSoapClient;
import ma.co.cdm.intertrans.batch.model.Transfert;
import ma.co.cdm.intertrans.batch.model.TransfertResponse;
import ma.co.cdm.intertrans.batch.utils.ConfigUtility;
import ma.co.cdm.intertrans.batch.utils.RequestSoapUtils;


public class ItemTransfertProcessor implements ItemProcessor<Transfert, TransfertResponse>{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ItemTransfertProcessor.class);
	
	@Autowired
	private InfoPartenaireSoapClient infoPartenaireClient;
	
	@Autowired
	private PreSaisieSoapClient preSaisieClient;
	
	@Autowired
	private ConfigUtility configUtility;
	

	
	private ExecutionContext executionContext;
	
	 public ItemTransfertProcessor(ExecutionContext executionContext) {
		this.executionContext = executionContext;
	}

	@Override
	public TransfertResponse process(Transfert item) throws Exception {
		logger.info("*****************************************************************************Item transfert processor:{}",item);

		List<String> fileAtMove =(List<String>)executionContext.get("fileTrAtMove");
		TransfertResponse responseTransfert=new TransfertResponse();
		responseTransfert.setRefId(item.getAdriaReference());
		responseTransfert.setDateEnvoie(item.getSendingDate());
		
		//Appel du service get Info Partenaire .
		InfosPartenaireAPartirCompteResponse response=new InfosPartenaireAPartirCompteResponse();
		try {
			 response=infoPartenaireClient.getInfoPartenaire(RequestSoapUtils.prepareCriteriaForGetInfoPartenaire(item.getAcountDebited()));
			 
				if(response.getPartenaireApiDto() !=null && response.getPartenaireApiDto().getCdErreur().equals("0") ) {
					//Appel du service Pre Saisie .							
					CreationPreSaisieTransfertV2Response responsePreSaisie = new CreationPreSaisieTransfertV2Response();
					try {
						responsePreSaisie=preSaisieClient.creationPreSaisieTransfert(RequestSoapUtils.prepareCriteriaForPreSaisie(response, item, null, true,configUtility));	
						if(responsePreSaisie.getRetour()!=null 
								&& responsePreSaisie.getRetour().getErreurMess()!=null 
								&& responsePreSaisie.getRetour().getErreurMess().getCode()!=null 
								&& responsePreSaisie.getRetour().getErreurMess().getLibelle()!=null) {
							//Gerer le cas d'erreur fonctionnel du service creationPreSaisieTransfert .
							responseTransfert.setStatus("Non Traitée");
							responseTransfert.setDescription(responsePreSaisie.getRetour().getErreurMess().getLibelle());
							responseTransfert.setHasTechnicalError(false);
							fileAtMove.add(item.getFileName());
							executionContext.put("fileTrAtMove", fileAtMove);
						}else {
							//Mettre a jour info Transfert reponse dans le cas succees.
							responseTransfert.setStatus("Traite");
							responseTransfert.setHasTechnicalError(false);
							fileAtMove.add(item.getFileName());
							executionContext.put("fileTrAtMove", fileAtMove);
						}

					}catch(Exception e) {
						//TODO Gerer le cas d'une Exception Technique Pre Saisie .
						logger.error("************************* Erreur Technique lors de l appel a ws :CreationPreSaisieTransfertV2 :{} ",e.getMessage());
						responseTransfert.setHasTechnicalError(true);
						responseTransfert.setFileNameHasTechnicalError(item.getFileName());
						responseTransfert.setMotifTechnicalError(e.getMessage());
					}
						
					
				}else {
				    //Gerer le cas d'erreur fonctionnel du service get info partenaire .
					responseTransfert.setStatus("Non Traitée");
					responseTransfert.setDescription(configUtility.getProperty(response.getPartenaireApiDto().getCdErreur()));
					responseTransfert.setHasTechnicalError(false);
					fileAtMove.add(item.getFileName());
					executionContext.put("fileTrAtMove", fileAtMove);
				}

		}catch(Exception e) {
			//TODO Gerer le cas d'une Exception Technique service Info Partenaire.
			logger.error("************************* Erreur Technique lors de l appel a ws :InfosPartenaireAPartirCompteEndPoint :{} ",e.getMessage());
			responseTransfert.setHasTechnicalError(true);
			responseTransfert.setFileNameHasTechnicalError(item.getFileName());
		}
		
		return responseTransfert;
	}

}
