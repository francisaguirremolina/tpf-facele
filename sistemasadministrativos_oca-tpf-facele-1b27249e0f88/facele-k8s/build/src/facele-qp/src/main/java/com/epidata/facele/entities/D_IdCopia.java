/**
ORM domain class for: IdCopia
Generated: 2025-10-21 15:27:38
Código de copia de documento electrónico
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de copia de documento electrónico"
*/
public class D_IdCopia extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "IdCopia"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "IdCopia"
    */
    public Integer get() {
        return m_value;
    }

}
