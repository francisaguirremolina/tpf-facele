/**
ORM domain class for: FechaHora
Generated: 2025-10-21 15:27:38
Fecha y hora
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Fecha y hora"
*/
public class D_FechaHora extends AbstractDomain {

    private java.sql.Timestamp m_value;

    /**
    Establece el valor de "FechaHora"
    */
    public void set(java.sql.Timestamp p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "FechaHora"
    */
    public java.sql.Timestamp get() {
        return m_value;
    }

}
