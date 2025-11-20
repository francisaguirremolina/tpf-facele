/**
ORM domain class for: SqlText
Generated: 2025-10-21 15:27:38
Texto largo
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Texto largo"
*/
public class D_SqlText extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "SqlText"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "SqlText"
    */
    public String get() {
        return m_value;
    }

}
