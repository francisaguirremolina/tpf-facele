/**
ORM domain class for: DocNro
Generated: 2025-10-21 15:27:38
Nro. de identificación del comprador
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Nro. de identificación del comprador"
*/
public class D_DocNro extends AbstractDomain {

    private Long m_value;

    /**
    Establece el valor de "DocNro"
    */
    public void set(Long p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "DocNro"
    */
    public Long get() {
        return m_value;
    }

}
