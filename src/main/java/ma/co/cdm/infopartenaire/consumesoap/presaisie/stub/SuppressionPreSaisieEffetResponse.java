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
 * <p>Classe Java pour suppressionPreSaisieEffetResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="suppressionPreSaisieEffetResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="suppressionPreSaisieEffetReponse" type="{http://wspsaisi_j.webservices.natsys.fr/}typeReponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suppressionPreSaisieEffetResponse", propOrder = {
    "suppressionPreSaisieEffetReponse"
})
public class SuppressionPreSaisieEffetResponse {

    protected TypeReponse suppressionPreSaisieEffetReponse;

    /**
     * Obtient la valeur de la propriété suppressionPreSaisieEffetReponse.
     * 
     * @return
     *     possible object is
     *     {@link TypeReponse }
     *     
     */
    public TypeReponse getSuppressionPreSaisieEffetReponse() {
        return suppressionPreSaisieEffetReponse;
    }

    /**
     * Définit la valeur de la propriété suppressionPreSaisieEffetReponse.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReponse }
     *     
     */
    public void setSuppressionPreSaisieEffetReponse(TypeReponse value) {
        this.suppressionPreSaisieEffetReponse = value;
    }

}
