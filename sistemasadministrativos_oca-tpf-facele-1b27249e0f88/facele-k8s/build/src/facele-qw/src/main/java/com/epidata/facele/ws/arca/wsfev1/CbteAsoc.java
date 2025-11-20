
package com.epidata.facele.ws.arca.wsfev1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbteAsoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CbteAsoc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PtoVta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nro" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Cuit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CbteFch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CbteAsoc", propOrder = {
    "tipo",
    "ptoVta",
    "nro",
    "cuit",
    "cbteFch"
})
public class CbteAsoc {

    /**
     *
     */
    @XmlElement(name = "Tipo")
    protected int tipo;

    /**
     *
     */
    @XmlElement(name = "PtoVta")
    protected int ptoVta;

    /**
     *
     */
    @XmlElement(name = "Nro")
    protected long nro;

    /**
     *
     */
    @XmlElement(name = "Cuit")
    protected String cuit;

    /**
     *
     */
    @XmlElement(name = "CbteFch")
    protected String cbteFch;

    /**
     * Gets the value of the tipo property.
     * 
     * @return 
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     */
    public void setTipo(int value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the ptoVta property.
     * 
     * @return 
     */
    public int getPtoVta() {
        return ptoVta;
    }

    /**
     * Sets the value of the ptoVta property.
     * 
     * @param value
     */
    public void setPtoVta(int value) {
        this.ptoVta = value;
    }

    /**
     * Gets the value of the nro property.
     * 
     * @return 
     */
    public long getNro() {
        return nro;
    }

    /**
     * Sets the value of the nro property.
     * 
     * @param value
     */
    public void setNro(long value) {
        this.nro = value;
    }

    /**
     * Gets the value of the cuit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuit() {
        return cuit;
    }

    /**
     * Sets the value of the cuit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuit(String value) {
        this.cuit = value;
    }

    /**
     * Gets the value of the cbteFch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbteFch() {
        return cbteFch;
    }

    /**
     * Sets the value of the cbteFch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbteFch(String value) {
        this.cbteFch = value;
    }

}
