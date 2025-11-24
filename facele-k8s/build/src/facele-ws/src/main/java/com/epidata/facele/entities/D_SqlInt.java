/**
ORM domain class for: SqlInt
Generated: 2025-10-21 15:27:38
Entero con signo, de 32 bits.
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Entero con signo, de 32 bits."
*/
public class D_SqlInt extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "SqlInt"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "SqlInt"
    */
    public Integer get() {
        return m_value;
    }

}
