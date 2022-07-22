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
 * <p>Classe Java pour visuLstChangeCptV21SP2Out complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="visuLstChangeCptV21SP2Out"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="preSaisieChangeComptant" type="{http://wspsaisi_j.webservices.natsys.fr/}PreSaisieChangeComptantV21SP2" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "visuLstChangeCptV21SP2Out", propOrder = {
    "preSaisieChangeComptant",
    "retour"
})
public class VisuLstChangeCptV21SP2Out {

    protected List<PreSaisieChangeComptantV21SP2> preSaisieChangeComptant;
    protected TypeReponse retour;

    /**
     * Gets the value of the preSaisieChangeComptant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preSaisieChangeComptant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreSaisieChangeComptant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreSaisieChangeComptantV21SP2 }
     * 
     * 
     */
    public List<PreSaisieChangeComptantV21SP2> getPreSaisieChangeComptant() {
        if (preSaisieChangeComptant == null) {
            preSaisieChangeComptant = new ArrayList<PreSaisieChangeComptantV21SP2>();
        }
        return this.preSaisieChangeComptant;
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
