
package com.epidata.facele.ws.arca.wsaa;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="loginCmsReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loginCmsReturn"
})
@XmlRootElement(name = "loginCmsResponse")
public class LoginCmsResponse {

    /**
     *
     */
    @XmlElement(required = true)
    protected String loginCmsReturn;

    /**
     * Gets the value of the loginCmsReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginCmsReturn() {
        return loginCmsReturn;
    }

    /**
     * Sets the value of the loginCmsReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginCmsReturn(String value) {
        this.loginCmsReturn = value;
    }

}
