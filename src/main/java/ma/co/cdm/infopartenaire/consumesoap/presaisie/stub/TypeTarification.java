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
 * <p>Classe Java pour typeTarification complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeTarification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeTarification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviseTarification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="libelleTarification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montantTarifHT" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="montantTarifTTC" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="montantTarifTVA" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTarification", propOrder = {
    "codeTarification",
    "deviseTarification",
    "libelleTarification",
    "montantTarifHT",
    "montantTarifTTC",
    "montantTarifTVA"
})
public class TypeTarification {

    protected String codeTarification;
    protected String deviseTarification;
    protected String libelleTarification;
    protected double montantTarifHT;
    protected double montantTarifTTC;
    protected double montantTarifTVA;

    /**
     * Obtient la valeur de la propriété codeTarification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeTarification() {
        return codeTarification;
    }

    /**
     * Définit la valeur de la propriété codeTarification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeTarification(String value) {
        this.codeTarification = value;
    }

    /**
     * Obtient la valeur de la propriété deviseTarification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviseTarification() {
        return deviseTarification;
    }

    /**
     * Définit la valeur de la propriété deviseTarification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviseTarification(String value) {
        this.deviseTarification = value;
    }

    /**
     * Obtient la valeur de la propriété libelleTarification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelleTarification() {
        return libelleTarification;
    }

    /**
     * Définit la valeur de la propriété libelleTarification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelleTarification(String value) {
        this.libelleTarification = value;
    }

    /**
     * Obtient la valeur de la propriété montantTarifHT.
     * 
     */
    public double getMontantTarifHT() {
        return montantTarifHT;
    }

    /**
     * Définit la valeur de la propriété montantTarifHT.
     * 
     */
    public void setMontantTarifHT(double value) {
        this.montantTarifHT = value;
    }

    /**
     * Obtient la valeur de la propriété montantTarifTTC.
     * 
     */
    public double getMontantTarifTTC() {
        return montantTarifTTC;
    }

    /**
     * Définit la valeur de la propriété montantTarifTTC.
     * 
     */
    public void setMontantTarifTTC(double value) {
        this.montantTarifTTC = value;
    }

    /**
     * Obtient la valeur de la propriété montantTarifTVA.
     * 
     */
    public double getMontantTarifTVA() {
        return montantTarifTVA;
    }

    /**
     * Définit la valeur de la propriété montantTarifTVA.
     * 
     */
    public void setMontantTarifTVA(double value) {
        this.montantTarifTVA = value;
    }

}
