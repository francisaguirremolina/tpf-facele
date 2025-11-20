
package com.epidata.facele.ws.arca.wsfexv1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FEXResponse_Mon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEXResponse_Mon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FEXResultGet" type="{http://ar.gov.afip.dif.fexv1/}ArrayOfClsFEXResponse_Mon" minOccurs="0"/>
 *         &lt;element name="FEXErr" type="{http://ar.gov.afip.dif.fexv1/}ClsFEXErr" minOccurs="0"/>
 *         &lt;element name="FEXEvents" type="{http://ar.gov.afip.dif.fexv1/}ClsFEXEvents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEXResponse_Mon", propOrder = {
    "fexResultGet",
    "fexErr",
    "fexEvents"
})
public class FEXResponseMon {

    @XmlElement(name = "FEXResultGet")
    protected ArrayOfClsFEXResponseMon fexResultGet;
    @XmlElement(name = "FEXErr")
    protected ClsFEXErr fexErr;
    @XmlElement(name = "FEXEvents")
    protected ClsFEXEvents fexEvents;

    /**
     * Gets the value of the fexResultGet property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsFEXResponseMon }
     *     
     */
    public ArrayOfClsFEXResponseMon getFEXResultGet() {
        return fexResultGet;
    }

    /**
     * Sets the value of the fexResultGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsFEXResponseMon }
     *     
     */
    public void setFEXResultGet(ArrayOfClsFEXResponseMon value) {
        this.fexResultGet = value;
    }

    /**
     * Gets the value of the fexErr property.
     * 
     * @return
     *     possible object is
     *     {@link ClsFEXErr }
     *     
     */
    public ClsFEXErr getFEXErr() {
        return fexErr;
    }

    /**
     * Sets the value of the fexErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsFEXErr }
     *     
     */
    public void setFEXErr(ClsFEXErr value) {
        this.fexErr = value;
    }

    /**
     * Gets the value of the fexEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ClsFEXEvents }
     *     
     */
    public ClsFEXEvents getFEXEvents() {
        return fexEvents;
    }

    /**
     * Sets the value of the fexEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsFEXEvents }
     *     
     */
    public void setFEXEvents(ClsFEXEvents value) {
        this.fexEvents = value;
    }

}
