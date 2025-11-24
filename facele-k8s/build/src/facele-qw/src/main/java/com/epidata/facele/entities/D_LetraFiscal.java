/**
ORM domain class for: LetraFiscal
Generated: 2025-10-21 15:27:38
Letra fiscal de un comprobante: 
"A", "B", "C", "M", "R", "E", "X"
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Letra fiscal de un comprobante: 
"A", "B", "C", "M", "R", "E", "X""
*/
public class D_LetraFiscal extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "LetraFiscal"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "LetraFiscal"
    */
    public String get() {
        return m_value;
    }

}
