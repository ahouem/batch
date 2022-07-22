//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2022.07.08 à 06:00:59 PM WET 
//


package ma.co.cdm.infopartenaire.consumesoap.partenaire.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ma.co.cdm.infopartenaire.consumesoap.partenaire.stub package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InfosPartenaireAPartirCompte_QNAME = new QName("http://infospartenaireapartircompte.replaceable.service.v1_0_0.servicecontract.eib.evolan.sopra.com/", "infosPartenaireAPartirCompte");
    private final static QName _InfosPartenaireAPartirCompteResponse_QNAME = new QName("http://infospartenaireapartircompte.replaceable.service.v1_0_0.servicecontract.eib.evolan.sopra.com/", "infosPartenaireAPartirCompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ma.co.cdm.infopartenaire.consumesoap.partenaire.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceContextDto }
     * 
     */
    public ServiceContextDto createServiceContextDto() {
        return new ServiceContextDto();
    }

    /**
     * Create an instance of {@link ServiceContextDto.AttributeList }
     * 
     */
    public ServiceContextDto.AttributeList createServiceContextDtoAttributeList() {
        return new ServiceContextDto.AttributeList();
    }

    /**
     * Create an instance of {@link InfosPartenaireAPartirCompte }
     * 
     */
    public InfosPartenaireAPartirCompte createInfosPartenaireAPartirCompte() {
        return new InfosPartenaireAPartirCompte();
    }

    /**
     * Create an instance of {@link InfosPartenaireAPartirCompteResponse }
     * 
     */
    public InfosPartenaireAPartirCompteResponse createInfosPartenaireAPartirCompteResponse() {
        return new InfosPartenaireAPartirCompteResponse();
    }

    /**
     * Create an instance of {@link PartenaireApiDto }
     * 
     */
    public PartenaireApiDto createPartenaireApiDto() {
        return new PartenaireApiDto();
    }

    /**
     * Create an instance of {@link ServiceContextDto.AttributeList.Entry }
     * 
     */
    public ServiceContextDto.AttributeList.Entry createServiceContextDtoAttributeListEntry() {
        return new ServiceContextDto.AttributeList.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfosPartenaireAPartirCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InfosPartenaireAPartirCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://infospartenaireapartircompte.replaceable.service.v1_0_0.servicecontract.eib.evolan.sopra.com/", name = "infosPartenaireAPartirCompte")
    public JAXBElement<InfosPartenaireAPartirCompte> createInfosPartenaireAPartirCompte(InfosPartenaireAPartirCompte value) {
        return new JAXBElement<InfosPartenaireAPartirCompte>(_InfosPartenaireAPartirCompte_QNAME, InfosPartenaireAPartirCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfosPartenaireAPartirCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InfosPartenaireAPartirCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://infospartenaireapartircompte.replaceable.service.v1_0_0.servicecontract.eib.evolan.sopra.com/", name = "infosPartenaireAPartirCompteResponse")
    public JAXBElement<InfosPartenaireAPartirCompteResponse> createInfosPartenaireAPartirCompteResponse(InfosPartenaireAPartirCompteResponse value) {
        return new JAXBElement<InfosPartenaireAPartirCompteResponse>(_InfosPartenaireAPartirCompteResponse_QNAME, InfosPartenaireAPartirCompteResponse.class, null, value);
    }

}
