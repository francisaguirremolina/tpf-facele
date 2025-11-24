
package com.epidata.facele.ws.arca.wsfexv1;

import com.epidata.facele.ws.arca.wsfev1.AbstractArcaModel;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClsFEXResponse_Idi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_Idi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Idi_Id" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Idi_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Idi_vig_desde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Idi_vig_hasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_Idi", propOrder = {
    "idiId",
    "idiDs",
    "idiVigDesde",
    "idiVigHasta"
})
public class ClsFEXResponseIdi extends AbstractArcaModel {

    @XmlElement(name = "Idi_Id")
    protected short idiId;
    @XmlElement(name = "Idi_Ds")
    protected String idiDs;
    @XmlElement(name = "Idi_vig_desde")
    protected String idiVigDesde;
    @XmlElement(name = "Idi_vig_hasta")
    protected String idiVigHasta;

    /**
     * Gets the value of the idiId property.
     * 
     */
    public short getIdiId() {
        return idiId;
    }

    @Override
    public Object getModelId() {
        return getIdiId();
    }

    /**
     * Sets the value of the idiId property.
     * 
     */
    public void setIdiId(short value) {
        this.idiId = value;
    }

    /**
     * Gets the value of the idiDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdiDs() {
        return idiDs;
    }

    /**
     * Sets the value of the idiDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdiDs(String value) {
        this.idiDs = value;
    }

    /**
     * Gets the value of the idiVigDesde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdiVigDesde() {
        return idiVigDesde;
    }

    /**
     * Sets the value of the idiVigDesde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdiVigDesde(String value) {
        this.idiVigDesde = value;
    }

    /**
     * Gets the value of the idiVigHasta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdiVigHasta() {
        return idiVigHasta;
    }

    /**
     * Sets the value of the idiVigHasta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdiVigHasta(String value) {
        this.idiVigHasta = value;
    }

}
