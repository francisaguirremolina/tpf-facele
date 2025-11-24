/**
ORM domain class for: CmpClase
Generated: 2025-10-21 15:27:38
Clase de comprobante ("A/M/C", "B/C", etc.)
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Clase de comprobante ("A/M/C", "B/C", etc.)"
*/
public class D_CmpClase extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "CmpClase"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "CmpClase"
    */
    public String get() {
        return m_value;
    }

}
