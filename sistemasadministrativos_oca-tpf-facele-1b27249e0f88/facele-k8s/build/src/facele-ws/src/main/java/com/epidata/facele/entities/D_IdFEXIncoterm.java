/**
ORM domain class for: IdFEXIncoterm
Generated: 2025-10-21 15:27:38
Código de incoterm
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de incoterm"
*/
public class D_IdFEXIncoterm extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "IdFEXIncoterm"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "IdFEXIncoterm"
    */
    public String get() {
        return m_value;
    }

}
