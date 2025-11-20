/**
ORM domain class for: IdPais
Generated: 2025-10-21 15:27:38
Código de país
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de país"
*/
public class D_IdPais extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "IdPais"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "IdPais"
    */
    public Integer get() {
        return m_value;
    }

}
