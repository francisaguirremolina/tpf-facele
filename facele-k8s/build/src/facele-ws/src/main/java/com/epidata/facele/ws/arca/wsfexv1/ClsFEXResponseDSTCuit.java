
package com.epidata.facele.ws.arca.wsfexv1;

import com.epidata.facele.ws.arca.wsfev1.AbstractArcaModel;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClsFEXResponse_DST_cuit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_DST_cuit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DST_CUIT" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DST_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_DST_cuit", propOrder = {
    "dstcuit",
    "dstDs"
})
public class ClsFEXResponseDSTCuit extends AbstractArcaModel {

    @XmlElement(name = "DST_CUIT")
    protected long dstcuit;
    @XmlElement(name = "DST_Ds")
    protected String dstDs;

    /**
     * Gets the value of the dstcuit property.
     * 
     */
    public long getDSTCUIT() {
        return dstcuit;
    }

    @Override
    public Object getModelId() {
        return getDSTCUIT();
    }

    /**
     * Sets the value of the dstcuit property.
     * 
     */
    public void setDSTCUIT(long value) {
        this.dstcuit = value;
    }

    /**
     * Gets the value of the dstDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSTDs() {
        return dstDs;
    }

    /**
     * Sets the value of the dstDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSTDs(String value) {
        this.dstDs = value;
    }

}
