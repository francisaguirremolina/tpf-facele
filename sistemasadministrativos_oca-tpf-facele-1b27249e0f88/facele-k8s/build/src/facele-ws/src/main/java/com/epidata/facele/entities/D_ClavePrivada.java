/**
ORM domain class for: ClavePrivada
Generated: 2025-10-21 15:27:38
PKCS#8 en formato PEM
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "PKCS#8 en formato PEM"
*/
public class D_ClavePrivada extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "ClavePrivada"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "ClavePrivada"
    */
    public String get() {
        return m_value;
    }

}
