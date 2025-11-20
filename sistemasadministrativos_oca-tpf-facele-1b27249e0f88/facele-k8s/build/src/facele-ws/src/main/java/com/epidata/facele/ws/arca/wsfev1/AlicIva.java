
package com.epidata.facele.ws.arca.wsfev1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlicIva complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlicIva"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BaseImp" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
@XmlType(name = "AlicIva", propOrder = {
    "id",
    "baseImp",
    "importe"
})
public class AlicIva {

    /**
     *
     */
    @XmlElement(name = "Id")
    protected int id;

    /**
     *
     */
    @XmlElement(name = "BaseImp")
    protected double baseImp;

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
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     */
    public void setId(int value) {
        this.id = value;
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
