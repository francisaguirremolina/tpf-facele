
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
 *         &lt;element name="FEXGetPARAM_PtoVentaResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_PtoVenta" minOccurs="0"/>
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
    "fexGetPARAMPtoVentaResult"
})
@XmlRootElement(name = "FEXGetPARAM_PtoVentaResponse")
public class FEXGetPARAMPtoVentaResponse {

    @XmlElement(name = "FEXGetPARAM_PtoVentaResult")
    protected FEXResponsePtoVenta fexGetPARAMPtoVentaResult;

    /**
     * Gets the value of the fexGetPARAMPtoVentaResult property.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponsePtoVenta }
     *     
     */
    public FEXResponsePtoVenta getFEXGetPARAMPtoVentaResult() {
        return fexGetPARAMPtoVentaResult;
    }

    /**
     * Sets the value of the fexGetPARAMPtoVentaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponsePtoVenta }
     *     
     */
    public void setFEXGetPARAMPtoVentaResult(FEXResponsePtoVenta value) {
        this.fexGetPARAMPtoVentaResult = value;
    }

}
