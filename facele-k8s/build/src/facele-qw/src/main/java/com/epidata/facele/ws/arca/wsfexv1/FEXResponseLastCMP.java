
package com.epidata.facele.ws.arca.wsfexv1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FEXResponseLast_CMP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEXResponseLast_CMP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FEXResult_LastCMP" type="{http://ar.gov.afip.dif.fexv1/}ClsFEX_LastCMP_Response" minOccurs="0"/>
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
@XmlType(name = "FEXResponseLast_CMP", propOrder = {
    "fexResultLastCMP",
    "fexErr",
    "fexEvents"
})
public class FEXResponseLastCMP {

    @XmlElement(name = "FEXResult_LastCMP")
    protected ClsFEXLastCMPResponse fexResultLastCMP;
    @XmlElement(name = "FEXErr")
    protected ClsFEXErr fexErr;
    @XmlElement(name = "FEXEvents")
    protected ClsFEXEvents fexEvents;

    /**
     * Gets the value of the fexResultLastCMP property.
     * 
     * @return
     *     possible object is
     *     {@link ClsFEXLastCMPResponse }
     *     
     */
    public ClsFEXLastCMPResponse getFEXResultLastCMP() {
        return fexResultLastCMP;
    }

    /**
     * Sets the value of the fexResultLastCMP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsFEXLastCMPResponse }
     *     
     */
    public void setFEXResultLastCMP(ClsFEXLastCMPResponse value) {
        this.fexResultLastCMP = value;
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
