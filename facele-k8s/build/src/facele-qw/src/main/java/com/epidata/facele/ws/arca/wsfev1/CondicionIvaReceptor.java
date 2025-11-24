
package com.epidata.facele.ws.arca.wsfev1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CondicionIvaReceptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CondicionIvaReceptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cmp_Clase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CondicionIvaReceptor", propOrder = {
    "id",
    "desc",
    "cmpClase"
})
public class CondicionIvaReceptor extends AbstractArcaModel {

    /**
     *
     */
    @XmlElement(name = "Id")
    protected int id;

    /**
     *
     */
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     *
     */
    @XmlElement(name = "Cmp_Clase")
    protected String cmpClase;

    /**
     * Gets the value of the id property.
     * 
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return
     */
    @Override
    public Object getModelId() {
        return getId();
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
     * Gets the value of the cmpClase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmpClase() {
        return cmpClase;
    }

    /**
     * Sets the value of the cmpClase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmpClase(String value) {
        this.cmpClase = value;
    }

}
