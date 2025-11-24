
package com.epidata.facele.ws.arca.wsfexv1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPermiso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPermiso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Permiso" type="{http://ar.gov.afip.dif.fexv1/}Permiso" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPermiso", propOrder = {
    "permiso"
})
public class ArrayOfPermiso {

    @XmlElement(name = "Permiso", nillable = true)
    protected List<Permiso> permiso;

    /**
     * Gets the value of the permiso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permiso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermiso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Permiso }
     * 
     * 
     */
    public List<Permiso> getPermiso() {
        if (permiso == null) {
            permiso = new ArrayList<Permiso>();
        }
        return this.permiso;
    }

}
