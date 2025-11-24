
package com.epidata.facele.ws.arca.wsfexv1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cmp_asoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cmp_asoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cbte_tipo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Cbte_punto_vta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cbte_nro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Cbte_cuit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cmp_asoc", propOrder = {
    "cbteTipo",
    "cbtePuntoVta",
    "cbteNro",
    "cbteCuit"
})
public class CmpAsoc {

    @XmlElement(name = "Cbte_tipo")
    protected short cbteTipo;
    @XmlElement(name = "Cbte_punto_vta")
    protected int cbtePuntoVta;
    @XmlElement(name = "Cbte_nro")
    protected long cbteNro;
    @XmlElement(name = "Cbte_cuit")
    protected long cbteCuit;

    /**
     * Gets the value of the cbteTipo property.
     * 
     */
    public short getCbteTipo() {
        return cbteTipo;
    }

    /**
     * Sets the value of the cbteTipo property.
     * 
     */
    public void setCbteTipo(short value) {
        this.cbteTipo = value;
    }

    /**
     * Gets the value of the cbtePuntoVta property.
     * 
     */
    public int getCbtePuntoVta() {
        return cbtePuntoVta;
    }

    /**
     * Sets the value of the cbtePuntoVta property.
     * 
     */
    public void setCbtePuntoVta(int value) {
        this.cbtePuntoVta = value;
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
     * Gets the value of the cbteCuit property.
     * 
     */
    public long getCbteCuit() {
        return cbteCuit;
    }

    /**
     * Sets the value of the cbteCuit property.
     * 
     */
    public void setCbteCuit(long value) {
        this.cbteCuit = value;
    }

}
