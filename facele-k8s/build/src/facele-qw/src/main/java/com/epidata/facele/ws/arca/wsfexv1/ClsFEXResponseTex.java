package com.epidata.facele.ws.arca.wsfexv1;

import com.epidata.facele.ws.arca.wsfev1.AbstractArcaModel;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ClsFEXResponse_Tex complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ClsFEXResponse_Tex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tex_Id" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Tex_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tex_vig_desde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tex_vig_hasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_Tex", propOrder = {
    "texId",
    "texDs",
    "texVigDesde",
    "texVigHasta"
})
public class ClsFEXResponseTex extends AbstractArcaModel {

    @XmlElement(name = "Tex_Id")
    protected short texId;
    @XmlElement(name = "Tex_Ds")
    protected String texDs;
    @XmlElement(name = "Tex_vig_desde")
    protected String texVigDesde;
    @XmlElement(name = "Tex_vig_hasta")
    protected String texVigHasta;

    @Override
    public Object getModelId() {
        return getTexId();
    }

    /**
     * Gets the value of the texId property.
     *
     */
    public short getTexId() {
        return texId;
    }

    /**
     * Sets the value of the texId property.
     *
     */
    public void setTexId(short value) {
        this.texId = value;
    }

    /**
     * Gets the value of the texDs property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTexDs() {
        return texDs;
    }

    /**
     * Sets the value of the texDs property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTexDs(String value) {
        this.texDs = value;
    }

    /**
     * Gets the value of the texVigDesde property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTexVigDesde() {
        return texVigDesde;
    }

    /**
     * Sets the value of the texVigDesde property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTexVigDesde(String value) {
        this.texVigDesde = value;
    }

    /**
     * Gets the value of the texVigHasta property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTexVigHasta() {
        return texVigHasta;
    }

    /**
     * Sets the value of the texVigHasta property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTexVigHasta(String value) {
        this.texVigHasta = value;
    }

}
