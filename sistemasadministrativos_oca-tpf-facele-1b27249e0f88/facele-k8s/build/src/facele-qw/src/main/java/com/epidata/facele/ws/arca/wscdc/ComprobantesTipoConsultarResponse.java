
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
 *         &lt;element name="ComprobantesTipoConsultarResult" type="{http://servicios1.afip.gob.ar/wscdc/}CbteTipoResponse" minOccurs="0"/>
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
    "comprobantesTipoConsultarResult"
})
@XmlRootElement(name = "ComprobantesTipoConsultarResponse")
public class ComprobantesTipoConsultarResponse {

    @XmlElement(name = "ComprobantesTipoConsultarResult")
    protected CbteTipoResponse comprobantesTipoConsultarResult;

    /**
     * Gets the value of the comprobantesTipoConsultarResult property.
     * 
     * @return
     *     possible object is
     *     {@link CbteTipoResponse }
     *     
     */
    public CbteTipoResponse getComprobantesTipoConsultarResult() {
        return comprobantesTipoConsultarResult;
    }

    /**
     * Sets the value of the comprobantesTipoConsultarResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbteTipoResponse }
     *     
     */
    public void setComprobantesTipoConsultarResult(CbteTipoResponse value) {
        this.comprobantesTipoConsultarResult = value;
    }

}
