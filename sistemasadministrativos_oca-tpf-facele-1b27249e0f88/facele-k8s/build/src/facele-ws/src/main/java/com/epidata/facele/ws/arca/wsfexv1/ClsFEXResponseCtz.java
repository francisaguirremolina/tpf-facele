
package com.epidata.facele.ws.arca.wsfexv1;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClsFEXResponse_Ctz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_Ctz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mon_ctz" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Mon_fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_Ctz", propOrder = {
    "monCtz",
    "monFecha"
})
public class ClsFEXResponseCtz {

    @XmlElement(name = "Mon_ctz", required = true)
    protected BigDecimal monCtz;
    @XmlElement(name = "Mon_fecha")
    protected String monFecha;

    /**
     * Gets the value of the monCtz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonCtz() {
        return monCtz;
    }

    /**
     * Sets the value of the monCtz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonCtz(BigDecimal value) {
        this.monCtz = value;
    }

    /**
     * Gets the value of the monFecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonFecha() {
        return monFecha;
    }

    /**
     * Sets the value of the monFecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonFecha(String value) {
        this.monFecha = value;
    }

}
