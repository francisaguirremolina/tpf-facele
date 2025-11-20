
package com.epidata.facele.ws.arca.wsfev1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cotizacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cotizacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MonCotiz" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FchCotiz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cotizacion", propOrder = {
    "monId",
    "monCotiz",
    "fchCotiz"
})
public class Cotizacion {

    /**
     *
     */
    @XmlElement(name = "MonId")
    protected String monId;

    /**
     *
     */
    @XmlElement(name = "MonCotiz")
    protected double monCotiz;

    /**
     *
     */
    @XmlElement(name = "FchCotiz")
    protected String fchCotiz;

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
     * Gets the value of the monCotiz property.
     * 
     * @return 
     */
    public double getMonCotiz() {
        return monCotiz;
    }

    /**
     * Sets the value of the monCotiz property.
     * 
     * @param value
     */
    public void setMonCotiz(double value) {
        this.monCotiz = value;
    }

    /**
     * Gets the value of the fchCotiz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFchCotiz() {
        return fchCotiz;
    }

    /**
     * Sets the value of the fchCotiz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFchCotiz(String value) {
        this.fchCotiz = value;
    }

}
