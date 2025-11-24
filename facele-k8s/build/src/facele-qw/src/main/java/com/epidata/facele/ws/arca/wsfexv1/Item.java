
package com.epidata.facele.ws.arca.wsfexv1;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pro_codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pro_ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pro_qty" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Pro_umed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Pro_precio_uni" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Pro_bonificacion" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Pro_total_item" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
    "proCodigo",
    "proDs",
    "proQty",
    "proUmed",
    "proPrecioUni",
    "proBonificacion",
    "proTotalItem"
})
public class Item {

    @XmlElement(name = "Pro_codigo")
    protected String proCodigo;
    @XmlElement(name = "Pro_ds")
    protected String proDs;
    @XmlElement(name = "Pro_qty", required = true)
    protected BigDecimal proQty;
    @XmlElement(name = "Pro_umed")
    protected int proUmed;
    @XmlElement(name = "Pro_precio_uni", required = true)
    protected BigDecimal proPrecioUni;
    @XmlElement(name = "Pro_bonificacion", required = true)
    protected BigDecimal proBonificacion;
    @XmlElement(name = "Pro_total_item", required = true)
    protected BigDecimal proTotalItem;

    /**
     * Gets the value of the proCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProCodigo() {
        return proCodigo;
    }

    /**
     * Sets the value of the proCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProCodigo(String value) {
        this.proCodigo = value;
    }

    /**
     * Gets the value of the proDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProDs() {
        return proDs;
    }

    /**
     * Sets the value of the proDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProDs(String value) {
        this.proDs = value;
    }

    /**
     * Gets the value of the proQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProQty() {
        return proQty;
    }

    /**
     * Sets the value of the proQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProQty(BigDecimal value) {
        this.proQty = value;
    }

    /**
     * Gets the value of the proUmed property.
     * 
     */
    public int getProUmed() {
        return proUmed;
    }

    /**
     * Sets the value of the proUmed property.
     * 
     */
    public void setProUmed(int value) {
        this.proUmed = value;
    }

    /**
     * Gets the value of the proPrecioUni property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProPrecioUni() {
        return proPrecioUni;
    }

    /**
     * Sets the value of the proPrecioUni property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProPrecioUni(BigDecimal value) {
        this.proPrecioUni = value;
    }

    /**
     * Gets the value of the proBonificacion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProBonificacion() {
        return proBonificacion;
    }

    /**
     * Sets the value of the proBonificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProBonificacion(BigDecimal value) {
        this.proBonificacion = value;
    }

    /**
     * Gets the value of the proTotalItem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProTotalItem() {
        return proTotalItem;
    }

    /**
     * Sets the value of the proTotalItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProTotalItem(BigDecimal value) {
        this.proTotalItem = value;
    }

}
