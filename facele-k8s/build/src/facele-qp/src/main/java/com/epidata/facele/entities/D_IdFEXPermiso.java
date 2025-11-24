/**
ORM domain class for: IdFEXPermiso
Generated: 2025-10-21 15:27:38
Código de permiso
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de permiso"
*/
public class D_IdFEXPermiso extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "IdFEXPermiso"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "IdFEXPermiso"
    */
    public Integer get() {
        return m_value;
    }

}
