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
 * <p>Classe Java pour visuContratPeriodiqueChOut complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="visuContratPeriodiqueChOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="preSaisieContratPeriodiqueChBean" type="{http://wspsaisi_j.webservices.natsys.fr/}preSaisieContratPeriodiqueCh" minOccurs="0"/&gt;
 *         &lt;element name="reponse" type="{http://wspsaisi_j.webservices.natsys.fr/}typeReponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "visuContratPeriodiqueChOut", propOrder = {
    "preSaisieContratPeriodiqueChBean",
    "reponse"
})
public class VisuContratPeriodiqueChOut {

    protected PreSaisieContratPeriodiqueCh preSaisieContratPeriodiqueChBean;
    protected TypeReponse reponse;

    /**
     * Obtient la valeur de la propriété preSaisieContratPeriodiqueChBean.
     * 
     * @return
     *     possible object is
     *     {@link PreSaisieContratPeriodiqueCh }
     *     
     */
    public PreSaisieContratPeriodiqueCh getPreSaisieContratPeriodiqueChBean() {
        return preSaisieContratPeriodiqueChBean;
    }

    /**
     * Définit la valeur de la propriété preSaisieContratPeriodiqueChBean.
     * 
     * @param value
     *     allowed object is
     *     {@link PreSaisieContratPeriodiqueCh }
     *     
     */
    public void setPreSaisieContratPeriodiqueChBean(PreSaisieContratPeriodiqueCh value) {
        this.preSaisieContratPeriodiqueChBean = value;
    }

    /**
     * Obtient la valeur de la propriété reponse.
     * 
     * @return
     *     possible object is
     *     {@link TypeReponse }
     *     
     */
    public TypeReponse getReponse() {
        return reponse;
    }

    /**
     * Définit la valeur de la propriété reponse.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReponse }
     *     
     */
    public void setReponse(TypeReponse value) {
        this.reponse = value;
    }

}
