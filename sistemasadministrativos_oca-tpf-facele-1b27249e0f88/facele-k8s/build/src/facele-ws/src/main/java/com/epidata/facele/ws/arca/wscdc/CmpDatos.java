
package com.epidata.facele.ws.arca.wscdc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CmpDatos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CmpDatos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CbteModo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CuitEmisor" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PtoVta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CbteTipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CbteNro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CbteFch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImpTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CodAutorizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocTipoReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocNroReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opcionales" type="{http://servicios1.afip.gob.ar/wscdc/}ArrayOfOpcional" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CmpDatos", propOrder = {
    "cbteModo",
    "cuitEmisor",
    "ptoVta",
    "cbteTipo",
    "cbteNro",
    "cbteFch",
    "impTotal",
    "codAutorizacion",
    "docTipoReceptor",
    "docNroReceptor",
    "opcionales"
})
public class CmpDatos {

    @XmlElement(name = "CbteModo")
    protected String cbteModo;
    @XmlElement(name = "CuitEmisor")
    protected long cuitEmisor;
    @XmlElement(name = "PtoVta")
    protected int ptoVta;
    @XmlElement(name = "CbteTipo")
    protected int cbteTipo;
    @XmlElement(name = "CbteNro")
    protected long cbteNro;
    @XmlElement(name = "CbteFch")
    protected String cbteFch;
    @XmlElement(name = "ImpTotal")
    protected double impTotal;
    @XmlElement(name = "CodAutorizacion")
    protected String codAutorizacion;
    @XmlElement(name = "DocTipoReceptor")
    protected String docTipoReceptor;
    @XmlElement(name = "DocNroReceptor")
    protected String docNroReceptor;
    @XmlElement(name = "Opcionales")
    protected ArrayOfOpcional opcionales;

    /**
     * Gets the value of the cbteModo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbteModo() {
        return cbteModo;
    }

    /**
     * Sets the value of the cbteModo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbteModo(String value) {
        this.cbteModo = value;
    }

    /**
     * Gets the value of the cuitEmisor property.
     * 
     */
    public long getCuitEmisor() {
        return cuitEmisor;
    }

    /**
     * Sets the value of the cuitEmisor property.
     * 
     */
    public void setCuitEmisor(long value) {
        this.cuitEmisor = value;
    }

    /**
     * Gets the value of the ptoVta property.
     * 
     */
    public int getPtoVta() {
        return ptoVta;
    }

    /**
     * Sets the value of the ptoVta property.
     * 
     */
    public void setPtoVta(int value) {
        this.ptoVta = value;
    }

    /**
     * Gets the value of the cbteTipo property.
     * 
     */
    public int getCbteTipo() {
        return cbteTipo;
    }

    /**
     * Sets the value of the cbteTipo property.
     * 
     */
    public void setCbteTipo(int value) {
        this.cbteTipo = value;
    }

    /**
     * Gets the value of the cbteNro property.
     * 
     */
    public long getCbteNro() {
        return cbteNro;
    }

    /**
     * Sets the value of the cbteNro property.
     * 
     */
    public void setCbteNro(long value) {
        this.cbteNro = value;
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

    /**
     * Gets the value of the impTotal property.
     * 
     */
    public double getImpTotal() {
        return impTotal;
    }

    /**
     * Sets the value of the impTotal property.
     * 
     */
    public void setImpTotal(double value) {
        this.impTotal = value;
    }

    /**
     * Gets the value of the codAutorizacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAutorizacion() {
        return codAutorizacion;
    }

    /**
     * Sets the value of the codAutorizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAutorizacion(String value) {
        this.codAutorizacion = value;
    }

    /**
     * Gets the value of the docTipoReceptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTipoReceptor() {
        return docTipoReceptor;
    }

    /**
     * Sets the value of the docTipoReceptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTipoReceptor(String value) {
        this.docTipoReceptor = value;
    }

    /**
     * Gets the value of the docNroReceptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNroReceptor() {
        return docNroReceptor;
    }

    /**
     * Sets the value of the docNroReceptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNroReceptor(String value) {
        this.docNroReceptor = value;
    }

    /**
     * Gets the value of the opcionales property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOpcional }
     *     
     */
    public ArrayOfOpcional getOpcionales() {
        return opcionales;
    }

    /**
     * Sets the value of the opcionales property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOpcional }
     *     
     */
    public void setOpcionales(ArrayOfOpcional value) {
        this.opcionales = value;
    }

}
