/**
ORM domain class for: IdFEXIdioma
Generated: 2025-10-21 15:27:38
Código de idioma
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de idioma"
*/
public class D_IdFEXIdioma extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "IdFEXIdioma"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "IdFEXIdioma"
    */
    public Integer get() {
        return m_value;
    }

}
