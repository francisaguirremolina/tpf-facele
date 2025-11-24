
package com.epidata.facele.ws.arca.wsfexv1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClsFEXResponse_Cbte_Tipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClsFEXResponse_Cbte_Tipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClsFEXResponse_Cbte_Tipo" type="{http://ar.gov.afip.dif.fexv1/}ClsFEXResponse_Cbte_Tipo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsFEXResponse_Cbte_Tipo", propOrder = {
    "clsFEXResponseCbteTipo"
})
public class ArrayOfClsFEXResponseCbteTipo {

    @XmlElement(name = "ClsFEXResponse_Cbte_Tipo", nillable = true)
    protected List<ClsFEXResponseCbteTipo> clsFEXResponseCbteTipo;

    /**
     * Gets the value of the clsFEXResponseCbteTipo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsFEXResponseCbteTipo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsFEXResponseCbteTipo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsFEXResponseCbteTipo }
     * 
     * 
     */
    public List<ClsFEXResponseCbteTipo> getClsFEXResponseCbteTipo() {
        if (clsFEXResponseCbteTipo == null) {
            clsFEXResponseCbteTipo = new ArrayList<ClsFEXResponseCbteTipo>();
        }
        return this.clsFEXResponseCbteTipo;
    }

}
