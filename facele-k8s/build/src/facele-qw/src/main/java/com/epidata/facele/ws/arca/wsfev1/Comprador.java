
package com.epidata.facele.ws.arca.wsfev1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Comprador complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Comprador"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocTipo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DocNro" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Porcentaje" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Comprador", propOrder = {
    "docTipo",
    "docNro",
    "porcentaje"
})
public class Comprador {

    /**
     *
     */
    @XmlElement(name = "DocTipo")
    protected int docTipo;

    /**
     *
     */
    @XmlElement(name = "DocNro")
    protected long docNro;

    /**
     *
     */
    @XmlElement(name = "Porcentaje")
    protected double porcentaje;

    /**
     * Gets the value of the docTipo property.
     * 
     * @return 
     */
    public int getDocTipo() {
        return docTipo;
    }

    /**
     * Sets the value of the docTipo property.
     * 
     * @param value
     */
    public void setDocTipo(int value) {
        this.docTipo = value;
    }

    /**
     * Gets the value of the docNro property.
     * 
     * @return 
     */
    public long getDocNro() {
        return docNro;
    }

    /**
     * Sets the value of the docNro property.
     * 
     * @param value
     */
    public void setDocNro(long value) {
        this.docNro = value;
    }

    /**
     * Gets the value of the porcentaje property.
     * 
     * @return 
     */
    public double getPorcentaje() {
        return porcentaje;
    }

    /**
     * Sets the value of the porcentaje property.
     * 
     * @param value
     */
    public void setPorcentaje(double value) {
        this.porcentaje = value;
    }

}
