
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
 *         &lt;element name="FEXGetPARAM_ActividadesResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_Actividades" minOccurs="0"/>
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
    "fexGetPARAMActividadesResult"
})
@XmlRootElement(name = "FEXGetPARAM_ActividadesResponse")
public class FEXGetPARAMActividadesResponse {

    @XmlElement(name = "FEXGetPARAM_ActividadesResult")
    protected FEXResponseActividades fexGetPARAMActividadesResult;

    /**
     * Gets the value of the fexGetPARAMActividadesResult property.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseActividades }
     *     
     */
    public FEXResponseActividades getFEXGetPARAMActividadesResult() {
        return fexGetPARAMActividadesResult;
    }

    /**
     * Sets the value of the fexGetPARAMActividadesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseActividades }
     *     
     */
    public void setFEXGetPARAMActividadesResult(FEXResponseActividades value) {
        this.fexGetPARAMActividadesResult = value;
    }

}
