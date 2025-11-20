/**
ORM domain class for: Descripcion
Generated: 2025-10-21 15:27:38
Descripción
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Descripción"
*/
public class D_Descripcion extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "Descripcion"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "Descripcion"
    */
    public String get() {
        return m_value;
    }

}
