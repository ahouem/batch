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
 * <p>Classe Java pour visuPSChangeComptantV21SP2Out complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="visuPSChangeComptantV21SP2Out"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="preSaisieChangeComptant" type="{http://wspsaisi_j.webservices.natsys.fr/}PreSaisieChangeComptantV21SP2" minOccurs="0"/&gt;
 *         &lt;element name="retour" type="{http://wspsaisi_j.webservices.natsys.fr/}typeReponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "visuPSChangeComptantV21SP2Out", propOrder = {
    "preSaisieChangeComptant",
    "retour"
})
public class VisuPSChangeComptantV21SP2Out {

    protected PreSaisieChangeComptantV21SP2 preSaisieChangeComptant;
    protected TypeReponse retour;

    /**
     * Obtient la valeur de la propriété preSaisieChangeComptant.
     * 
     * @return
     *     possible object is
     *     {@link PreSaisieChangeComptantV21SP2 }
     *     
     */
    public PreSaisieChangeComptantV21SP2 getPreSaisieChangeComptant() {
        return preSaisieChangeComptant;
    }

    /**
     * Définit la valeur de la propriété preSaisieChangeComptant.
     * 
     * @param value
     *     allowed object is
     *     {@link PreSaisieChangeComptantV21SP2 }
     *     
     */
    public void setPreSaisieChangeComptant(PreSaisieChangeComptantV21SP2 value) {
        this.preSaisieChangeComptant = value;
    }

    /**
     * Obtient la valeur de la propriété retour.
     * 
     * @return
     *     possible object is
     *     {@link TypeReponse }
     *     
     */
    public TypeReponse getRetour() {
        return retour;
    }

    /**
     * Définit la valeur de la propriété retour.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReponse }
     *     
     */
    public void setRetour(TypeReponse value) {
        this.retour = value;
    }

}
