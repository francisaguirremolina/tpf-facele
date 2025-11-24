
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
 *         &lt;element name="FEXGetPARAM_OpcionalesResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_Opc" minOccurs="0"/>
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
    "fexGetPARAMOpcionalesResult"
})
@XmlRootElement(name = "FEXGetPARAM_OpcionalesResponse")
public class FEXGetPARAMOpcionalesResponse {

    @XmlElement(name = "FEXGetPARAM_OpcionalesResult")
    protected FEXResponseOpc fexGetPARAMOpcionalesResult;

    /**
     * Gets the value of the fexGetPARAMOpcionalesResult property.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseOpc }
     *     
     */
    public FEXResponseOpc getFEXGetPARAMOpcionalesResult() {
        return fexGetPARAMOpcionalesResult;
    }

    /**
     * Sets the value of the fexGetPARAMOpcionalesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseOpc }
     *     
     */
    public void setFEXGetPARAMOpcionalesResult(FEXResponseOpc value) {
        this.fexGetPARAMOpcionalesResult = value;
    }

}
