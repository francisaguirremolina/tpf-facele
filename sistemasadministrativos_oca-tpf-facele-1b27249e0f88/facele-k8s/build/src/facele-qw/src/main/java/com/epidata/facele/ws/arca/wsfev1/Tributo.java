
package com.epidata.facele.ws.arca.wsfev1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tributo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tributo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BaseImp" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Alic" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Importe" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tributo", propOrder = {
    "id",
    "desc",
    "baseImp",
    "alic",
    "importe"
})
public class Tributo {

    /**
     *
     */
    @XmlElement(name = "Id")
    protected short id;

    /**
     *
     */
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     *
     */
    @XmlElement(name = "BaseImp")
    protected double baseImp;

    /**
     *
     */
    @XmlElement(name = "Alic")
    protected double alic;

    /**
     *
     */
    @XmlElement(name = "Importe")
    protected double importe;

    /**
     * Gets the value of the id property.
     * 
     * @return 
     */
    public short getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     */
    public void setId(short value) {
        this.id = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the baseImp property.
     * 
     * @return 
     */
    public double getBaseImp() {
        return baseImp;
    }

    /**
     * Sets the value of the baseImp property.
     * 
     * @param value
     */
    public void setBaseImp(double value) {
        this.baseImp = value;
    }

    /**
     * Gets the value of the alic property.
     * 
     * @return 
     */
    public double getAlic() {
        return alic;
    }

    /**
     * Sets the value of the alic property.
     * 
     * @param value
     */
    public void setAlic(double value) {
        this.alic = value;
    }

    /**
     * Gets the value of the importe property.
     * 
     * @return 
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Sets the value of the importe property.
     * 
     * @param value
     */
    public void setImporte(double value) {
        this.importe = value;
    }

}
