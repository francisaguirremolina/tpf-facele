
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
 *         &lt;element name="FEXGetPARAM_MONResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_Mon" minOccurs="0"/>
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
    "fexGetPARAMMONResult"
})
@XmlRootElement(name = "FEXGetPARAM_MONResponse")
public class FEXGetPARAMMONResponse {

    @XmlElement(name = "FEXGetPARAM_MONResult")
    protected FEXResponseMon fexGetPARAMMONResult;

    /**
     * Gets the value of the fexGetPARAMMONResult property.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseMon }
     *     
     */
    public FEXResponseMon getFEXGetPARAMMONResult() {
        return fexGetPARAMMONResult;
    }

    /**
     * Sets the value of the fexGetPARAMMONResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseMon }
     *     
     */
    public void setFEXGetPARAMMONResult(FEXResponseMon value) {
        this.fexGetPARAMMONResult = value;
    }

}
