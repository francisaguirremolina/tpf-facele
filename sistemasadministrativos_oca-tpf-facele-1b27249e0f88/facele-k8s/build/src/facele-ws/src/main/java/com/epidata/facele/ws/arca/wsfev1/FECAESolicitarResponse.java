
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
 *         &lt;element name="FECAESolicitarResult" type="{http://ar.gov.afip.dif.FEV1/}FECAEResponse" minOccurs="0"/&gt;
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
    "fecaeSolicitarResult"
})
@XmlRootElement(name = "FECAESolicitarResponse")
public class FECAESolicitarResponse {

    /**
     *
     */
    @XmlElement(name = "FECAESolicitarResult")
    protected FECAEResponse fecaeSolicitarResult;

    /**
     * Gets the value of the fecaeSolicitarResult property.
     * 
     * @return
     *     possible object is
     *     {@link FECAEResponse }
     *     
     */
    public FECAEResponse getFECAESolicitarResult() {
        return fecaeSolicitarResult;
    }

    /**
     * Sets the value of the fecaeSolicitarResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FECAEResponse }
     *     
     */
    public void setFECAESolicitarResult(FECAEResponse value) {
        this.fecaeSolicitarResult = value;
    }

}
