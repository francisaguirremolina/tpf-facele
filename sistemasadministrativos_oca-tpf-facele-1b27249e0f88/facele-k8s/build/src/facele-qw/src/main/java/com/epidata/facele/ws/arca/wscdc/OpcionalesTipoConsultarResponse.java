
package com.epidata.facele.ws.arca.wscdc;

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
 *         &lt;element name="OpcionalesTipoConsultarResult" type="{http://servicios1.afip.gob.ar/wscdc/}OpcionalTipoResponse" minOccurs="0"/>
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
    "opcionalesTipoConsultarResult"
})
@XmlRootElement(name = "OpcionalesTipoConsultarResponse")
public class OpcionalesTipoConsultarResponse {

    @XmlElement(name = "OpcionalesTipoConsultarResult")
    protected OpcionalTipoResponse opcionalesTipoConsultarResult;

    /**
     * Gets the value of the opcionalesTipoConsultarResult property.
     * 
     * @return
     *     possible object is
     *     {@link OpcionalTipoResponse }
     *     
     */
    public OpcionalTipoResponse getOpcionalesTipoConsultarResult() {
        return opcionalesTipoConsultarResult;
    }

    /**
     * Sets the value of the opcionalesTipoConsultarResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpcionalTipoResponse }
     *     
     */
    public void setOpcionalesTipoConsultarResult(OpcionalTipoResponse value) {
        this.opcionalesTipoConsultarResult = value;
    }

}
