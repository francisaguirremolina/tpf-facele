/**
ORM domain class for: QR
Generated: 2025-10-21 15:27:38
Contenido del código QR exigido por AFIP, según RG 4291
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Contenido del código QR exigido por AFIP, según RG 4291"
*/
public class D_QR extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "QR"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "QR"
    */
    public String get() {
        return m_value;
    }

}
