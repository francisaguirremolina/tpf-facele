
package com.epidata.facele.ws.arca.wsfev1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActividadesTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActividadesTipo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Orden" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActividadesTipo", propOrder = {
    "id",
    "orden",
    "desc"
})
public class ActividadesTipo {

    /**
     *
     */
    @XmlElement(name = "Id")
    protected long id;

    /**
     *
     */
    @XmlElement(name = "Orden")
    protected short orden;

    /**
     *
     */
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the id property.
     * 
     * @return 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the orden property.
     * 
     * @return 
     */
    public short getOrden() {
        return orden;
    }

    /**
     * Sets the value of the orden property.
     * 
     * @param value
     */
    public void setOrden(short value) {
        this.orden = value;
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

}
