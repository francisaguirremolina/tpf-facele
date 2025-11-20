
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
 *         &lt;element name="FEXGetPARAM_CtzResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_Ctz" minOccurs="0"/>
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
    "fexGetPARAMCtzResult"
})
@XmlRootElement(name = "FEXGetPARAM_CtzResponse")
public class FEXGetPARAMCtzResponse {

    @XmlElement(name = "FEXGetPARAM_CtzResult")
    protected FEXResponseCtz fexGetPARAMCtzResult;

    /**
     * Gets the value of the fexGetPARAMCtzResult property.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseCtz }
     *     
     */
    public FEXResponseCtz getFEXGetPARAMCtzResult() {
        return fexGetPARAMCtzResult;
    }

    /**
     * Sets the value of the fexGetPARAMCtzResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseCtz }
     *     
     */
    public void setFEXGetPARAMCtzResult(FEXResponseCtz value) {
        this.fexGetPARAMCtzResult = value;
    }

}
