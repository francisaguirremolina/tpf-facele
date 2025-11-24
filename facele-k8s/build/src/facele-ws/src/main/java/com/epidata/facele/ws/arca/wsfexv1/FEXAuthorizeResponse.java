
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
 *         &lt;element name="FEXAuthorizeResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponseAuthorize" minOccurs="0"/>
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
    "fexAuthorizeResult"
})
@XmlRootElement(name = "FEXAuthorizeResponse")
public class FEXAuthorizeResponse {

    @XmlElement(name = "FEXAuthorizeResult")
    protected FEXResponseAuthorize fexAuthorizeResult;

    /**
     * Gets the value of the fexAuthorizeResult property.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseAuthorize }
     *     
     */
    public FEXResponseAuthorize getFEXAuthorizeResult() {
        return fexAuthorizeResult;
    }

    /**
     * Sets the value of the fexAuthorizeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseAuthorize }
     *     
     */
    public void setFEXAuthorizeResult(FEXResponseAuthorize value) {
        this.fexAuthorizeResult = value;
    }

}
