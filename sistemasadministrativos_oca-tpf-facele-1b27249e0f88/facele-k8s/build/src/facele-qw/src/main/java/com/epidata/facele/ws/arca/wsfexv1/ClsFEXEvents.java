
package com.epidata.facele.ws.arca.wsfexv1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClsFEXEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EventMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXEvents", propOrder = {
    "eventCode",
    "eventMsg"
})
public class ClsFEXEvents {

    @XmlElement(name = "EventCode")
    protected int eventCode;
    @XmlElement(name = "EventMsg")
    protected String eventMsg;

    /**
     * Gets the value of the eventCode property.
     * 
     */
    public int getEventCode() {
        return eventCode;
    }

    /**
     * Sets the value of the eventCode property.
     * 
     */
    public void setEventCode(int value) {
        this.eventCode = value;
    }

    /**
     * Gets the value of the eventMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventMsg() {
        return eventMsg;
    }

    /**
     * Sets the value of the eventMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventMsg(String value) {
        this.eventMsg = value;
    }

}
