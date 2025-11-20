/**
ORM domain class for: FullFileName
Generated: 2025-10-21 15:27:38
Nombre completo de archivo
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Nombre completo de archivo"
*/
public class D_FullFileName extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "FullFileName"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "FullFileName"
    */
    public String get() {
        return m_value;
    }

}
