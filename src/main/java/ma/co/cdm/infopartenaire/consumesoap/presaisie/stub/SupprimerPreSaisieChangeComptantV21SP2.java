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
 * <p>Classe Java pour supprimerPreSaisieChangeComptantV21SP2 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="supprimerPreSaisieChangeComptantV21SP2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aSupprimer" type="{http://wspsaisi_j.webservices.natsys.fr/}PreSaisieChangeComptantV21SP2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supprimerPreSaisieChangeComptantV21SP2", propOrder = {
    "aSupprimer"
})
public class SupprimerPreSaisieChangeComptantV21SP2 {

    protected PreSaisieChangeComptantV21SP2 aSupprimer;

    /**
     * Obtient la valeur de la propriété aSupprimer.
     * 
     * @return
     *     possible object is
     *     {@link PreSaisieChangeComptantV21SP2 }
     *     
     */
    public PreSaisieChangeComptantV21SP2 getASupprimer() {
        return aSupprimer;
    }

    /**
     * Définit la valeur de la propriété aSupprimer.
     * 
     * @param value
     *     allowed object is
     *     {@link PreSaisieChangeComptantV21SP2 }
     *     
     */
    public void setASupprimer(PreSaisieChangeComptantV21SP2 value) {
        this.aSupprimer = value;
    }

}
