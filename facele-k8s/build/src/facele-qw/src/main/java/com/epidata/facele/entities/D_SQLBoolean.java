/**
ORM domain class for: SQLBoolean
Generated: 2025-10-21 15:27:38
Sí / no
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Sí / no"
*/
public class D_SQLBoolean extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "SQLBoolean"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "SQLBoolean"
    */
    public Integer get() {
        return m_value;
    }

}
