
package com.epidata.facele.ws.arca.wsfexv1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Auth" type="{http://ar.gov.afip.dif.fexv1/}ClsFEXAuthRequest" minOccurs="0"/>
 *         &lt;element name="ID_Permiso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dst_merc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "auth",
    "idPermiso",
    "dstMerc"
})
@XmlRootElement(name = "FEXCheck_Permiso")
public class FEXCheckPermiso {

    @XmlElement(name = "Auth")
    protected ClsFEXAuthRequest auth;
    @XmlElement(name = "ID_Permiso")
    protected String idPermiso;
    @XmlElement(name = "Dst_merc")
    protected int dstMerc;

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link ClsFEXAuthRequest }
     *     
     */
    public ClsFEXAuthRequest getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsFEXAuthRequest }
     *     
     */
    public void setAuth(ClsFEXAuthRequest value) {
        this.auth = value;
    }

    /**
     * Gets the value of the idPermiso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDPermiso() {
        return idPermiso;
    }

    /**
     * Sets the value of the idPermiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDPermiso(String value) {
        this.idPermiso = value;
    }

    /**
     * Gets the value of the dstMerc property.
     * 
     */
    public int getDstMerc() {
        return dstMerc;
    }

    /**
     * Sets the value of the dstMerc property.
     * 
     */
    public void setDstMerc(int value) {
        this.dstMerc = value;
    }

}
