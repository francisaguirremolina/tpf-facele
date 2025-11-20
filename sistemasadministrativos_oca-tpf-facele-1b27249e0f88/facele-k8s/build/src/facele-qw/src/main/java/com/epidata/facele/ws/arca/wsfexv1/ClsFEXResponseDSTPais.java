
package com.epidata.facele.ws.arca.wsfexv1;

import com.epidata.facele.ws.arca.wsfev1.AbstractArcaModel;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClsFEXResponse_DST_pais complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_DST_pais">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DST_Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ClsFEXResponse_DST_pais", propOrder = {
    "dstCodigo",
    "dstDs"
})
public class ClsFEXResponseDSTPais extends AbstractArcaModel {

    @XmlElement(name = "DST_Codigo")
    protected String dstCodigo;
    @XmlElement(name = "DST_Ds")
    protected String dstDs;

    /**
     * Gets the value of the dstCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSTCodigo() {
        return dstCodigo;
    }

    @Override
    public Object getModelId() {
        return getDSTCodigo();
    }

    /**
     * Sets the value of the dstCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSTCodigo(String value) {
        this.dstCodigo = value;
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
