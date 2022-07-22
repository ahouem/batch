//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2022.07.08 à 06:02:20 PM WET 
//


package ma.co.cdm.infopartenaire.consumesoap.presaisie.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour preSaisieContratPeriodiqueCh complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="preSaisieContratPeriodiqueCh"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anneeDebutPeriode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeAgence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeEtablissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeExecutionJourFerme" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="codeOrigine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codePreSaisie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="compteCredit" type="{http://wspsaisi_j.webservices.natsys.fr/}cptePart" minOccurs="0"/&gt;
 *         &lt;element name="compteDebit" type="{http://wspsaisi_j.webservices.natsys.fr/}cptePart" minOccurs="0"/&gt;
 *         &lt;element name="cptePartDom" type="{http://wspsaisi_j.webservices.natsys.fr/}cptePart" minOccurs="0"/&gt;
 *         &lt;element name="dateDemandePresaisie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateFinPeriode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateProchaineExecution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviseOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="erreurAutomatisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etatPreSaisie" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="heureDemandePresaisie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="infoAgence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="infoNonAutomatisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jourDebutPeriode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbMotif1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbMotif2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbMotif3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbMotif4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listeDatesFixes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="moisDebutPeriode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montantOperation" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="nomAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomDocInit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceAgence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceRapprochement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typePeriode" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
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
@XmlType(name = "preSaisieContratPeriodiqueCh", propOrder = {
    "anneeDebutPeriode",
    "codeAgence",
    "codeEtablissement",
    "codeExecutionJourFerme",
    "codeOrigine",
    "codePreSaisie",
    "compteCredit",
    "compteDebit",
    "cptePartDom",
    "dateDemandePresaisie",
    "dateFinPeriode",
    "dateProchaineExecution",
    "deviseOperation",
    "erreurAutomatisation",
    "etatPreSaisie",
    "heureDemandePresaisie",
    "infoAgence",
    "infoNonAutomatisation",
    "jourDebutPeriode",
    "lbMotif1",
    "lbMotif2",
    "lbMotif3",
    "lbMotif4",
    "listeDatesFixes",
    "moisDebutPeriode",
    "montantOperation",
    "nomAgent",
    "nomDocInit",
    "referenceAgence",
    "referenceRapprochement",
    "typeContrat",
    "typePeriode",
    "typeTarification"
})
public class PreSaisieContratPeriodiqueCh {

    protected String anneeDebutPeriode;
    protected String codeAgence;
    protected String codeEtablissement;
    protected short codeExecutionJourFerme;
    protected String codeOrigine;
    protected String codePreSaisie;
    protected CptePart compteCredit;
    protected CptePart compteDebit;
    protected CptePart cptePartDom;
    protected String dateDemandePresaisie;
    protected String dateFinPeriode;
    protected String dateProchaineExecution;
    protected String deviseOperation;
    protected String erreurAutomatisation;
    protected short etatPreSaisie;
    protected String heureDemandePresaisie;
    protected String infoAgence;
    protected String infoNonAutomatisation;
    protected String jourDebutPeriode;
    protected String lbMotif1;
    protected String lbMotif2;
    protected String lbMotif3;
    protected String lbMotif4;
    protected List<String> listeDatesFixes;
    protected String moisDebutPeriode;
    protected double montantOperation;
    protected String nomAgent;
    protected String nomDocInit;
    protected String referenceAgence;
    protected String referenceRapprochement;
    protected String typeContrat;
    protected short typePeriode;
    protected short typeTarification;

    /**
     * Obtient la valeur de la propriété anneeDebutPeriode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnneeDebutPeriode() {
        return anneeDebutPeriode;
    }

    /**
     * Définit la valeur de la propriété anneeDebutPeriode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnneeDebutPeriode(String value) {
        this.anneeDebutPeriode = value;
    }

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
     * Obtient la valeur de la propriété codeExecutionJourFerme.
     * 
     */
    public short getCodeExecutionJourFerme() {
        return codeExecutionJourFerme;
    }

    /**
     * Définit la valeur de la propriété codeExecutionJourFerme.
     * 
     */
    public void setCodeExecutionJourFerme(short value) {
        this.codeExecutionJourFerme = value;
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
     * Obtient la valeur de la propriété dateFinPeriode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFinPeriode() {
        return dateFinPeriode;
    }

    /**
     * Définit la valeur de la propriété dateFinPeriode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFinPeriode(String value) {
        this.dateFinPeriode = value;
    }

    /**
     * Obtient la valeur de la propriété dateProchaineExecution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateProchaineExecution() {
        return dateProchaineExecution;
    }

    /**
     * Définit la valeur de la propriété dateProchaineExecution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateProchaineExecution(String value) {
        this.dateProchaineExecution = value;
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
     * Obtient la valeur de la propriété jourDebutPeriode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourDebutPeriode() {
        return jourDebutPeriode;
    }

    /**
     * Définit la valeur de la propriété jourDebutPeriode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourDebutPeriode(String value) {
        this.jourDebutPeriode = value;
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
     * Gets the value of the listeDatesFixes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeDatesFixes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListeDatesFixes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListeDatesFixes() {
        if (listeDatesFixes == null) {
            listeDatesFixes = new ArrayList<String>();
        }
        return this.listeDatesFixes;
    }

    /**
     * Obtient la valeur de la propriété moisDebutPeriode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoisDebutPeriode() {
        return moisDebutPeriode;
    }

    /**
     * Définit la valeur de la propriété moisDebutPeriode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoisDebutPeriode(String value) {
        this.moisDebutPeriode = value;
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
     * Obtient la valeur de la propriété typeContrat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeContrat() {
        return typeContrat;
    }

    /**
     * Définit la valeur de la propriété typeContrat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeContrat(String value) {
        this.typeContrat = value;
    }

    /**
     * Obtient la valeur de la propriété typePeriode.
     * 
     */
    public short getTypePeriode() {
        return typePeriode;
    }

    /**
     * Définit la valeur de la propriété typePeriode.
     * 
     */
    public void setTypePeriode(short value) {
        this.typePeriode = value;
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
