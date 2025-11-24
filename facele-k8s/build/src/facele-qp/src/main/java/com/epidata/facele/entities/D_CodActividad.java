/**
ORM domain class for: CodActividad
Generated: 2025-10-21 15:27:38
Código de actividad del contribuyente. Se pueden consultar invocando el WS "FEParamGetActividades"
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de actividad del contribuyente. Se pueden consultar invocando el WS "FEParamGetActividades""
*/
public class D_CodActividad extends AbstractDomain {

    private Long m_value;

    /**
    Establece el valor de "CodActividad"
    */
    public void set(Long p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "CodActividad"
    */
    public Long get() {
        return m_value;
    }

}
