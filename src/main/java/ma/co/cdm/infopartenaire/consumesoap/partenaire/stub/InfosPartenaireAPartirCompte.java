//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2022.07.08 à 06:00:59 PM WET 
//


package ma.co.cdm.infopartenaire.consumesoap.partenaire.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour infosPartenaireAPartirCompte complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="infosPartenaireAPartirCompte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceContextDto" type="{http://infospartenaireapartircompte.replaceable.service.v1_0_0.servicecontract.eib.evolan.sopra.com/}serviceContextDto" minOccurs="0"/&gt;
 *         &lt;element name="numeroCompte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infosPartenaireAPartirCompte", propOrder = {
    "serviceContextDto",
    "numeroCompte"
})
public class InfosPartenaireAPartirCompte {

    protected ServiceContextDto serviceContextDto;
    protected String numeroCompte;

    /**
     * Obtient la valeur de la propriété serviceContextDto.
     * 
     * @return
     *     possible object is
     *     {@link ServiceContextDto }
     *     
     */
    public ServiceContextDto getServiceContextDto() {
        return serviceContextDto;
    }

    /**
     * Définit la valeur de la propriété serviceContextDto.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceContextDto }
     *     
     */
    public void setServiceContextDto(ServiceContextDto value) {
        this.serviceContextDto = value;
    }

    /**
     * Obtient la valeur de la propriété numeroCompte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCompte() {
        return numeroCompte;
    }

    /**
     * Définit la valeur de la propriété numeroCompte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCompte(String value) {
        this.numeroCompte = value;
    }

}
