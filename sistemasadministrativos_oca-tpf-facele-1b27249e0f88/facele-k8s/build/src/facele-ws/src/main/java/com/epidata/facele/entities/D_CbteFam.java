/**
ORM domain class for: CbteFam
Generated: 2025-10-21 15:27:38
Familia de comprobante (FAC, ND, NC, CVLP, FCEM, etc.)
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Familia de comprobante (FAC, ND, NC, CVLP, FCEM, etc.)"
*/
public class D_CbteFam extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "CbteFam"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "CbteFam"
    */
    public String get() {
        return m_value;
    }

}
