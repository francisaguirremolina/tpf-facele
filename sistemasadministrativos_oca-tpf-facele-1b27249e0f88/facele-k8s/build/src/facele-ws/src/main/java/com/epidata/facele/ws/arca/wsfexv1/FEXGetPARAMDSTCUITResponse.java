
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
 *         &lt;element name="FEXGetPARAM_DST_CUITResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_DST_cuit" minOccurs="0"/>
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
    "fexGetPARAMDSTCUITResult"
})
@XmlRootElement(name = "FEXGetPARAM_DST_CUITResponse")
public class FEXGetPARAMDSTCUITResponse {

    @XmlElement(name = "FEXGetPARAM_DST_CUITResult")
    protected FEXResponseDSTCuit fexGetPARAMDSTCUITResult;

    /**
     * Gets the value of the fexGetPARAMDSTCUITResult property.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseDSTCuit }
     *     
     */
    public FEXResponseDSTCuit getFEXGetPARAMDSTCUITResult() {
        return fexGetPARAMDSTCUITResult;
    }

    /**
     * Sets the value of the fexGetPARAMDSTCUITResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseDSTCuit }
     *     
     */
    public void setFEXGetPARAMDSTCUITResult(FEXResponseDSTCuit value) {
        this.fexGetPARAMDSTCUITResult = value;
    }

}
