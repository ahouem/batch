//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2022.07.08 à 06:02:20 PM WET 
//


package ma.co.cdm.infopartenaire.consumesoap.presaisie.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PreSaisieChangeComptantV21SP2 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PreSaisieChangeComptantV21SP2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeAgence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeEconomique" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeEntiteBeneficiaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeEtablissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeOrigine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codePays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codePreSaisie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="compteCredit" type="{http://wspsaisi_j.webservices.natsys.fr/}cptePart" minOccurs="0"/&gt;
 *         &lt;element name="compteDebit" type="{http://wspsaisi_j.webservices.natsys.fr/}cptePart" minOccurs="0"/&gt;
 *         &lt;element name="coursBanque" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="coursClient" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="cptePartDom" type="{http://wspsaisi_j.webservices.natsys.fr/}cptePart" minOccurs="0"/&gt;
 *         &lt;element name="dateDemandePresaisie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateTraitement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviseOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="erreurAutomatisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etatPreSaisie" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="heureDemandePresaisie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="infoAgence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="infoComplementaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="infoNonAutomatisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbMotif1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbMotif2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbMotif3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbMotif4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montantOperation" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="nomAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomDocInit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceAgence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceApurement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceEconomique" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceRapprochement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeCours" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="typeOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typePreSaisie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeTarification" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreSaisieChangeComptantV21SP2", propOrder = {
    "codeAgence",
    "codeEconomique",
    "codeEntiteBeneficiaire",
    "codeEtablissement",
    "codeOrigine",
    "codePays",
    "codePreSaisie",
    "compteCredit",
    "compteDebit",
    "coursBanque",
    "coursClient",
    "cptePartDom",
    "dateDemandePresaisie",
    "dateTraitement",
    "deviseOperation",
    "erreurAutomatisation",
    "etatPreSaisie",
    "heureDemandePresaisie",
    "infoAgence",
    "infoComplementaire",
    "infoNonAutomatisation",
    "lbMotif1",
    "lbMotif2",
    "lbMotif3",
    "lbMotif4",
    "montantOperation",
    "nomAgent",
    "nomDocInit",
    "referenceAgence",
    "referenceApurement",
    "referenceEconomique",
    "referenceRapprochement",
    "typeCours",
    "typeOperation",
    "typePreSaisie",
    "typeTarification"
})
public class PreSaisieChangeComptantV21SP2 {

    protected String codeAgence;
    protected String codeEconomique;
    protected String codeEntiteBeneficiaire;
    protected String codeEtablissement;
    protected String codeOrigine;
    protected String codePays;
    protected String codePreSaisie;
    protected CptePart compteCredit;
    protected CptePart compteDebit;
    protected double coursBanque;
    protected double coursClient;
    protected CptePart cptePartDom;
    protected String dateDemandePresaisie;
    protected String dateTraitement;
    protected String deviseOperation;
    protected String erreurAutomatisation;
    protected short etatPreSaisie;
    protected String heureDemandePresaisie;
    protected String infoAgence;
    protected String infoComplementaire;
    protected String infoNonAutomatisation;
    protected String lbMotif1;
    protected String lbMotif2;
    protected String lbMotif3;
    protected String lbMotif4;
    protected double montantOperation;
    protected String nomAgent;
    protected String nomDocInit;
    protected String referenceAgence;
    protected String referenceApurement;
    protected String referenceEconomique;
    protected String referenceRapprochement;
    protected short typeCours;
    protected String typeOperation;
    protected String typePreSaisie;
    protected short typeTarification;

    /**
     * Obtient la valeur de la propriété codeAgence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeAgence() {
        return codeAgence;
    }

    /**
     * Définit la valeur de la propriété codeAgence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeAgence(String value) {
        this.codeAgence = value;
    }

    /**
     * Obtient la valeur de la propriété codeEconomique.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeEconomique() {
        return codeEconomique;
    }

    /**
     * Définit la valeur de la propriété codeEconomique.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeEconomique(String value) {
        this.codeEconomique = value;
    }

    /**
     * Obtient la valeur de la propriété codeEntiteBeneficiaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeEntiteBeneficiaire() {
        return codeEntiteBeneficiaire;
    }

    /**
     * Définit la valeur de la propriété codeEntiteBeneficiaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeEntiteBeneficiaire(String value) {
        this.codeEntiteBeneficiaire = value;
    }

    /**
     * Obtient la valeur de la propriété codeEtablissement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeEtablissement() {
        return codeEtablissement;
    }

    /**
     * Définit la valeur de la propriété codeEtablissement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeEtablissement(String value) {
        this.codeEtablissement = value;
    }

    /**
     * Obtient la valeur de la propriété codeOrigine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeOrigine() {
        return codeOrigine;
    }

    /**
     * Définit la valeur de la propriété codeOrigine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeOrigine(String value) {
        this.codeOrigine = value;
    }

    /**
     * Obtient la valeur de la propriété codePays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePays() {
        return codePays;
    }

    /**
     * Définit la valeur de la propriété codePays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePays(String value) {
        this.codePays = value;
    }

    /**
     * Obtient la valeur de la propriété codePreSaisie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePreSaisie() {
        return codePreSaisie;
    }

    /**
     * Définit la valeur de la propriété codePreSaisie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePreSaisie(String value) {
        this.codePreSaisie = value;
    }

    /**
     * Obtient la valeur de la propriété compteCredit.
     * 
     * @return
     *     possible object is
     *     {@link CptePart }
     *     
     */
    public CptePart getCompteCredit() {
        return compteCredit;
    }

    /**
     * Définit la valeur de la propriété compteCredit.
     * 
     * @param value
     *     allowed object is
     *     {@link CptePart }
     *     
     */
    public void setCompteCredit(CptePart value) {
        this.compteCredit = value;
    }

    /**
     * Obtient la valeur de la propriété compteDebit.
     * 
     * @return
     *     possible object is
     *     {@link CptePart }
     *     
     */
    public CptePart getCompteDebit() {
        return compteDebit;
    }

    /**
     * Définit la valeur de la propriété compteDebit.
     * 
     * @param value
     *     allowed object is
     *     {@link CptePart }
     *     
     */
    public void setCompteDebit(CptePart value) {
        this.compteDebit = value;
    }

    /**
     * Obtient la valeur de la propriété coursBanque.
     * 
     */
    public double getCoursBanque() {
        return coursBanque;
    }

    /**
     * Définit la valeur de la propriété coursBanque.
     * 
     */
    public void setCoursBanque(double value) {
        this.coursBanque = value;
    }

    /**
     * Obtient la valeur de la propriété coursClient.
     * 
     */
    public double getCoursClient() {
        return coursClient;
    }

    /**
     * Définit la valeur de la propriété coursClient.
     * 
     */
    public void setCoursClient(double value) {
        this.coursClient = value;
    }

    /**
     * Obtient la valeur de la propriété cptePartDom.
     * 
     * @return
     *     possible object is
     *     {@link CptePart }
     *     
     */
    public CptePart getCptePartDom() {
        return cptePartDom;
    }

    /**
     * Définit la valeur de la propriété cptePartDom.
     * 
     * @param value
     *     allowed object is
     *     {@link CptePart }
     *     
     */
    public void setCptePartDom(CptePart value) {
        this.cptePartDom = value;
    }

    /**
     * Obtient la valeur de la propriété dateDemandePresaisie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDemandePresaisie() {
        return dateDemandePresaisie;
    }

    /**
     * Définit la valeur de la propriété dateDemandePresaisie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDemandePresaisie(String value) {
        this.dateDemandePresaisie = value;
    }

    /**
     * Obtient la valeur de la propriété dateTraitement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTraitement() {
        return dateTraitement;
    }

    /**
     * Définit la valeur de la propriété dateTraitement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTraitement(String value) {
        this.dateTraitement = value;
    }

    /**
     * Obtient la valeur de la propriété deviseOperation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviseOperation() {
        return deviseOperation;
    }

    /**
     * Définit la valeur de la propriété deviseOperation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviseOperation(String value) {
        this.deviseOperation = value;
    }

    /**
     * Obtient la valeur de la propriété erreurAutomatisation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErreurAutomatisation() {
        return erreurAutomatisation;
    }

    /**
     * Définit la valeur de la propriété erreurAutomatisation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErreurAutomatisation(String value) {
        this.erreurAutomatisation = value;
    }

    /**
     * Obtient la valeur de la propriété etatPreSaisie.
     * 
     */
    public short getEtatPreSaisie() {
        return etatPreSaisie;
    }

    /**
     * Définit la valeur de la propriété etatPreSaisie.
     * 
     */
    public void setEtatPreSaisie(short value) {
        this.etatPreSaisie = value;
    }

    /**
     * Obtient la valeur de la propriété heureDemandePresaisie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeureDemandePresaisie() {
        return heureDemandePresaisie;
    }

    /**
     * Définit la valeur de la propriété heureDemandePresaisie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeureDemandePresaisie(String value) {
        this.heureDemandePresaisie = value;
    }

    /**
     * Obtient la valeur de la propriété infoAgence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoAgence() {
        return infoAgence;
    }

    /**
     * Définit la valeur de la propriété infoAgence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoAgence(String value) {
        this.infoAgence = value;
    }

    /**
     * Obtient la valeur de la propriété infoComplementaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoComplementaire() {
        return infoComplementaire;
    }

    /**
     * Définit la valeur de la propriété infoComplementaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoComplementaire(String value) {
        this.infoComplementaire = value;
    }

    /**
     * Obtient la valeur de la propriété infoNonAutomatisation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoNonAutomatisation() {
        return infoNonAutomatisation;
    }

    /**
     * Définit la valeur de la propriété infoNonAutomatisation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoNonAutomatisation(String value) {
        this.infoNonAutomatisation = value;
    }

    /**
     * Obtient la valeur de la propriété lbMotif1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbMotif1() {
        return lbMotif1;
    }

    /**
     * Définit la valeur de la propriété lbMotif1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbMotif1(String value) {
        this.lbMotif1 = value;
    }

    /**
     * Obtient la valeur de la propriété lbMotif2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbMotif2() {
        return lbMotif2;
    }

    /**
     * Définit la valeur de la propriété lbMotif2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbMotif2(String value) {
        this.lbMotif2 = value;
    }

    /**
     * Obtient la valeur de la propriété lbMotif3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbMotif3() {
        return lbMotif3;
    }

    /**
     * Définit la valeur de la propriété lbMotif3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbMotif3(String value) {
        this.lbMotif3 = value;
    }

    /**
     * Obtient la valeur de la propriété lbMotif4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbMotif4() {
        return lbMotif4;
    }

    /**
     * Définit la valeur de la propriété lbMotif4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbMotif4(String value) {
        this.lbMotif4 = value;
    }

    /**
     * Obtient la valeur de la propriété montantOperation.
     * 
     */
    public double getMontantOperation() {
        return montantOperation;
    }

    /**
     * Définit la valeur de la propriété montantOperation.
     * 
     */
    public void setMontantOperation(double value) {
        this.montantOperation = value;
    }

    /**
     * Obtient la valeur de la propriété nomAgent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomAgent() {
        return nomAgent;
    }

    /**
     * Définit la valeur de la propriété nomAgent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomAgent(String value) {
        this.nomAgent = value;
    }

    /**
     * Obtient la valeur de la propriété nomDocInit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomDocInit() {
        return nomDocInit;
    }

    /**
     * Définit la valeur de la propriété nomDocInit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomDocInit(String value) {
        this.nomDocInit = value;
    }

    /**
     * Obtient la valeur de la propriété referenceAgence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceAgence() {
        return referenceAgence;
    }

    /**
     * Définit la valeur de la propriété referenceAgence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceAgence(String value) {
        this.referenceAgence = value;
    }

    /**
     * Obtient la valeur de la propriété referenceApurement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceApurement() {
        return referenceApurement;
    }

    /**
     * Définit la valeur de la propriété referenceApurement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceApurement(String value) {
        this.referenceApurement = value;
    }

    /**
     * Obtient la valeur de la propriété referenceEconomique.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceEconomique() {
        return referenceEconomique;
    }

    /**
     * Définit la valeur de la propriété referenceEconomique.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceEconomique(String value) {
        this.referenceEconomique = value;
    }

    /**
     * Obtient la valeur de la propriété referenceRapprochement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceRapprochement() {
        return referenceRapprochement;
    }

    /**
     * Définit la valeur de la propriété referenceRapprochement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceRapprochement(String value) {
        this.referenceRapprochement = value;
    }

    /**
     * Obtient la valeur de la propriété typeCours.
     * 
     */
    public short getTypeCours() {
        return typeCours;
    }

    /**
     * Définit la valeur de la propriété typeCours.
     * 
     */
    public void setTypeCours(short value) {
        this.typeCours = value;
    }

    /**
     * Obtient la valeur de la propriété typeOperation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOperation() {
        return typeOperation;
    }

    /**
     * Définit la valeur de la propriété typeOperation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOperation(String value) {
        this.typeOperation = value;
    }

    /**
     * Obtient la valeur de la propriété typePreSaisie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypePreSaisie() {
        return typePreSaisie;
    }

    /**
     * Définit la valeur de la propriété typePreSaisie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypePreSaisie(String value) {
        this.typePreSaisie = value;
    }

    /**
     * Obtient la valeur de la propriété typeTarification.
     * 
     */
    public short getTypeTarification() {
        return typeTarification;
    }

    /**
     * Définit la valeur de la propriété typeTarification.
     * 
     */
    public void setTypeTarification(short value) {
        this.typeTarification = value;
    }

}
