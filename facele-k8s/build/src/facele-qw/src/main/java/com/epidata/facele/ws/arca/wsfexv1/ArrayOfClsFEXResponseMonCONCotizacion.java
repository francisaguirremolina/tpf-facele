
package com.epidata.facele.ws.arca.wsfexv1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClsFEXResponse_Mon_CON_Cotizacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClsFEXResponse_Mon_CON_Cotizacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClsFEXResponse_Mon_CON_Cotizacion" type="{http://ar.gov.afip.dif.fexv1/}ClsFEXResponse_Mon_CON_Cotizacion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsFEXResponse_Mon_CON_Cotizacion", propOrder = {
    "clsFEXResponseMonCONCotizacion"
})
public class ArrayOfClsFEXResponseMonCONCotizacion {

    @XmlElement(name = "ClsFEXResponse_Mon_CON_Cotizacion", nillable = true)
    protected List<ClsFEXResponseMonCONCotizacion> clsFEXResponseMonCONCotizacion;

    /**
     * Gets the value of the clsFEXResponseMonCONCotizacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsFEXResponseMonCONCotizacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsFEXResponseMonCONCotizacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsFEXResponseMonCONCotizacion }
     * 
     * 
     */
    public List<ClsFEXResponseMonCONCotizacion> getClsFEXResponseMonCONCotizacion() {
        if (clsFEXResponseMonCONCotizacion == null) {
            clsFEXResponseMonCONCotizacion = new ArrayList<ClsFEXResponseMonCONCotizacion>();
        }
        return this.clsFEXResponseMonCONCotizacion;
    }

}
