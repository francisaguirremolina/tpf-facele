/**
ORM domain class for: Fecha
Generated: 2025-10-21 15:27:38
Fecha
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Fecha"
*/
public class D_Fecha extends AbstractDomain {

    private Date m_value;

    /**
    Establece el valor de "Fecha"
    */
    public void set(Date p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "Fecha"
    */
    public Date get() {
        return m_value;
    }

}
