/**
ORM domain class for: IdFEXUnidadMedida
Generated: 2025-10-21 15:27:38
Código de unidad de medida
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de unidad de medida"
*/
public class D_IdFEXUnidadMedida extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "IdFEXUnidadMedida"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "IdFEXUnidadMedida"
    */
    public Integer get() {
        return m_value;
    }

}
