/**
ORM domain class for: UsoNacional
Generated: 2025-10-21 15:27:38
UNO cuando es una entidad de referencia para documentos nacionales
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "UNO cuando es una entidad de referencia para documentos nacionales"
*/
public class D_UsoNacional extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "UsoNacional"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "UsoNacional"
    */
    public Integer get() {
        return m_value;
    }

}
