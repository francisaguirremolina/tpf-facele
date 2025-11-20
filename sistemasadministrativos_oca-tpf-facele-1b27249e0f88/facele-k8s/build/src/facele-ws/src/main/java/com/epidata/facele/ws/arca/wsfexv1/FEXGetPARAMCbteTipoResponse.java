
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
 *         &lt;element name="FEXGetPARAM_Cbte_TipoResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_Cbte_Tipo" minOccurs="0"/>
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
    "fexGetPARAMCbteTipoResult"
})
@XmlRootElement(name = "FEXGetPARAM_Cbte_TipoResponse")
public class FEXGetPARAMCbteTipoResponse {

    @XmlElement(name = "FEXGetPARAM_Cbte_TipoResult")
    protected FEXResponseCbteTipo fexGetPARAMCbteTipoResult;

    /**
     * Gets the value of the fexGetPARAMCbteTipoResult property.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseCbteTipo }
     *     
     */
    public FEXResponseCbteTipo getFEXGetPARAMCbteTipoResult() {
        return fexGetPARAMCbteTipoResult;
    }

    /**
     * Sets the value of the fexGetPARAMCbteTipoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseCbteTipo }
     *     
     */
    public void setFEXGetPARAMCbteTipoResult(FEXResponseCbteTipo value) {
        this.fexGetPARAMCbteTipoResult = value;
    }

}
