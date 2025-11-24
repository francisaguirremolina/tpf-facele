/**
ORM domain class for: SqlBigInt
Generated: 2025-10-21 15:27:38
Entero con signo, de 64 bits.
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Entero con signo, de 64 bits."
*/
public class D_SqlBigInt extends AbstractDomain {

    private Long m_value;

    /**
    Establece el valor de "SqlBigInt"
    */
    public void set(Long p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "SqlBigInt"
    */
    public Long get() {
        return m_value;
    }

}
