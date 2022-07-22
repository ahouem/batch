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
 * <p>Classe Java pour typeDemandeTarificationReponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeDemandeTarificationReponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateValeurClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listeTarifications" type="{http://wspsaisi_j.webservices.natsys.fr/}typeTarification" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "typeDemandeTarificationReponse", propOrder = {
    "dateValeurClient",
    "listeTarifications",
    "reponse"
})
public class TypeDemandeTarificationReponse {

    protected String dateValeurClient;
    protected List<TypeTarification> listeTarifications;
    protected TypeReponse reponse;

    /**
     * Obtient la valeur de la propriété dateValeurClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateValeurClient() {
        return dateValeurClient;
    }

    /**
     * Définit la valeur de la propriété dateValeurClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateValeurClient(String value) {
        this.dateValeurClient = value;
    }

    /**
     * Gets the value of the listeTarifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeTarifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListeTarifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTarification }
     * 
     * 
     */
    public List<TypeTarification> getListeTarifications() {
        if (listeTarifications == null) {
            listeTarifications = new ArrayList<TypeTarification>();
        }
        return this.listeTarifications;
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
