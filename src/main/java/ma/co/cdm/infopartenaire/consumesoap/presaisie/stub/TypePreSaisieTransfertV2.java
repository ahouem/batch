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
 * <p>Classe Java pour typePreSaisieTransfertV2 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typePreSaisieTransfertV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adresseBanqueBeneficiaire1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adresseBanqueBeneficiaire2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adresseBanqueBeneficiaire3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adresseBanqueIntermediaire1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adresseBanqueIntermediaire2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adresseBanqueIntermediaire3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adresseBeneficiaire1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adresseBeneficiaire2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adresseBeneficiaire3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bicBanqueBeneficiaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bicBanqueIntermediaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeAgence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeBDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeEtablissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeOrigine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codePays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codePreSaisieIB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="compteBeneficiaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="compteTarification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cpteDom" type="{http://wspsaisi_j.webservices.natsys.fr/}cptePart" minOccurs="0"/&gt;
 *         &lt;element name="cptePartDo" type="{http://wspsaisi_j.webservices.natsys.fr/}cptePart" minOccurs="0"/&gt;
 *         &lt;element name="dateAExecuter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateDemandePreSaisie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="debitImmediat" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="deviseTransfert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etatPreSaisie" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fraisACharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="heureDemandePreSaisie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idLocalBanqueBeneficiaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idLocalBeneficiaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="infoAgence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="infoBqABq1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="infoBqABq2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="infoBqABq3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="infoBqABq4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="infoBqABq5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="infoBqABq6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="infoNonAutomatisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbMotif1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbMotif2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbMotif3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbMotif4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listeTarifications" type="{http://wspsaisi_j.webservices.natsys.fr/}typeTarification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="montantTransfert" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="nomAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomBanqueBeneficiaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomBanqueIntermediaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomBeneficiaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceRemettant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typePreSaisie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeTransfert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typePreSaisieTransfertV2", propOrder = {
    "adresseBanqueBeneficiaire1",
    "adresseBanqueBeneficiaire2",
    "adresseBanqueBeneficiaire3",
    "adresseBanqueIntermediaire1",
    "adresseBanqueIntermediaire2",
    "adresseBanqueIntermediaire3",
    "adresseBeneficiaire1",
    "adresseBeneficiaire2",
    "adresseBeneficiaire3",
    "bicBanqueBeneficiaire",
    "bicBanqueIntermediaire",
    "codeAgence",
    "codeAgent",
    "codeBDF",
    "codeEtablissement",
    "codeOrigine",
    "codePays",
    "codePreSaisieIB",
    "compteBeneficiaire",
    "compteTarification",
    "cpteDom",
    "cptePartDo",
    "dateAExecuter",
    "dateDemandePreSaisie",
    "debitImmediat",
    "deviseTransfert",
    "etatPreSaisie",
    "fraisACharge",
    "heureDemandePreSaisie",
    "idLocalBanqueBeneficiaire",
    "idLocalBeneficiaire",
    "infoAgence",
    "infoBqABq1",
    "infoBqABq2",
    "infoBqABq3",
    "infoBqABq4",
    "infoBqABq5",
    "infoBqABq6",
    "infoNonAutomatisation",
    "lbMotif1",
    "lbMotif2",
    "lbMotif3",
    "lbMotif4",
    "listeTarifications",
    "montantTransfert",
    "nomAgent",
    "nomBanqueBeneficiaire",
    "nomBanqueIntermediaire",
    "nomBeneficiaire",
    "referenceRemettant",
    "typePreSaisie",
    "typeTransfert"
})
public class TypePreSaisieTransfertV2 {

    protected String adresseBanqueBeneficiaire1;
    protected String adresseBanqueBeneficiaire2;
    protected String adresseBanqueBeneficiaire3;
    protected String adresseBanqueIntermediaire1;
    protected String adresseBanqueIntermediaire2;
    protected String adresseBanqueIntermediaire3;
    protected String adresseBeneficiaire1;
    protected String adresseBeneficiaire2;
    protected String adresseBeneficiaire3;
    protected String bicBanqueBeneficiaire;
    protected String bicBanqueIntermediaire;
    protected String codeAgence;
    protected String codeAgent;
    protected String codeBDF;
    protected String codeEtablissement;
    protected String codeOrigine;
    protected String codePays;
    protected String codePreSaisieIB;
    protected String compteBeneficiaire;
    protected String compteTarification;
    protected CptePart cpteDom;
    protected CptePart cptePartDo;
    protected String dateAExecuter;
    protected String dateDemandePreSaisie;
    protected short debitImmediat;
    protected String deviseTransfert;
    protected int etatPreSaisie;
    protected String fraisACharge;
    protected String heureDemandePreSaisie;
    protected String idLocalBanqueBeneficiaire;
    protected String idLocalBeneficiaire;
    protected String infoAgence;
    protected String infoBqABq1;
    protected String infoBqABq2;
    protected String infoBqABq3;
    protected String infoBqABq4;
    protected String infoBqABq5;
    protected String infoBqABq6;
    protected String infoNonAutomatisation;
    protected String lbMotif1;
    protected String lbMotif2;
    protected String lbMotif3;
    protected String lbMotif4;
    protected List<TypeTarification> listeTarifications;
    protected double montantTransfert;
    protected String nomAgent;
    protected String nomBanqueBeneficiaire;
    protected String nomBanqueIntermediaire;
    protected String nomBeneficiaire;
    protected String referenceRemettant;
    protected String typePreSaisie;
    protected String typeTransfert;
    
    
    
    

    public TypePreSaisieTransfertV2() {
		super();
		this.adresseBanqueBeneficiaire1="";
		this.adresseBanqueBeneficiaire2="";
		this.adresseBanqueBeneficiaire3="";
		this.adresseBanqueIntermediaire1="";
		this.adresseBanqueIntermediaire2="";
		this.adresseBanqueIntermediaire3="";
		this.adresseBeneficiaire2="";
		this.adresseBeneficiaire3="";
		this.adresseBeneficiaire1="";
		this.bicBanqueIntermediaire="";
		this.codeAgence="";
		this.codeAgent="";
		this.codeBDF="";
		this.codePreSaisieIB="";
		this.compteTarification="";
		this.idLocalBanqueBeneficiaire="";
		this.idLocalBeneficiaire="";
		this.infoAgence="";
		this.infoBqABq1="";
		this.infoBqABq2="";
		this.infoBqABq3="";
		this.infoBqABq4="";
		this.infoBqABq5="";
		this.infoBqABq6="";
		this.infoNonAutomatisation="";
		this.lbMotif1="";
		this.lbMotif2="";
		this.lbMotif3="";
		this.lbMotif4="";
		this.nomAgent="";
		this.nomBanqueBeneficiaire="";
	}

	/**
     * Obtient la valeur de la propriété adresseBanqueBeneficiaire1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseBanqueBeneficiaire1() {
        return adresseBanqueBeneficiaire1;
    }

    /**
     * Définit la valeur de la propriété adresseBanqueBeneficiaire1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseBanqueBeneficiaire1(String value) {
        this.adresseBanqueBeneficiaire1 = value;
    }

    /**
     * Obtient la valeur de la propriété adresseBanqueBeneficiaire2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseBanqueBeneficiaire2() {
        return adresseBanqueBeneficiaire2;
    }

    /**
     * Définit la valeur de la propriété adresseBanqueBeneficiaire2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseBanqueBeneficiaire2(String value) {
        this.adresseBanqueBeneficiaire2 = value;
    }

    /**
     * Obtient la valeur de la propriété adresseBanqueBeneficiaire3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseBanqueBeneficiaire3() {
        return adresseBanqueBeneficiaire3;
    }

    /**
     * Définit la valeur de la propriété adresseBanqueBeneficiaire3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseBanqueBeneficiaire3(String value) {
        this.adresseBanqueBeneficiaire3 = value;
    }

    /**
     * Obtient la valeur de la propriété adresseBanqueIntermediaire1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseBanqueIntermediaire1() {
        return adresseBanqueIntermediaire1;
    }

    /**
     * Définit la valeur de la propriété adresseBanqueIntermediaire1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseBanqueIntermediaire1(String value) {
        this.adresseBanqueIntermediaire1 = value;
    }

    /**
     * Obtient la valeur de la propriété adresseBanqueIntermediaire2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseBanqueIntermediaire2() {
        return adresseBanqueIntermediaire2;
    }

    /**
     * Définit la valeur de la propriété adresseBanqueIntermediaire2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseBanqueIntermediaire2(String value) {
        this.adresseBanqueIntermediaire2 = value;
    }

    /**
     * Obtient la valeur de la propriété adresseBanqueIntermediaire3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseBanqueIntermediaire3() {
        return adresseBanqueIntermediaire3;
    }

    /**
     * Définit la valeur de la propriété adresseBanqueIntermediaire3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseBanqueIntermediaire3(String value) {
        this.adresseBanqueIntermediaire3 = value;
    }

    /**
     * Obtient la valeur de la propriété adresseBeneficiaire1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseBeneficiaire1() {
        return adresseBeneficiaire1;
    }

    /**
     * Définit la valeur de la propriété adresseBeneficiaire1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseBeneficiaire1(String value) {
        this.adresseBeneficiaire1 = value;
    }

    /**
     * Obtient la valeur de la propriété adresseBeneficiaire2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseBeneficiaire2() {
        return adresseBeneficiaire2;
    }

    /**
     * Définit la valeur de la propriété adresseBeneficiaire2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseBeneficiaire2(String value) {
        this.adresseBeneficiaire2 = value;
    }

    /**
     * Obtient la valeur de la propriété adresseBeneficiaire3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseBeneficiaire3() {
        return adresseBeneficiaire3;
    }

    /**
     * Définit la valeur de la propriété adresseBeneficiaire3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseBeneficiaire3(String value) {
        this.adresseBeneficiaire3 = value;
    }

    /**
     * Obtient la valeur de la propriété bicBanqueBeneficiaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBicBanqueBeneficiaire() {
        return bicBanqueBeneficiaire;
    }

    /**
     * Définit la valeur de la propriété bicBanqueBeneficiaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBicBanqueBeneficiaire(String value) {
        this.bicBanqueBeneficiaire = value;
    }

    /**
     * Obtient la valeur de la propriété bicBanqueIntermediaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBicBanqueIntermediaire() {
        return bicBanqueIntermediaire;
    }

    /**
     * Définit la valeur de la propriété bicBanqueIntermediaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBicBanqueIntermediaire(String value) {
        this.bicBanqueIntermediaire = value;
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
     * Obtient la valeur de la propriété codeAgent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeAgent() {
        return codeAgent;
    }

    /**
     * Définit la valeur de la propriété codeAgent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeAgent(String value) {
        this.codeAgent = value;
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
     * Obtient la valeur de la propriété codePreSaisieIB.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePreSaisieIB() {
        return codePreSaisieIB;
    }

    /**
     * Définit la valeur de la propriété codePreSaisieIB.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePreSaisieIB(String value) {
        this.codePreSaisieIB = value;
    }

    /**
     * Obtient la valeur de la propriété compteBeneficiaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompteBeneficiaire() {
        return compteBeneficiaire;
    }

    /**
     * Définit la valeur de la propriété compteBeneficiaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompteBeneficiaire(String value) {
        this.compteBeneficiaire = value;
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
     * Obtient la valeur de la propriété cpteDom.
     * 
     * @return
     *     possible object is
     *     {@link CptePart }
     *     
     */
    public CptePart getCpteDom() {
        return cpteDom;
    }

    /**
     * Définit la valeur de la propriété cpteDom.
     * 
     * @param value
     *     allowed object is
     *     {@link CptePart }
     *     
     */
    public void setCpteDom(CptePart value) {
        this.cpteDom = value;
    }

    /**
     * Obtient la valeur de la propriété cptePartDo.
     * 
     * @return
     *     possible object is
     *     {@link CptePart }
     *     
     */
    public CptePart getCptePartDo() {
        return cptePartDo;
    }

    /**
     * Définit la valeur de la propriété cptePartDo.
     * 
     * @param value
     *     allowed object is
     *     {@link CptePart }
     *     
     */
    public void setCptePartDo(CptePart value) {
        this.cptePartDo = value;
    }

    /**
     * Obtient la valeur de la propriété dateAExecuter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateAExecuter() {
        return dateAExecuter;
    }

    /**
     * Définit la valeur de la propriété dateAExecuter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateAExecuter(String value) {
        this.dateAExecuter = value;
    }

    /**
     * Obtient la valeur de la propriété dateDemandePreSaisie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDemandePreSaisie() {
        return dateDemandePreSaisie;
    }

    /**
     * Définit la valeur de la propriété dateDemandePreSaisie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDemandePreSaisie(String value) {
        this.dateDemandePreSaisie = value;
    }

    /**
     * Obtient la valeur de la propriété debitImmediat.
     * 
     */
    public short getDebitImmediat() {
        return debitImmediat;
    }

    /**
     * Définit la valeur de la propriété debitImmediat.
     * 
     */
    public void setDebitImmediat(short value) {
        this.debitImmediat = value;
    }

    /**
     * Obtient la valeur de la propriété deviseTransfert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviseTransfert() {
        return deviseTransfert;
    }

    /**
     * Définit la valeur de la propriété deviseTransfert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviseTransfert(String value) {
        this.deviseTransfert = value;
    }

    /**
     * Obtient la valeur de la propriété etatPreSaisie.
     * 
     */
    public int getEtatPreSaisie() {
        return etatPreSaisie;
    }

    /**
     * Définit la valeur de la propriété etatPreSaisie.
     * 
     */
    public void setEtatPreSaisie(int value) {
        this.etatPreSaisie = value;
    }

    /**
     * Obtient la valeur de la propriété fraisACharge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraisACharge() {
        return fraisACharge;
    }

    /**
     * Définit la valeur de la propriété fraisACharge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraisACharge(String value) {
        this.fraisACharge = value;
    }

    /**
     * Obtient la valeur de la propriété heureDemandePreSaisie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeureDemandePreSaisie() {
        return heureDemandePreSaisie;
    }

    /**
     * Définit la valeur de la propriété heureDemandePreSaisie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeureDemandePreSaisie(String value) {
        this.heureDemandePreSaisie = value;
    }

    /**
     * Obtient la valeur de la propriété idLocalBanqueBeneficiaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLocalBanqueBeneficiaire() {
        return idLocalBanqueBeneficiaire;
    }

    /**
     * Définit la valeur de la propriété idLocalBanqueBeneficiaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLocalBanqueBeneficiaire(String value) {
        this.idLocalBanqueBeneficiaire = value;
    }

    /**
     * Obtient la valeur de la propriété idLocalBeneficiaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLocalBeneficiaire() {
        return idLocalBeneficiaire;
    }

    /**
     * Définit la valeur de la propriété idLocalBeneficiaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLocalBeneficiaire(String value) {
        this.idLocalBeneficiaire = value;
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
     * Obtient la valeur de la propriété infoBqABq1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoBqABq1() {
        return infoBqABq1;
    }

    /**
     * Définit la valeur de la propriété infoBqABq1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoBqABq1(String value) {
        this.infoBqABq1 = value;
    }

    /**
     * Obtient la valeur de la propriété infoBqABq2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoBqABq2() {
        return infoBqABq2;
    }

    /**
     * Définit la valeur de la propriété infoBqABq2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoBqABq2(String value) {
        this.infoBqABq2 = value;
    }

    /**
     * Obtient la valeur de la propriété infoBqABq3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoBqABq3() {
        return infoBqABq3;
    }

    /**
     * Définit la valeur de la propriété infoBqABq3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoBqABq3(String value) {
        this.infoBqABq3 = value;
    }

    /**
     * Obtient la valeur de la propriété infoBqABq4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoBqABq4() {
        return infoBqABq4;
    }

    /**
     * Définit la valeur de la propriété infoBqABq4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoBqABq4(String value) {
        this.infoBqABq4 = value;
    }

    /**
     * Obtient la valeur de la propriété infoBqABq5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoBqABq5() {
        return infoBqABq5;
    }

    /**
     * Définit la valeur de la propriété infoBqABq5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoBqABq5(String value) {
        this.infoBqABq5 = value;
    }

    /**
     * Obtient la valeur de la propriété infoBqABq6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoBqABq6() {
        return infoBqABq6;
    }

    /**
     * Définit la valeur de la propriété infoBqABq6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoBqABq6(String value) {
        this.infoBqABq6 = value;
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
     * Obtient la valeur de la propriété montantTransfert.
     * 
     */
    public double getMontantTransfert() {
        return montantTransfert;
    }

    /**
     * Définit la valeur de la propriété montantTransfert.
     * 
     */
    public void setMontantTransfert(double value) {
        this.montantTransfert = value;
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
     * Obtient la valeur de la propriété nomBanqueBeneficiaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomBanqueBeneficiaire() {
        return nomBanqueBeneficiaire;
    }

    /**
     * Définit la valeur de la propriété nomBanqueBeneficiaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomBanqueBeneficiaire(String value) {
        this.nomBanqueBeneficiaire = value;
    }

    /**
     * Obtient la valeur de la propriété nomBanqueIntermediaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomBanqueIntermediaire() {
        return nomBanqueIntermediaire;
    }

    /**
     * Définit la valeur de la propriété nomBanqueIntermediaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomBanqueIntermediaire(String value) {
        this.nomBanqueIntermediaire = value;
    }

    /**
     * Obtient la valeur de la propriété nomBeneficiaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomBeneficiaire() {
        return nomBeneficiaire;
    }

    /**
     * Définit la valeur de la propriété nomBeneficiaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomBeneficiaire(String value) {
        this.nomBeneficiaire = value;
    }

    /**
     * Obtient la valeur de la propriété referenceRemettant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceRemettant() {
        return referenceRemettant;
    }

    /**
     * Définit la valeur de la propriété referenceRemettant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceRemettant(String value) {
        this.referenceRemettant = value;
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
     * Obtient la valeur de la propriété typeTransfert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeTransfert() {
        return typeTransfert;
    }

    /**
     * Définit la valeur de la propriété typeTransfert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeTransfert(String value) {
        this.typeTransfert = value;
    }

}
