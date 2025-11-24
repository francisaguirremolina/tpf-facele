
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
 *         &lt;element name="ComprobanteDummyResult" type="{http://servicios1.afip.gob.ar/wscdc/}DummyResponse" minOccurs="0"/>
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
    "comprobanteDummyResult"
})
@XmlRootElement(name = "ComprobanteDummyResponse")
public class ComprobanteDummyResponse {

    @XmlElement(name = "ComprobanteDummyResult")
    protected DummyResponse comprobanteDummyResult;

    /**
     * Gets the value of the comprobanteDummyResult property.
     * 
     * @return
     *     possible object is
     *     {@link DummyResponse }
     *     
     */
    public DummyResponse getComprobanteDummyResult() {
        return comprobanteDummyResult;
    }

    /**
     * Sets the value of the comprobanteDummyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DummyResponse }
     *     
     */
    public void setComprobanteDummyResult(DummyResponse value) {
        this.comprobanteDummyResult = value;
    }

}
