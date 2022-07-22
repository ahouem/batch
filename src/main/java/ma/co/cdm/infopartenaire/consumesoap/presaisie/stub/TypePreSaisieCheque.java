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
 * <p>Classe Java pour typePreSaisieCheque complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typePreSaisieCheque"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adresseTire2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adresseTire3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adresseTire4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="banqueTire1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="banqueTire2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="banqueTire3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="banqueTire4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bicCouverture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeAgence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeBDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeEtablissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codePays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codePreSaisie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="compteTarification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditImmediat" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="dateTraitement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateValeurClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviseCheque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviseCompte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etatCheque" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lbMotif1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbMotif2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbMotif3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbMotif4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listeTarifications" type="{http://wspsaisi_j.webservices.natsys.fr/}typeTarification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="montantCheque" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="nomAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomDocInit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomTire1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroCheque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroCompte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroRemise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceRapprochement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeCheque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typePreSaisieCheque", propOrder = {
    "adresseTire2",
    "adresseTire3",
    "adresseTire4",
    "banqueTire1",
    "banqueTire2",
    "banqueTire3",
    "banqueTire4",
    "bicCouverture",
    "codeAgence",
    "codeBDF",
    "codeEtablissement",
    "codePays",
    "codePreSaisie",
    "compteTarification",
    "creditImmediat",
    "dateTraitement",
    "dateValeurClient",
    "deviseCheque",
    "deviseCompte",
    "etatCheque",
    "lbMotif1",
    "lbMotif2",
    "lbMotif3",
    "lbMotif4",
    "listeTarifications",
    "montantCheque",
    "nomAgent",
    "nomDocInit",
    "nomTire1",
    "numeroCheque",
    "numeroCompte",
    "numeroRemise",
    "referenceRapprochement",
    "typeCheque"
})
public class TypePreSaisieCheque {

    protected String adresseTire2;
    protected String adresseTire3;
    protected String adresseTire4;
    protected String banqueTire1;
    protected String banqueTire2;
    protected String banqueTire3;
    protected String banqueTire4;
    protected String bicCouverture;
    protected String codeAgence;
    protected String codeBDF;
    protected String codeEtablissement;
    protected String codePays;
    protected String codePreSaisie;
    protected String compteTarification;
    protected short creditImmediat;
    protected String dateTraitement;
    protected String dateValeurClient;
    protected String deviseCheque;
    protected String deviseCompte;
    protected int etatCheque;
    protected String lbMotif1;
    protected String lbMotif2;
    protected String lbMotif3;
    protected String lbMotif4;
    protected List<TypeTarification> listeTarifications;
    protected double montantCheque;
    protected String nomAgent;
    protected String nomDocInit;
    protected String nomTire1;
    protected String numeroCheque;
    protected String numeroCompte;
    protected String numeroRemise;
    protected String referenceRapprochement;
    protected String typeCheque;

    /**
     * Obtient la valeur de la propriété adresseTire2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseTire2() {
        return adresseTire2;
    }

    /**
     * Définit la valeur de la propriété adresseTire2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseTire2(String value) {
        this.adresseTire2 = value;
    }

    /**
     * Obtient la valeur de la propriété adresseTire3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseTire3() {
        return adresseTire3;
    }

    /**
     * Définit la valeur de la propriété adresseTire3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseTire3(String value) {
        this.adresseTire3 = value;
    }

    /**
     * Obtient la valeur de la propriété adresseTire4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseTire4() {
        return adresseTire4;
    }

    /**
     * Définit la valeur de la propriété adresseTire4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseTire4(String value) {
        this.adresseTire4 = value;
    }

    /**
     * Obtient la valeur de la propriété banqueTire1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanqueTire1() {
        return banqueTire1;
    }

    /**
     * Définit la valeur de la propriété banqueTire1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanqueTire1(String value) {
        this.banqueTire1 = value;
    }

    /**
     * Obtient la valeur de la propriété banqueTire2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanqueTire2() {
        return banqueTire2;
    }

    /**
     * Définit la valeur de la propriété banqueTire2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanqueTire2(String value) {
        this.banqueTire2 = value;
    }

    /**
     * Obtient la valeur de la propriété banqueTire3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanqueTire3() {
        return banqueTire3;
    }

    /**
     * Définit la valeur de la propriété banqueTire3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanqueTire3(String value) {
        this.banqueTire3 = value;
    }

    /**
     * Obtient la valeur de la propriété banqueTire4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanqueTire4() {
        return banqueTire4;
    }

    /**
     * Définit la valeur de la propriété banqueTire4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanqueTire4(String value) {
        this.banqueTire4 = value;
    }

    /**
     * Obtient la valeur de la propriété bicCouverture.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBicCouverture() {
        return bicCouverture;
    }

    /**
     * Définit la valeur de la propriété bicCouverture.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBicCouverture(String value) {
        this.bicCouverture = value;
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
     * Obtient la valeur de la propriété codeBDF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeBDF() {
        return codeBDF;
    }

    /**
     * Définit la valeur de la propriété codeBDF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeBDF(String value) {
        this.codeBDF = value;
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
     * Obtient la valeur de la propriété compteTarification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompteTarification() {
        return compteTarification;
    }

    /**
     * Définit la valeur de la propriété compteTarification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompteTarification(String value) {
        this.compteTarification = value;
    }

    /**
     * Obtient la valeur de la propriété creditImmediat.
     * 
     */
    public short getCreditImmediat() {
        return creditImmediat;
    }

    /**
     * Définit la valeur de la propriété creditImmediat.
     * 
     */
    public void setCreditImmediat(short value) {
        this.creditImmediat = value;
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
     * Obtient la valeur de la propriété dateValeurClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateValeurClient() {
        return dateValeurClient;
    }

    /**
     * Définit la valeur de la propriété dateValeurClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateValeurClient(String value) {
        this.dateValeurClient = value;
    }

    /**
     * Obtient la valeur de la propriété deviseCheque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviseCheque() {
        return deviseCheque;
    }

    /**
     * Définit la valeur de la propriété deviseCheque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviseCheque(String value) {
        this.deviseCheque = value;
    }

    /**
     * Obtient la valeur de la propriété deviseCompte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviseCompte() {
        return deviseCompte;
    }

    /**
     * Définit la valeur de la propriété deviseCompte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviseCompte(String value) {
        this.deviseCompte = value;
    }

    /**
     * Obtient la valeur de la propriété etatCheque.
     * 
     */
    public int getEtatCheque() {
        return etatCheque;
    }

    /**
     * Définit la valeur de la propriété etatCheque.
     * 
     */
    public void setEtatCheque(int value) {
        this.etatCheque = value;
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
     * Gets the value of the listeTarifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeTarifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListeTarifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTarification }
     * 
     * 
     */
    public List<TypeTarification> getListeTarifications() {
        if (listeTarifications == null) {
            listeTarifications = new ArrayList<TypeTarification>();
        }
        return this.listeTarifications;
    }

    /**
     * Obtient la valeur de la propriété montantCheque.
     * 
     */
    public double getMontantCheque() {
        return montantCheque;
    }

    /**
     * Définit la valeur de la propriété montantCheque.
     * 
     */
    public void setMontantCheque(double value) {
        this.montantCheque = value;
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
     * Obtient la valeur de la propriété nomTire1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomTire1() {
        return nomTire1;
    }

    /**
     * Définit la valeur de la propriété nomTire1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomTire1(String value) {
        this.nomTire1 = value;
    }

    /**
     * Obtient la valeur de la propriété numeroCheque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCheque() {
        return numeroCheque;
    }

    /**
     * Définit la valeur de la propriété numeroCheque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCheque(String value) {
        this.numeroCheque = value;
    }

    /**
     * Obtient la valeur de la propriété numeroCompte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCompte() {
        return numeroCompte;
    }

    /**
     * Définit la valeur de la propriété numeroCompte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCompte(String value) {
        this.numeroCompte = value;
    }

    /**
     * Obtient la valeur de la propriété numeroRemise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRemise() {
        return numeroRemise;
    }

    /**
     * Définit la valeur de la propriété numeroRemise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRemise(String value) {
        this.numeroRemise = value;
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
     * Obtient la valeur de la propriété typeCheque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCheque() {
        return typeCheque;
    }

    /**
     * Définit la valeur de la propriété typeCheque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCheque(String value) {
        this.typeCheque = value;
    }

}
