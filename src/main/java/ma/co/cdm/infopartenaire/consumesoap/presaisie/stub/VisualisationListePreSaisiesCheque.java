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
 * <p>Classe Java pour visualisationListePreSaisiesCheque complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="visualisationListePreSaisiesCheque"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aLister" type="{http://wspsaisi_j.webservices.natsys.fr/}typePreSaisieCheque" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "visualisationListePreSaisiesCheque", propOrder = {
    "aLister"
})
public class VisualisationListePreSaisiesCheque {

    protected TypePreSaisieCheque aLister;

    /**
     * Obtient la valeur de la propriété aLister.
     * 
     * @return
     *     possible object is
     *     {@link TypePreSaisieCheque }
     *     
     */
    public TypePreSaisieCheque getALister() {
        return aLister;
    }

    /**
     * Définit la valeur de la propriété aLister.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePreSaisieCheque }
     *     
     */
    public void setALister(TypePreSaisieCheque value) {
        this.aLister = value;
    }

}
