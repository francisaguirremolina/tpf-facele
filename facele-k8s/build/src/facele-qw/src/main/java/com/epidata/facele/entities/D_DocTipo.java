/**
ORM domain class for: DocTipo
Generated: 2025-10-21 15:27:38
Código de documento identificatorio del comprador
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de documento identificatorio del comprador"
*/
public class D_DocTipo extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "DocTipo"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "DocTipo"
    */
    public Integer get() {
        return m_value;
    }

}
