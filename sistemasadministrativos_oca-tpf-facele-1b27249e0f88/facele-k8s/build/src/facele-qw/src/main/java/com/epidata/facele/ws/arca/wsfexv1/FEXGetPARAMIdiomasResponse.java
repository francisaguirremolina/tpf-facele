
package com.epidata.facele.ws.arca.wsfexv1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FEXGetPARAM_IdiomasResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_Idi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fexGetPARAMIdiomasResult"
})
@XmlRootElement(name = "FEXGetPARAM_IdiomasResponse")
public class FEXGetPARAMIdiomasResponse {

    @XmlElement(name = "FEXGetPARAM_IdiomasResult")
    protected FEXResponseIdi fexGetPARAMIdiomasResult;

    /**
     * Gets the value of the fexGetPARAMIdiomasResult property.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseIdi }
     *     
     */
    public FEXResponseIdi getFEXGetPARAMIdiomasResult() {
        return fexGetPARAMIdiomasResult;
    }

    /**
     * Sets the value of the fexGetPARAMIdiomasResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseIdi }
     *     
     */
    public void setFEXGetPARAMIdiomasResult(FEXResponseIdi value) {
        this.fexGetPARAMIdiomasResult = value;
    }

}
