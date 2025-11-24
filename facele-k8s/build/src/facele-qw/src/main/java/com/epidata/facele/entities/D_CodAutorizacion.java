/**
ORM domain class for: CodAutorizacion
Generated: 2025-10-21 15:27:38
Código de autorización otorgado por AFIP (CAE)
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de autorización otorgado por AFIP (CAE)"
*/
public class D_CodAutorizacion extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "CodAutorizacion"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "CodAutorizacion"
    */
    public String get() {
        return m_value;
    }

}
