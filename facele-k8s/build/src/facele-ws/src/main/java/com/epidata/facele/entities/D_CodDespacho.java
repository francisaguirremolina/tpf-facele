/**
ORM domain class for: CodDespacho
Generated: 2025-10-21 15:27:38
Código de despacho o permiso de embarque
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de despacho o permiso de embarque"
*/
public class D_CodDespacho extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "CodDespacho"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "CodDespacho"
    */
    public String get() {
        return m_value;
    }

}
