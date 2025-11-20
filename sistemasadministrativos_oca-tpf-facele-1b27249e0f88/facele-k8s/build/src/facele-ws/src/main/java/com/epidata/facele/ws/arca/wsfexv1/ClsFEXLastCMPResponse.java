
package com.epidata.facele.ws.arca.wsfexv1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClsFEX_LastCMP_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClsFEX_LastCMP_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cbte_nro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Cbte_fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEX_LastCMP_Response", propOrder = {
    "cbteNro",
    "cbteFecha"
})
public class ClsFEXLastCMPResponse {

    @XmlElement(name = "Cbte_nro")
    protected long cbteNro;
    @XmlElement(name = "Cbte_fecha")
    protected String cbteFecha;

    /**
     * Gets the value of the cbteNro property.
     * 
     */
    public long getCbteNro() {
        return cbteNro;
    }

    /**
     * Sets the value of the cbteNro property.
     * 
     */
    public void setCbteNro(long value) {
        this.cbteNro = value;
    }

    /**
     * Gets the value of the cbteFecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbteFecha() {
        return cbteFecha;
    }

    /**
     * Sets the value of the cbteFecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbteFecha(String value) {
        this.cbteFecha = value;
    }

}
