
package com.epidata.facele.ws.arca.wsfexv1;

import com.epidata.facele.ws.arca.wsfev1.AbstractArcaModel;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClsFEXResponse_Mon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_Mon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mon_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mon_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mon_vig_desde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mon_vig_hasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_Mon", propOrder = {
    "monId",
    "monDs",
    "monVigDesde",
    "monVigHasta"
})
public class ClsFEXResponseMon extends AbstractArcaModel {

    @XmlElement(name = "Mon_Id")
    protected String monId;
    @XmlElement(name = "Mon_Ds")
    protected String monDs;
    @XmlElement(name = "Mon_vig_desde")
    protected String monVigDesde;
    @XmlElement(name = "Mon_vig_hasta")
    protected String monVigHasta;

    @Override
    public Object getModelId() {
        return getMonId();
    }

    /**
     * Gets the value of the monId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonId() {
        return monId;
    }

    /**
     * Sets the value of the monId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonId(String value) {
        this.monId = value;
    }

    /**
     * Gets the value of the monDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonDs() {
        return monDs;
    }

    /**
     * Sets the value of the monDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonDs(String value) {
        this.monDs = value;
    }

    /**
     * Gets the value of the monVigDesde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonVigDesde() {
        return monVigDesde;
    }

    /**
     * Sets the value of the monVigDesde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonVigDesde(String value) {
        this.monVigDesde = value;
    }

    /**
     * Gets the value of the monVigHasta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonVigHasta() {
        return monVigHasta;
    }

    /**
     * Sets the value of the monVigHasta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonVigHasta(String value) {
        this.monVigHasta = value;
    }

}
