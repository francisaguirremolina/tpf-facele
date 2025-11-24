
package com.epidata.facele.ws.arca.wsfexv1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClsFEXResponse_Mon_CON_Cotizacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_Mon_CON_Cotizacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mon_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mon_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mon_ctz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fecha_ctz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_Mon_CON_Cotizacion", propOrder = {
    "monId",
    "monDs",
    "monCtz",
    "fechaCtz"
})
public class ClsFEXResponseMonCONCotizacion {

    @XmlElement(name = "Mon_Id")
    protected String monId;
    @XmlElement(name = "Mon_Ds")
    protected String monDs;
    @XmlElement(name = "Mon_ctz")
    protected String monCtz;
    @XmlElement(name = "Fecha_ctz")
    protected String fechaCtz;

    /**
     * Gets the value of the monId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonId() {
        return monId;
    }

    /**
     * Sets the value of the monId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonId(String value) {
        this.monId = value;
    }

    /**
     * Gets the value of the monDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonDs() {
        return monDs;
    }

    /**
     * Sets the value of the monDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonDs(String value) {
        this.monDs = value;
    }

    /**
     * Gets the value of the monCtz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonCtz() {
        return monCtz;
    }

    /**
     * Sets the value of the monCtz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonCtz(String value) {
        this.monCtz = value;
    }

    /**
     * Gets the value of the fechaCtz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCtz() {
        return fechaCtz;
    }

    /**
     * Sets the value of the fechaCtz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCtz(String value) {
        this.fechaCtz = value;
    }

}
