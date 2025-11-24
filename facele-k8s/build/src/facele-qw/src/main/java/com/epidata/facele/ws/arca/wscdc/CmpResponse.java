
package com.epidata.facele.ws.arca.wscdc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CmpResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CmpResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CmpResp" type="{http://servicios1.afip.gob.ar/wscdc/}CmpDatos" minOccurs="0"/>
 *         &lt;element name="Resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Observaciones" type="{http://servicios1.afip.gob.ar/wscdc/}ArrayOfObs" minOccurs="0"/>
 *         &lt;element name="FchProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Events" type="{http://servicios1.afip.gob.ar/wscdc/}ArrayOfEvt" minOccurs="0"/>
 *         &lt;element name="Errors" type="{http://servicios1.afip.gob.ar/wscdc/}ArrayOfErr" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CmpResponse", propOrder = {
    "cmpResp",
    "resultado",
    "observaciones",
    "fchProceso",
    "events",
    "errors"
})
public class CmpResponse {

    @XmlElement(name = "CmpResp")
    protected CmpDatos cmpResp;
    @XmlElement(name = "Resultado")
    protected String resultado;
    @XmlElement(name = "Observaciones")
    protected ArrayOfObs observaciones;
    @XmlElement(name = "FchProceso")
    protected String fchProceso;
    @XmlElement(name = "Events")
    protected ArrayOfEvt events;
    @XmlElement(name = "Errors")
    protected ArrayOfErr errors;

    /**
     * Gets the value of the cmpResp property.
     * 
     * @return
     *     possible object is
     *     {@link CmpDatos }
     *     
     */
    public CmpDatos getCmpResp() {
        return cmpResp;
    }

    /**
     * Sets the value of the cmpResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmpDatos }
     *     
     */
    public void setCmpResp(CmpDatos value) {
        this.cmpResp = value;
    }

    /**
     * Gets the value of the resultado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Sets the value of the resultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Gets the value of the observaciones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObs }
     *     
     */
    public ArrayOfObs getObservaciones() {
        return observaciones;
    }

    /**
     * Sets the value of the observaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObs }
     *     
     */
    public void setObservaciones(ArrayOfObs value) {
        this.observaciones = value;
    }

    /**
     * Gets the value of the fchProceso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFchProceso() {
        return fchProceso;
    }

    /**
     * Sets the value of the fchProceso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFchProceso(String value) {
        this.fchProceso = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEvt }
     *     
     */
    public ArrayOfEvt getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEvt }
     *     
     */
    public void setEvents(ArrayOfEvt value) {
        this.events = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfErr }
     *     
     */
    public ArrayOfErr getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfErr }
     *     
     */
    public void setErrors(ArrayOfErr value) {
        this.errors = value;
    }

}
