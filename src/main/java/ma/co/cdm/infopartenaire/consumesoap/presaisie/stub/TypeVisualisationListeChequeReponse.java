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
 * <p>Classe Java pour typeVisualisationListeChequeReponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeVisualisationListeChequeReponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listePreSaisiesCheque" type="{http://wspsaisi_j.webservices.natsys.fr/}typePreSaisieCheque" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reponseListe" type="{http://wspsaisi_j.webservices.natsys.fr/}typeReponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeVisualisationListeChequeReponse", propOrder = {
    "listePreSaisiesCheque",
    "reponseListe"
})
public class TypeVisualisationListeChequeReponse {

    protected List<TypePreSaisieCheque> listePreSaisiesCheque;
    protected TypeReponse reponseListe;

    /**
     * Gets the value of the listePreSaisiesCheque property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listePreSaisiesCheque property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListePreSaisiesCheque().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypePreSaisieCheque }
     * 
     * 
     */
    public List<TypePreSaisieCheque> getListePreSaisiesCheque() {
        if (listePreSaisiesCheque == null) {
            listePreSaisiesCheque = new ArrayList<TypePreSaisieCheque>();
        }
        return this.listePreSaisiesCheque;
    }

    /**
     * Obtient la valeur de la propriété reponseListe.
     * 
     * @return
     *     possible object is
     *     {@link TypeReponse }
     *     
     */
    public TypeReponse getReponseListe() {
        return reponseListe;
    }

    /**
     * Définit la valeur de la propriété reponseListe.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReponse }
     *     
     */
    public void setReponseListe(TypeReponse value) {
        this.reponseListe = value;
    }

}
