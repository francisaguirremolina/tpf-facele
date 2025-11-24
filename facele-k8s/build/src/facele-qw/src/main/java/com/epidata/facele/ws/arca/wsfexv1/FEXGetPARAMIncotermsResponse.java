
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
 *         &lt;element name="FEXGetPARAM_IncotermsResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_Inc" minOccurs="0"/>
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
    "fexGetPARAMIncotermsResult"
})
@XmlRootElement(name = "FEXGetPARAM_IncotermsResponse")
public class FEXGetPARAMIncotermsResponse {

    @XmlElement(name = "FEXGetPARAM_IncotermsResult")
    protected FEXResponseInc fexGetPARAMIncotermsResult;

    /**
     * Gets the value of the fexGetPARAMIncotermsResult property.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseInc }
     *     
     */
    public FEXResponseInc getFEXGetPARAMIncotermsResult() {
        return fexGetPARAMIncotermsResult;
    }

    /**
     * Sets the value of the fexGetPARAMIncotermsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseInc }
     *     
     */
    public void setFEXGetPARAMIncotermsResult(FEXResponseInc value) {
        this.fexGetPARAMIncotermsResult = value;
    }

}
