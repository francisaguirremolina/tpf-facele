package com.epidata.facele.ws.arca.wsfexv1;

import com.epidata.facele.ws.arca.wsfev1.AbstractArcaModel;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ClsFEXResponse_UMed complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ClsFEXResponse_UMed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Umed_Id" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Umed_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Umed_vig_desde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Umed_vig_hasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_UMed", propOrder = {
    "umedId",
    "umedDs",
    "umedVigDesde",
    "umedVigHasta"
})
public class ClsFEXResponseUMed extends AbstractArcaModel {

    @XmlElement(name = "Umed_Id")
    protected short umedId;
    @XmlElement(name = "Umed_Ds")
    protected String umedDs;
    @XmlElement(name = "Umed_vig_desde")
    protected String umedVigDesde;
    @XmlElement(name = "Umed_vig_hasta")
    protected String umedVigHasta;

    @Override
    public Object getModelId() {
        return getUmedId();
    }

    /**
     * Gets the value of the umedId property.
     *
     */
    public short getUmedId() {
        return umedId;
    }

    /**
     * Sets the value of the umedId property.
     *
     */
    public void setUmedId(short value) {
        this.umedId = value;
    }

    /**
     * Gets the value of the umedDs property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUmedDs() {
        return umedDs;
    }

    /**
     * Sets the value of the umedDs property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUmedDs(String value) {
        this.umedDs = value;
    }

    /**
     * Gets the value of the umedVigDesde property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUmedVigDesde() {
        return umedVigDesde;
    }

    /**
     * Sets the value of the umedVigDesde property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUmedVigDesde(String value) {
        this.umedVigDesde = value;
    }

    /**
     * Gets the value of the umedVigHasta property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUmedVigHasta() {
        return umedVigHasta;
    }

    /**
     * Sets the value of the umedVigHasta property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUmedVigHasta(String value) {
        this.umedVigHasta = value;
    }

}
