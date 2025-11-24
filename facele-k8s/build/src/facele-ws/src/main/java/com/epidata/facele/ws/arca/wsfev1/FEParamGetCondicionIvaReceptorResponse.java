
package com.epidata.facele.ws.arca.wsfev1;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FEParamGetCondicionIvaReceptorResult" type="{http://ar.gov.afip.dif.FEV1/}CondicionIvaReceptorResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "feParamGetCondicionIvaReceptorResult"
})
@XmlRootElement(name = "FEParamGetCondicionIvaReceptorResponse")
public class FEParamGetCondicionIvaReceptorResponse {

    /**
     *
     */
    @XmlElement(name = "FEParamGetCondicionIvaReceptorResult")
    protected CondicionIvaReceptorResponse feParamGetCondicionIvaReceptorResult;

    /**
     * Gets the value of the feParamGetCondicionIvaReceptorResult property.
     * 
     * @return
     *     possible object is
     *     {@link CondicionIvaReceptorResponse }
     *     
     */
    public CondicionIvaReceptorResponse getFEParamGetCondicionIvaReceptorResult() {
        return feParamGetCondicionIvaReceptorResult;
    }

    /**
     * Sets the value of the feParamGetCondicionIvaReceptorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CondicionIvaReceptorResponse }
     *     
     */
    public void setFEParamGetCondicionIvaReceptorResult(CondicionIvaReceptorResponse value) {
        this.feParamGetCondicionIvaReceptorResult = value;
    }

}
