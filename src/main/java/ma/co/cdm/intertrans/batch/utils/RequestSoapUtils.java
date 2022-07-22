package ma.co.cdm.intertrans.batch.utils;



import ma.co.cdm.infopartenaire.consumesoap.partenaire.stub.InfosPartenaireAPartirCompte;
import ma.co.cdm.infopartenaire.consumesoap.partenaire.stub.InfosPartenaireAPartirCompteResponse;
import ma.co.cdm.infopartenaire.consumesoap.partenaire.stub.ServiceContextDto;
import ma.co.cdm.infopartenaire.consumesoap.partenaire.stub.ServiceContextDto.AttributeList;
import ma.co.cdm.infopartenaire.consumesoap.partenaire.stub.ServiceContextDto.AttributeList.Entry;
import ma.co.cdm.infopartenaire.consumesoap.presaisie.stub.CptePart;
import ma.co.cdm.infopartenaire.consumesoap.presaisie.stub.CreationPreSaisieTransfertV2;
import ma.co.cdm.infopartenaire.consumesoap.presaisie.stub.TypePreSaisieTransfertV2;
import ma.co.cdm.infopartenaire.consumesoap.presaisie.stub.TypeTarification;
import ma.co.cdm.intertrans.batch.model.MiseADisposition;
import ma.co.cdm.intertrans.batch.model.Transfert;

public class RequestSoapUtils {


	
	/**
	 * Prepare Criteria for service get info partenaire .
	 * 
	 * @param acountNumber
	 * @return
	 */
	public final static InfosPartenaireAPartirCompte  prepareCriteriaForGetInfoPartenaire(String acountNumber) {
		InfosPartenaireAPartirCompte request=new InfosPartenaireAPartirCompte();
		ServiceContextDto context=new ServiceContextDto();
		AttributeList attribut=new AttributeList();
		Entry entry=new Entry();
		entry.setKey("PERSISTENCE_JNDI_NAME_IB");
		entry.setValue("java:/ibDS");
		attribut.getEntry().add(entry);
		context.setAttributeList(attribut);
		request.setServiceContextDto(context);
		request.setNumeroCompte(acountNumber);
		return request;
	}

	public static CreationPreSaisieTransfertV2 prepareCriteriaForPreSaisie(InfosPartenaireAPartirCompteResponse response,Transfert transfert,MiseADisposition miseAdisposition,boolean isTransfert,ConfigUtility config) {
		CreationPreSaisieTransfertV2 requestPreSaisie=new CreationPreSaisieTransfertV2();
		requestPreSaisie.setACreer(new TypePreSaisieTransfertV2());
		
		requestPreSaisie.getACreer().setBicBanqueBeneficiaire(isTransfert?transfert.getBic():config.getProperty("bic.banque.benef.cmdos"));
		requestPreSaisie.getACreer().setCodeEtablissement("COS");
		requestPreSaisie.getACreer().setCodeOrigine("ag"); //"eb"
		requestPreSaisie.getACreer().setCodePays(isTransfert?config.getProperty(transfert.getCountryCode()):config.getProperty(miseAdisposition.getCountryCode()));
		requestPreSaisie.getACreer().setCompteBeneficiaire(isTransfert?transfert.getIban():""); //TODO a redefinir cas MD demande du code .
		
		requestPreSaisie.getACreer().setCpteDom(new CptePart());
		requestPreSaisie.getACreer().getCpteDom().setBoDdg("");
		requestPreSaisie.getACreer().getCpteDom().setBoEdi("");
		requestPreSaisie.getACreer().getCpteDom().setBoEdiAo("");
		requestPreSaisie.getACreer().getCpteDom().setBoEdiOc("");
		requestPreSaisie.getACreer().getCpteDom().setBoEdiTrExe("");
		requestPreSaisie.getACreer().getCpteDom().setBoEdiTrPec("");
		requestPreSaisie.getACreer().getCpteDom().setBoPfe("");
		requestPreSaisie.getACreer().getCpteDom().setBoSuivflux("");
		requestPreSaisie.getACreer().getCpteDom().setCdBdf("");
		requestPreSaisie.getACreer().getCpteDom().setCdCdl("");

		requestPreSaisie.getACreer().getCpteDom().setCdCommune(response.getPartenaireApiDto().getCdCommune());
		requestPreSaisie.getACreer().getCpteDom().setCdCompte(response.getPartenaireApiDto().getCdCptDom());
		requestPreSaisie.getACreer().getCpteDom().setCdDevCompte(response.getPartenaireApiDto().getCdDevContrat());
		requestPreSaisie.getACreer().getCpteDom().setCdGest(response.getPartenaireApiDto().getCdGest());
		requestPreSaisie.getACreer().getCpteDom().setCdGrpPrlv(response.getPartenaireApiDto().getCdGrpPrlv());
		requestPreSaisie.getACreer().getCpteDom().setCdPart(response.getPartenaireApiDto().getCdPart());
		requestPreSaisie.getACreer().getCpteDom().setCdPaysres(response.getPartenaireApiDto().getCdPaysres());
		requestPreSaisie.getACreer().getCpteDom().setCdPort(response.getPartenaireApiDto().getCdPort());
		requestPreSaisie.getACreer().getCpteDom().setDateCreaMod(response.getPartenaireApiDto().getDateCreaMod());
		requestPreSaisie.getACreer().getCpteDom().setLbGest(response.getPartenaireApiDto().getLbGest());
		requestPreSaisie.getACreer().getCpteDom().setLbNompren(response.getPartenaireApiDto().getLbNompren());
		
		requestPreSaisie.getACreer().getCpteDom().setCdCptDom("");
		requestPreSaisie.getACreer().getCpteDom().setCdDomInt("");
		requestPreSaisie.getACreer().getCpteDom().setCdGrpMarge("");
		requestPreSaisie.getACreer().getCpteDom().setCdGrpTarif("");
		requestPreSaisie.getACreer().getCpteDom().setCdGrpValeur("");
		
		requestPreSaisie.getACreer().getCpteDom().setCdGuichet("");
		requestPreSaisie.getACreer().getCpteDom().setCdNote("");
		requestPreSaisie.getACreer().getCpteDom().setCdPartechn("");
		requestPreSaisie.getACreer().getCpteDom().setCdSegn("");
		requestPreSaisie.getACreer().getCpteDom().setCdSupp("");
		requestPreSaisie.getACreer().getCpteDom().setDtCloture("");
		requestPreSaisie.getACreer().getCpteDom().setDtNote("");
		requestPreSaisie.getACreer().getCpteDom().setDtOcc("");
		requestPreSaisie.getACreer().getCpteDom().setLbAdr1("");
		requestPreSaisie.getACreer().getCpteDom().setLbAdr2("");
		requestPreSaisie.getACreer().getCpteDom().setLbAdr3("");
		requestPreSaisie.getACreer().getCpteDom().setLbAdr4("");
		
		requestPreSaisie.getACreer().getCpteDom().setLbAutAd2("");
		requestPreSaisie.getACreer().getCpteDom().setLbAutAd3("");
		requestPreSaisie.getACreer().getCpteDom().setLbAutAd4("");
		requestPreSaisie.getACreer().getCpteDom().setLbAutAdr("");
		requestPreSaisie.getACreer().getCpteDom().setLbCompte("");
		requestPreSaisie.getACreer().getCpteDom().setLbCpville("");
		requestPreSaisie.getACreer().getCpteDom().setLbMail("");
		requestPreSaisie.getACreer().getCpteDom().setLbPort("");
		requestPreSaisie.getACreer().getCpteDom().setMtPlafoc("");
		requestPreSaisie.getACreer().getCpteDom().setNoFax("");
		requestPreSaisie.getACreer().getCpteDom().setNoSiren("");
		requestPreSaisie.getACreer().getCpteDom().setNoTel("");
		requestPreSaisie.getACreer().getCpteDom().setTpEtat("");
		requestPreSaisie.getACreer().getCpteDom().setTpExontva("");
		requestPreSaisie.getACreer().getCpteDom().setTpFam("");
		requestPreSaisie.getACreer().getCpteDom().setTpResbanc("");
		requestPreSaisie.getACreer().getCpteDom().setTpResfic("");
		requestPreSaisie.getACreer().getCpteDom().setTpType("");
		
		requestPreSaisie.getACreer().setCptePartDo(new CptePart());
		
		requestPreSaisie.getACreer().getCptePartDo().setBoDdg("");
		requestPreSaisie.getACreer().getCptePartDo().setBoEdi("");
		requestPreSaisie.getACreer().getCptePartDo().setBoEdiAo("");
		requestPreSaisie.getACreer().getCptePartDo().setBoEdiOc("");
		requestPreSaisie.getACreer().getCptePartDo().setBoEdiTrExe("");
		requestPreSaisie.getACreer().getCptePartDo().setBoEdiTrPec("");
		requestPreSaisie.getACreer().getCptePartDo().setBoPfe("");
		requestPreSaisie.getACreer().getCptePartDo().setBoSuivflux("");
		requestPreSaisie.getACreer().getCptePartDo().setCdBdf("");
		requestPreSaisie.getACreer().getCptePartDo().setCdCdl("");
		
		requestPreSaisie.getACreer().getCptePartDo().setCdCommune(response.getPartenaireApiDto().getCdCommune());
		requestPreSaisie.getACreer().getCptePartDo().setCdCompte(response.getPartenaireApiDto().getCdCptDom());
		requestPreSaisie.getACreer().getCptePartDo().setCdDevCompte(response.getPartenaireApiDto().getCdDevContrat());
		requestPreSaisie.getACreer().getCptePartDo().setCdGest(response.getPartenaireApiDto().getCdGest());
		requestPreSaisie.getACreer().getCptePartDo().setCdGrpPrlv(response.getPartenaireApiDto().getCdGrpPrlv());
		requestPreSaisie.getACreer().getCptePartDo().setCdPart(response.getPartenaireApiDto().getCdPart());
		requestPreSaisie.getACreer().getCptePartDo().setCdPaysres(response.getPartenaireApiDto().getCdPaysres());
		requestPreSaisie.getACreer().getCptePartDo().setCdPort(response.getPartenaireApiDto().getCdPort());
		requestPreSaisie.getACreer().getCptePartDo().setDateCreaMod(response.getPartenaireApiDto().getDateCreaMod());
		requestPreSaisie.getACreer().getCptePartDo().setLbGest(response.getPartenaireApiDto().getLbGest());
		requestPreSaisie.getACreer().getCptePartDo().setLbNompren(response.getPartenaireApiDto().getLbNompren());
		
		requestPreSaisie.getACreer().getCptePartDo().setCdCptDom("");
		requestPreSaisie.getACreer().getCptePartDo().setCdDomInt("");
		requestPreSaisie.getACreer().getCptePartDo().setCdGrpMarge("");
		requestPreSaisie.getACreer().getCptePartDo().setCdGrpTarif("");
		requestPreSaisie.getACreer().getCptePartDo().setCdGrpValeur("");
		requestPreSaisie.getACreer().getCptePartDo().setCdGuichet("");
		requestPreSaisie.getACreer().getCptePartDo().setCdNote("");
		requestPreSaisie.getACreer().getCptePartDo().setCdPartechn("");
		requestPreSaisie.getACreer().getCptePartDo().setCdSegn("");
		requestPreSaisie.getACreer().getCptePartDo().setCdSupp("");
		requestPreSaisie.getACreer().getCptePartDo().setDtCloture("");
		requestPreSaisie.getACreer().getCptePartDo().setDtNote("");
		requestPreSaisie.getACreer().getCptePartDo().setDtOcc("");
		requestPreSaisie.getACreer().getCptePartDo().setLbAdr1("");
		requestPreSaisie.getACreer().getCptePartDo().setLbAdr2("");
		requestPreSaisie.getACreer().getCptePartDo().setLbAdr3("");
		requestPreSaisie.getACreer().getCptePartDo().setLbAdr4("");
		requestPreSaisie.getACreer().getCptePartDo().setLbAutAd2("");
		requestPreSaisie.getACreer().getCptePartDo().setLbAutAd3("");
		requestPreSaisie.getACreer().getCptePartDo().setLbAutAd4("");
		requestPreSaisie.getACreer().getCptePartDo().setLbAutAdr("");
		requestPreSaisie.getACreer().getCptePartDo().setLbCompte("");
		requestPreSaisie.getACreer().getCptePartDo().setLbCpville("");
		requestPreSaisie.getACreer().getCptePartDo().setLbMail("");
		requestPreSaisie.getACreer().getCptePartDo().setLbPort("");
		requestPreSaisie.getACreer().getCptePartDo().setMtPlafoc("");
		requestPreSaisie.getACreer().getCptePartDo().setNoFax("");
		requestPreSaisie.getACreer().getCptePartDo().setNoSiren("");
		requestPreSaisie.getACreer().getCptePartDo().setNoTel("");
		requestPreSaisie.getACreer().getCptePartDo().setTpEtat("");
		requestPreSaisie.getACreer().getCptePartDo().setTpExontva("");
		requestPreSaisie.getACreer().getCptePartDo().setTpFam("");
		requestPreSaisie.getACreer().getCptePartDo().setTpResbanc("");
		requestPreSaisie.getACreer().getCptePartDo().setTpResfic("");
		requestPreSaisie.getACreer().getCptePartDo().setTpType("");
		
		requestPreSaisie.getACreer().setDateAExecuter("20220726");//TODO voir la date d'ou on peu la recuperer a jouter par adria
		requestPreSaisie.getACreer().setHeureDemandePreSaisie("124600");//TODO voir d'ou on peu la recuperer a ajouter par adria
		requestPreSaisie.getACreer().setDateDemandePreSaisie(isTransfert?transfert.getSendingDate():miseAdisposition.getSendingDate());
		requestPreSaisie.getACreer().setDebitImmediat((short)0);
		requestPreSaisie.getACreer().setDeviseTransfert(isTransfert?transfert.getCurrencyBeneficiary():"MAD");
		requestPreSaisie.getACreer().setEtatPreSaisie(0);
		requestPreSaisie.getACreer().setFraisACharge(isTransfert?transfert.getCostsAtPaid():miseAdisposition.getCostsAtPaid());
		requestPreSaisie.getACreer().setLbMotif1("");
		requestPreSaisie.getACreer().setLbMotif2("");
		requestPreSaisie.getACreer().setLbMotif3("");
		requestPreSaisie.getACreer().setLbMotif4("");
		
		TypeTarification tarification=new TypeTarification();
		tarification.setDeviseTarification(response.getPartenaireApiDto().getCdDevContrat());
		tarification.setMontantTarifHT(0);
		tarification.setMontantTarifTTC(0);
		tarification.setMontantTarifTVA(0);
		tarification.setLibelleTarification("");
		tarification.setCodeTarification("");
		requestPreSaisie.getACreer().getListeTarifications().add(tarification);
		
		requestPreSaisie.getACreer().setMontantTransfert(isTransfert?transfert.getAmount():miseAdisposition.getAmount());
		requestPreSaisie.getACreer().setNomBeneficiaire(isTransfert?transfert.getBeneficiaryName():miseAdisposition.getBeneficiaryName());
		requestPreSaisie.getACreer().setNomBanqueIntermediaire("");
		requestPreSaisie.getACreer().setReferenceRemettant(isTransfert?transfert.getAdriaReference():miseAdisposition.getAdriaReference());
		requestPreSaisie.getACreer().setTypePreSaisie("103");
		requestPreSaisie.getACreer().setTypeTransfert("01");
		return requestPreSaisie;

	}
	

}
