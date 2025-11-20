
package com.epidata.facele.ws.arca.wsfexv1;

import com.epidata.facele.ws.arca.wsfev1.AbstractArcaModel;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClsFEXResponse_Inc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_Inc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Inc_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inc_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inc_vig_desde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inc_vig_hasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_Inc", propOrder = {
    "incId",
    "incDs",
    "incVigDesde",
    "incVigHasta"
})
public class ClsFEXResponseInc extends AbstractArcaModel {

    @XmlElement(name = "Inc_Id")
    protected String incId;
    @XmlElement(name = "Inc_Ds")
    protected String incDs;
    @XmlElement(name = "Inc_vig_desde")
    protected String incVigDesde;
    @XmlElement(name = "Inc_vig_hasta")
    protected String incVigHasta;

    /**
     * Gets the value of the incId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncId() {
        return incId;
    }

    @Override
    public Object getModelId() {
        return getIncId();
    }

    /**
     * Sets the value of the incId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncId(String value) {
        this.incId = value;
    }

    /**
     * Gets the value of the incDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncDs() {
        return incDs;
    }

    /**
     * Sets the value of the incDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncDs(String value) {
        this.incDs = value;
    }

    /**
     * Gets the value of the incVigDesde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncVigDesde() {
        return incVigDesde;
    }

    /**
     * Sets the value of the incVigDesde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncVigDesde(String value) {
        this.incVigDesde = value;
    }

    /**
     * Gets the value of the incVigHasta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncVigHasta() {
        return incVigHasta;
    }

    /**
     * Sets the value of the incVigHasta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncVigHasta(String value) {
        this.incVigHasta = value;
    }

}
