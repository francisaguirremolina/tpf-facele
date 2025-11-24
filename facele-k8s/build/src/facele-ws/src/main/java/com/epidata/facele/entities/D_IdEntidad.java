/**
ORM domain class for: IdEntidad
Generated: 2025-10-21 15:27:38
Código genérico de alguna entidad de otro modelo de datos
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código genérico de alguna entidad de otro modelo de datos"
*/
public class D_IdEntidad extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "IdEntidad"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "IdEntidad"
    */
    public Integer get() {
        return m_value;
    }

}
