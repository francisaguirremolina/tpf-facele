
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
 *         &lt;element name="ComprobanteConstatarResult" type="{http://servicios1.afip.gob.ar/wscdc/}CmpResponse" minOccurs="0"/>
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
    "comprobanteConstatarResult"
})
@XmlRootElement(name = "ComprobanteConstatarResponse")
public class ComprobanteConstatarResponse {

    @XmlElement(name = "ComprobanteConstatarResult")
    protected CmpResponse comprobanteConstatarResult;

    /**
     * Gets the value of the comprobanteConstatarResult property.
     * 
     * @return
     *     possible object is
     *     {@link CmpResponse }
     *     
     */
    public CmpResponse getComprobanteConstatarResult() {
        return comprobanteConstatarResult;
    }

    /**
     * Sets the value of the comprobanteConstatarResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmpResponse }
     *     
     */
    public void setComprobanteConstatarResult(CmpResponse value) {
        this.comprobanteConstatarResult = value;
    }

}
