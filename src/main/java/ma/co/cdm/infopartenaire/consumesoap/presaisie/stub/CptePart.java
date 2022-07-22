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
 * <p>Classe Java pour cptePart complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="cptePart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boDdg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boEdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boEdiAo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boEdiOc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boEdiTrExe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boEdiTrPec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boPfe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boSuivflux" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdBdf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdCdl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdCommune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdCompte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdCptDom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdDevCompte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdDomInt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdGest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdGrpMarge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdGrpTarif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdGrpValeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdGrpPrlv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdGuichet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdPartechn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdPaysres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdSegn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdSupp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateCreaMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtCloture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtOcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbAdr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbAdr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbAdr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbAdr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbAutAd2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbAutAd3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbAutAd4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbAutAdr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbCompte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbCpville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbGest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbNompren" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lbPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mtPlafoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noSiren" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tpEtat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tpExontva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tpFam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tpResbanc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tpResfic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tpType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cptePart", propOrder = {
    "boDdg",
    "boEdi",
    "boEdiAo",
    "boEdiOc",
    "boEdiTrExe",
    "boEdiTrPec",
    "boPfe",
    "boSuivflux",
    "cdBdf",
    "cdCdl",
    "cdCommune",
    "cdCompte",
    "cdCptDom",
    "cdDevCompte",
    "cdDomInt",
    "cdGest",
    "cdGrpMarge",
    "cdGrpTarif",
    "cdGrpValeur",
    "cdGrpPrlv",
    "cdGuichet",
    "cdNote",
    "cdPart",
    "cdPartechn",
    "cdPaysres",
    "cdPort",
    "cdSegn",
    "cdSupp",
    "dateCreaMod",
    "dtCloture",
    "dtNote",
    "dtOcc",
    "lbAdr1",
    "lbAdr2",
    "lbAdr3",
    "lbAdr4",
    "lbAutAd2",
    "lbAutAd3",
    "lbAutAd4",
    "lbAutAdr",
    "lbCompte",
    "lbCpville",
    "lbGest",
    "lbMail",
    "lbNompren",
    "lbPort",
    "mtPlafoc",
    "noFax",
    "noSiren",
    "noTel",
    "tpEtat",
    "tpExontva",
    "tpFam",
    "tpResbanc",
    "tpResfic",
    "tpType"
})
public class CptePart {

    protected String boDdg;
    protected String boEdi;
    protected String boEdiAo;
    protected String boEdiOc;
    protected String boEdiTrExe;
    protected String boEdiTrPec;
    protected String boPfe;
    protected String boSuivflux;
    protected String cdBdf;
    protected String cdCdl;
    protected String cdCommune;
    protected String cdCompte;
    protected String cdCptDom;
    protected String cdDevCompte;
    protected String cdDomInt;
    protected String cdGest;
    protected String cdGrpMarge;
    protected String cdGrpTarif;
    protected String cdGrpValeur;
    protected String cdGrpPrlv;
    protected String cdGuichet;
    protected String cdNote;
    protected String cdPart;
    protected String cdPartechn;
    protected String cdPaysres;
    protected String cdPort;
    protected String cdSegn;
    protected String cdSupp;
    protected String dateCreaMod;
    protected String dtCloture;
    protected String dtNote;
    protected String dtOcc;
    protected String lbAdr1;
    protected String lbAdr2;
    protected String lbAdr3;
    protected String lbAdr4;
    protected String lbAutAd2;
    protected String lbAutAd3;
    protected String lbAutAd4;
    protected String lbAutAdr;
    protected String lbCompte;
    protected String lbCpville;
    protected String lbGest;
    protected String lbMail;
    protected String lbNompren;
    protected String lbPort;
    protected String mtPlafoc;
    protected String noFax;
    protected String noSiren;
    protected String noTel;
    protected String tpEtat;
    protected String tpExontva;
    protected String tpFam;
    protected String tpResbanc;
    protected String tpResfic;
    protected String tpType;

    /**
     * Obtient la valeur de la propriété boDdg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoDdg() {
        return boDdg;
    }

    /**
     * Définit la valeur de la propriété boDdg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoDdg(String value) {
        this.boDdg = value;
    }

    /**
     * Obtient la valeur de la propriété boEdi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoEdi() {
        return boEdi;
    }

    /**
     * Définit la valeur de la propriété boEdi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoEdi(String value) {
        this.boEdi = value;
    }

    /**
     * Obtient la valeur de la propriété boEdiAo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoEdiAo() {
        return boEdiAo;
    }

    /**
     * Définit la valeur de la propriété boEdiAo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoEdiAo(String value) {
        this.boEdiAo = value;
    }

    /**
     * Obtient la valeur de la propriété boEdiOc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoEdiOc() {
        return boEdiOc;
    }

    /**
     * Définit la valeur de la propriété boEdiOc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoEdiOc(String value) {
        this.boEdiOc = value;
    }

    /**
     * Obtient la valeur de la propriété boEdiTrExe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoEdiTrExe() {
        return boEdiTrExe;
    }

    /**
     * Définit la valeur de la propriété boEdiTrExe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoEdiTrExe(String value) {
        this.boEdiTrExe = value;
    }

    /**
     * Obtient la valeur de la propriété boEdiTrPec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoEdiTrPec() {
        return boEdiTrPec;
    }

    /**
     * Définit la valeur de la propriété boEdiTrPec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoEdiTrPec(String value) {
        this.boEdiTrPec = value;
    }

    /**
     * Obtient la valeur de la propriété boPfe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoPfe() {
        return boPfe;
    }

    /**
     * Définit la valeur de la propriété boPfe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoPfe(String value) {
        this.boPfe = value;
    }

    /**
     * Obtient la valeur de la propriété boSuivflux.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoSuivflux() {
        return boSuivflux;
    }

    /**
     * Définit la valeur de la propriété boSuivflux.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoSuivflux(String value) {
        this.boSuivflux = value;
    }

    /**
     * Obtient la valeur de la propriété cdBdf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdBdf() {
        return cdBdf;
    }

    /**
     * Définit la valeur de la propriété cdBdf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdBdf(String value) {
        this.cdBdf = value;
    }

    /**
     * Obtient la valeur de la propriété cdCdl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCdl() {
        return cdCdl;
    }

    /**
     * Définit la valeur de la propriété cdCdl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCdl(String value) {
        this.cdCdl = value;
    }

    /**
     * Obtient la valeur de la propriété cdCommune.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCommune() {
        return cdCommune;
    }

    /**
     * Définit la valeur de la propriété cdCommune.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCommune(String value) {
        this.cdCommune = value;
    }

    /**
     * Obtient la valeur de la propriété cdCompte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCompte() {
        return cdCompte;
    }

    /**
     * Définit la valeur de la propriété cdCompte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCompte(String value) {
        this.cdCompte = value;
    }

    /**
     * Obtient la valeur de la propriété cdCptDom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCptDom() {
        return cdCptDom;
    }

    /**
     * Définit la valeur de la propriété cdCptDom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCptDom(String value) {
        this.cdCptDom = value;
    }

    /**
     * Obtient la valeur de la propriété cdDevCompte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdDevCompte() {
        return cdDevCompte;
    }

    /**
     * Définit la valeur de la propriété cdDevCompte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdDevCompte(String value) {
        this.cdDevCompte = value;
    }

    /**
     * Obtient la valeur de la propriété cdDomInt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdDomInt() {
        return cdDomInt;
    }

    /**
     * Définit la valeur de la propriété cdDomInt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdDomInt(String value) {
        this.cdDomInt = value;
    }

    /**
     * Obtient la valeur de la propriété cdGest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdGest() {
        return cdGest;
    }

    /**
     * Définit la valeur de la propriété cdGest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdGest(String value) {
        this.cdGest = value;
    }

    /**
     * Obtient la valeur de la propriété cdGrpMarge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdGrpMarge() {
        return cdGrpMarge;
    }

    /**
     * Définit la valeur de la propriété cdGrpMarge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdGrpMarge(String value) {
        this.cdGrpMarge = value;
    }

    /**
     * Obtient la valeur de la propriété cdGrpTarif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdGrpTarif() {
        return cdGrpTarif;
    }

    /**
     * Définit la valeur de la propriété cdGrpTarif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdGrpTarif(String value) {
        this.cdGrpTarif = value;
    }

    /**
     * Obtient la valeur de la propriété cdGrpValeur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdGrpValeur() {
        return cdGrpValeur;
    }

    /**
     * Définit la valeur de la propriété cdGrpValeur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdGrpValeur(String value) {
        this.cdGrpValeur = value;
    }

    /**
     * Obtient la valeur de la propriété cdGrpPrlv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdGrpPrlv() {
        return cdGrpPrlv;
    }

    /**
     * Définit la valeur de la propriété cdGrpPrlv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdGrpPrlv(String value) {
        this.cdGrpPrlv = value;
    }

    /**
     * Obtient la valeur de la propriété cdGuichet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdGuichet() {
        return cdGuichet;
    }

    /**
     * Définit la valeur de la propriété cdGuichet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdGuichet(String value) {
        this.cdGuichet = value;
    }

    /**
     * Obtient la valeur de la propriété cdNote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdNote() {
        return cdNote;
    }

    /**
     * Définit la valeur de la propriété cdNote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdNote(String value) {
        this.cdNote = value;
    }

    /**
     * Obtient la valeur de la propriété cdPart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdPart() {
        return cdPart;
    }

    /**
     * Définit la valeur de la propriété cdPart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdPart(String value) {
        this.cdPart = value;
    }

    /**
     * Obtient la valeur de la propriété cdPartechn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdPartechn() {
        return cdPartechn;
    }

    /**
     * Définit la valeur de la propriété cdPartechn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdPartechn(String value) {
        this.cdPartechn = value;
    }

    /**
     * Obtient la valeur de la propriété cdPaysres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdPaysres() {
        return cdPaysres;
    }

    /**
     * Définit la valeur de la propriété cdPaysres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdPaysres(String value) {
        this.cdPaysres = value;
    }

    /**
     * Obtient la valeur de la propriété cdPort.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdPort() {
        return cdPort;
    }

    /**
     * Définit la valeur de la propriété cdPort.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdPort(String value) {
        this.cdPort = value;
    }

    /**
     * Obtient la valeur de la propriété cdSegn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdSegn() {
        return cdSegn;
    }

    /**
     * Définit la valeur de la propriété cdSegn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdSegn(String value) {
        this.cdSegn = value;
    }

    /**
     * Obtient la valeur de la propriété cdSupp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdSupp() {
        return cdSupp;
    }

    /**
     * Définit la valeur de la propriété cdSupp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdSupp(String value) {
        this.cdSupp = value;
    }

    /**
     * Obtient la valeur de la propriété dateCreaMod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateCreaMod() {
        return dateCreaMod;
    }

    /**
     * Définit la valeur de la propriété dateCreaMod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateCreaMod(String value) {
        this.dateCreaMod = value;
    }

    /**
     * Obtient la valeur de la propriété dtCloture.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtCloture() {
        return dtCloture;
    }

    /**
     * Définit la valeur de la propriété dtCloture.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtCloture(String value) {
        this.dtCloture = value;
    }

    /**
     * Obtient la valeur de la propriété dtNote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtNote() {
        return dtNote;
    }

    /**
     * Définit la valeur de la propriété dtNote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtNote(String value) {
        this.dtNote = value;
    }

    /**
     * Obtient la valeur de la propriété dtOcc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtOcc() {
        return dtOcc;
    }

    /**
     * Définit la valeur de la propriété dtOcc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtOcc(String value) {
        this.dtOcc = value;
    }

    /**
     * Obtient la valeur de la propriété lbAdr1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbAdr1() {
        return lbAdr1;
    }

    /**
     * Définit la valeur de la propriété lbAdr1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbAdr1(String value) {
        this.lbAdr1 = value;
    }

    /**
     * Obtient la valeur de la propriété lbAdr2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbAdr2() {
        return lbAdr2;
    }

    /**
     * Définit la valeur de la propriété lbAdr2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbAdr2(String value) {
        this.lbAdr2 = value;
    }

    /**
     * Obtient la valeur de la propriété lbAdr3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbAdr3() {
        return lbAdr3;
    }

    /**
     * Définit la valeur de la propriété lbAdr3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbAdr3(String value) {
        this.lbAdr3 = value;
    }

    /**
     * Obtient la valeur de la propriété lbAdr4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbAdr4() {
        return lbAdr4;
    }

    /**
     * Définit la valeur de la propriété lbAdr4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbAdr4(String value) {
        this.lbAdr4 = value;
    }

    /**
     * Obtient la valeur de la propriété lbAutAd2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbAutAd2() {
        return lbAutAd2;
    }

    /**
     * Définit la valeur de la propriété lbAutAd2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbAutAd2(String value) {
        this.lbAutAd2 = value;
    }

    /**
     * Obtient la valeur de la propriété lbAutAd3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbAutAd3() {
        return lbAutAd3;
    }

    /**
     * Définit la valeur de la propriété lbAutAd3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbAutAd3(String value) {
        this.lbAutAd3 = value;
    }

    /**
     * Obtient la valeur de la propriété lbAutAd4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbAutAd4() {
        return lbAutAd4;
    }

    /**
     * Définit la valeur de la propriété lbAutAd4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbAutAd4(String value) {
        this.lbAutAd4 = value;
    }

    /**
     * Obtient la valeur de la propriété lbAutAdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbAutAdr() {
        return lbAutAdr;
    }

    /**
     * Définit la valeur de la propriété lbAutAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbAutAdr(String value) {
        this.lbAutAdr = value;
    }

    /**
     * Obtient la valeur de la propriété lbCompte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbCompte() {
        return lbCompte;
    }

    /**
     * Définit la valeur de la propriété lbCompte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbCompte(String value) {
        this.lbCompte = value;
    }

    /**
     * Obtient la valeur de la propriété lbCpville.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbCpville() {
        return lbCpville;
    }

    /**
     * Définit la valeur de la propriété lbCpville.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbCpville(String value) {
        this.lbCpville = value;
    }

    /**
     * Obtient la valeur de la propriété lbGest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbGest() {
        return lbGest;
    }

    /**
     * Définit la valeur de la propriété lbGest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbGest(String value) {
        this.lbGest = value;
    }

    /**
     * Obtient la valeur de la propriété lbMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbMail() {
        return lbMail;
    }

    /**
     * Définit la valeur de la propriété lbMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbMail(String value) {
        this.lbMail = value;
    }

    /**
     * Obtient la valeur de la propriété lbNompren.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbNompren() {
        return lbNompren;
    }

    /**
     * Définit la valeur de la propriété lbNompren.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbNompren(String value) {
        this.lbNompren = value;
    }

    /**
     * Obtient la valeur de la propriété lbPort.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbPort() {
        return lbPort;
    }

    /**
     * Définit la valeur de la propriété lbPort.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbPort(String value) {
        this.lbPort = value;
    }

    /**
     * Obtient la valeur de la propriété mtPlafoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtPlafoc() {
        return mtPlafoc;
    }

    /**
     * Définit la valeur de la propriété mtPlafoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtPlafoc(String value) {
        this.mtPlafoc = value;
    }

    /**
     * Obtient la valeur de la propriété noFax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoFax() {
        return noFax;
    }

    /**
     * Définit la valeur de la propriété noFax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoFax(String value) {
        this.noFax = value;
    }

    /**
     * Obtient la valeur de la propriété noSiren.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoSiren() {
        return noSiren;
    }

    /**
     * Définit la valeur de la propriété noSiren.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoSiren(String value) {
        this.noSiren = value;
    }

    /**
     * Obtient la valeur de la propriété noTel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoTel() {
        return noTel;
    }

    /**
     * Définit la valeur de la propriété noTel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoTel(String value) {
        this.noTel = value;
    }

    /**
     * Obtient la valeur de la propriété tpEtat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpEtat() {
        return tpEtat;
    }

    /**
     * Définit la valeur de la propriété tpEtat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpEtat(String value) {
        this.tpEtat = value;
    }

    /**
     * Obtient la valeur de la propriété tpExontva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpExontva() {
        return tpExontva;
    }

    /**
     * Définit la valeur de la propriété tpExontva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpExontva(String value) {
        this.tpExontva = value;
    }

    /**
     * Obtient la valeur de la propriété tpFam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpFam() {
        return tpFam;
    }

    /**
     * Définit la valeur de la propriété tpFam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpFam(String value) {
        this.tpFam = value;
    }

    /**
     * Obtient la valeur de la propriété tpResbanc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpResbanc() {
        return tpResbanc;
    }

    /**
     * Définit la valeur de la propriété tpResbanc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpResbanc(String value) {
        this.tpResbanc = value;
    }

    /**
     * Obtient la valeur de la propriété tpResfic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpResfic() {
        return tpResfic;
    }

    /**
     * Définit la valeur de la propriété tpResfic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpResfic(String value) {
        this.tpResfic = value;
    }

    /**
     * Obtient la valeur de la propriété tpType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpType() {
        return tpType;
    }

    /**
     * Définit la valeur de la propriété tpType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpType(String value) {
        this.tpType = value;
    }

}
