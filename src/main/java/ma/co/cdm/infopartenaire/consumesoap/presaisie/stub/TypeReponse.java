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
 * <p>Classe Java pour typeReponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeReponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="libelleErreur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retour" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeReponse", propOrder = {
    "libelleErreur",
    "retour"
})
public class TypeReponse {

    protected String libelleErreur;
    protected short retour;

    /**
     * Obtient la valeur de la propriété libelleErreur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelleErreur() {
        return libelleErreur;
    }

    /**
     * Définit la valeur de la propriété libelleErreur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelleErreur(String value) {
        this.libelleErreur = value;
    }

    /**
     * Obtient la valeur de la propriété retour.
     * 
     */
    public short getRetour() {
        return retour;
    }

    /**
     * Définit la valeur de la propriété retour.
     * 
     */
    public void setRetour(short value) {
        this.retour = value;
    }

}
