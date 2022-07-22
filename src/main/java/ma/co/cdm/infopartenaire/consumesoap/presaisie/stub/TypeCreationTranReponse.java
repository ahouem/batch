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
 * <p>Classe Java pour typeCreationTranReponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeCreationTranReponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codePreSaisieIB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="erreurMess" type="{http://wspsaisi_j.webservices.natsys.fr/}messWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeCreationTranReponse", propOrder = {
    "codePreSaisieIB",
    "erreurMess"
})
public class TypeCreationTranReponse {

    protected String codePreSaisieIB;
    protected MessWs erreurMess;

    /**
     * Obtient la valeur de la propriété codePreSaisieIB.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePreSaisieIB() {
        return codePreSaisieIB;
    }

    /**
     * Définit la valeur de la propriété codePreSaisieIB.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePreSaisieIB(String value) {
        this.codePreSaisieIB = value;
    }

    /**
     * Obtient la valeur de la propriété erreurMess.
     * 
     * @return
     *     possible object is
     *     {@link MessWs }
     *     
     */
    public MessWs getErreurMess() {
        return erreurMess;
    }

    /**
     * Définit la valeur de la propriété erreurMess.
     * 
     * @param value
     *     allowed object is
     *     {@link MessWs }
     *     
     */
    public void setErreurMess(MessWs value) {
        this.erreurMess = value;
    }

}
