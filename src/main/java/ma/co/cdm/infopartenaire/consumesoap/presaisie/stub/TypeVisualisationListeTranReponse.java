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
 * <p>Classe Java pour typeVisualisationListeTranReponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeVisualisationListeTranReponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listePreSaisiesTransfert" type="{http://wspsaisi_j.webservices.natsys.fr/}typePreSaisieTransfert" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "typeVisualisationListeTranReponse", propOrder = {
    "listePreSaisiesTransfert",
    "reponse"
})
public class TypeVisualisationListeTranReponse {

    protected List<TypePreSaisieTransfert> listePreSaisiesTransfert;
    protected TypeReponse reponse;

    /**
     * Gets the value of the listePreSaisiesTransfert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listePreSaisiesTransfert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListePreSaisiesTransfert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypePreSaisieTransfert }
     * 
     * 
     */
    public List<TypePreSaisieTransfert> getListePreSaisiesTransfert() {
        if (listePreSaisiesTransfert == null) {
            listePreSaisiesTransfert = new ArrayList<TypePreSaisieTransfert>();
        }
        return this.listePreSaisiesTransfert;
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
