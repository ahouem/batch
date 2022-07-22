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
 * <p>Classe Java pour typeDemandeTarification complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeDemandeTarification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bmRibe" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="codeDevise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeEtablissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codePays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeProduit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeSupportOrigine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="compteOperation" type="{http://wspsaisi_j.webservices.natsys.fr/}cptePart" minOccurs="0"/&gt;
 *         &lt;element name="compteTarification" type="{http://wspsaisi_j.webservices.natsys.fr/}cptePart" minOccurs="0"/&gt;
 *         &lt;element name="fraisACharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montantOperation" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeDemandeTarification", propOrder = {
    "bmRibe",
    "codeDevise",
    "codeEtablissement",
    "codePays",
    "codeProduit",
    "codeSupportOrigine",
    "compteOperation",
    "compteTarification",
    "fraisACharge",
    "montantOperation"
})
public class TypeDemandeTarification {

    protected short bmRibe;
    protected String codeDevise;
    protected String codeEtablissement;
    protected String codePays;
    protected String codeProduit;
    protected String codeSupportOrigine;
    protected CptePart compteOperation;
    protected CptePart compteTarification;
    protected String fraisACharge;
    protected double montantOperation;

    /**
     * Obtient la valeur de la propriété bmRibe.
     * 
     */
    public short getBmRibe() {
        return bmRibe;
    }

    /**
     * Définit la valeur de la propriété bmRibe.
     * 
     */
    public void setBmRibe(short value) {
        this.bmRibe = value;
    }

    /**
     * Obtient la valeur de la propriété codeDevise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDevise() {
        return codeDevise;
    }

    /**
     * Définit la valeur de la propriété codeDevise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDevise(String value) {
        this.codeDevise = value;
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
     * Obtient la valeur de la propriété codeProduit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeProduit() {
        return codeProduit;
    }

    /**
     * Définit la valeur de la propriété codeProduit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeProduit(String value) {
        this.codeProduit = value;
    }

    /**
     * Obtient la valeur de la propriété codeSupportOrigine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSupportOrigine() {
        return codeSupportOrigine;
    }

    /**
     * Définit la valeur de la propriété codeSupportOrigine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSupportOrigine(String value) {
        this.codeSupportOrigine = value;
    }

    /**
     * Obtient la valeur de la propriété compteOperation.
     * 
     * @return
     *     possible object is
     *     {@link CptePart }
     *     
     */
    public CptePart getCompteOperation() {
        return compteOperation;
    }

    /**
     * Définit la valeur de la propriété compteOperation.
     * 
     * @param value
     *     allowed object is
     *     {@link CptePart }
     *     
     */
    public void setCompteOperation(CptePart value) {
        this.compteOperation = value;
    }

    /**
     * Obtient la valeur de la propriété compteTarification.
     * 
     * @return
     *     possible object is
     *     {@link CptePart }
     *     
     */
    public CptePart getCompteTarification() {
        return compteTarification;
    }

    /**
     * Définit la valeur de la propriété compteTarification.
     * 
     * @param value
     *     allowed object is
     *     {@link CptePart }
     *     
     */
    public void setCompteTarification(CptePart value) {
        this.compteTarification = value;
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

}
