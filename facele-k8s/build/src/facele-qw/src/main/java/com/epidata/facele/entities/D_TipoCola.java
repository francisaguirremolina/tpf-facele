/**
ORM domain class for: TipoCola
Generated: 2025-10-21 15:27:38
Tipo de cola: "QW" o "QP"
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Tipo de cola: "QW" o "QP""
*/
public class D_TipoCola extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "TipoCola"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "TipoCola"
    */
    public String get() {
        return m_value;
    }

}
