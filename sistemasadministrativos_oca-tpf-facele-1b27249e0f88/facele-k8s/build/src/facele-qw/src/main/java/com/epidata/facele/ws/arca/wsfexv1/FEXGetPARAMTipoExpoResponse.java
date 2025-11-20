
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
 *         &lt;element name="FEXGetPARAM_Tipo_ExpoResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_Tex" minOccurs="0"/>
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
    "fexGetPARAMTipoExpoResult"
})
@XmlRootElement(name = "FEXGetPARAM_Tipo_ExpoResponse")
public class FEXGetPARAMTipoExpoResponse {

    @XmlElement(name = "FEXGetPARAM_Tipo_ExpoResult")
    protected FEXResponseTex fexGetPARAMTipoExpoResult;

    /**
     * Gets the value of the fexGetPARAMTipoExpoResult property.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseTex }
     *     
     */
    public FEXResponseTex getFEXGetPARAMTipoExpoResult() {
        return fexGetPARAMTipoExpoResult;
    }

    /**
     * Sets the value of the fexGetPARAMTipoExpoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseTex }
     *     
     */
    public void setFEXGetPARAMTipoExpoResult(FEXResponseTex value) {
        this.fexGetPARAMTipoExpoResult = value;
    }

}
