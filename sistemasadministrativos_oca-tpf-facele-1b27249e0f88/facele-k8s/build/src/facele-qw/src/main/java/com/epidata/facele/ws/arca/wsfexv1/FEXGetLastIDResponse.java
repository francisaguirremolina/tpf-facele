
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
 *         &lt;element name="FEXGetLast_IDResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_LastID" minOccurs="0"/>
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
    "fexGetLastIDResult"
})
@XmlRootElement(name = "FEXGetLast_IDResponse")
public class FEXGetLastIDResponse {

    @XmlElement(name = "FEXGetLast_IDResult")
    protected FEXResponseLastID fexGetLastIDResult;

    /**
     * Gets the value of the fexGetLastIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseLastID }
     *     
     */
    public FEXResponseLastID getFEXGetLastIDResult() {
        return fexGetLastIDResult;
    }

    /**
     * Sets the value of the fexGetLastIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseLastID }
     *     
     */
    public void setFEXGetLastIDResult(FEXResponseLastID value) {
        this.fexGetLastIDResult = value;
    }

}
