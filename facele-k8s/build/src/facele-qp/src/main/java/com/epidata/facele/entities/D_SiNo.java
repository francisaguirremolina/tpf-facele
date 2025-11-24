/**
ORM domain class for: SiNo
Generated: 2025-10-21 15:27:38
"S": sí; "N": no
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: ""S": sí; "N": no"
*/
public class D_SiNo extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "SiNo"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "SiNo"
    */
    public String get() {
        return m_value;
    }

}
