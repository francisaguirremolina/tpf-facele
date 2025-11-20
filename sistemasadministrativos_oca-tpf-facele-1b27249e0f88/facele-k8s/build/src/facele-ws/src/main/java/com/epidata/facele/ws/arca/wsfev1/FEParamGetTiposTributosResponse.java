
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
 *         &lt;element name="FEParamGetTiposTributosResult" type="{http://ar.gov.afip.dif.FEV1/}FETributoResponse" minOccurs="0"/&gt;
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
    "feParamGetTiposTributosResult"
})
@XmlRootElement(name = "FEParamGetTiposTributosResponse")
public class FEParamGetTiposTributosResponse {

    /**
     *
     */
    @XmlElement(name = "FEParamGetTiposTributosResult")
    protected FETributoResponse feParamGetTiposTributosResult;

    /**
     * Gets the value of the feParamGetTiposTributosResult property.
     * 
     * @return
     *     possible object is
     *     {@link FETributoResponse }
     *     
     */
    public FETributoResponse getFEParamGetTiposTributosResult() {
        return feParamGetTiposTributosResult;
    }

    /**
     * Sets the value of the feParamGetTiposTributosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FETributoResponse }
     *     
     */
    public void setFEParamGetTiposTributosResult(FETributoResponse value) {
        this.feParamGetTiposTributosResult = value;
    }

}
