/**
ORM domain class for: EstadoPDF
Generated: 2025-10-21 15:27:38
Estado de la generación del PDF:
- "P": pendiente
- "G": generado
- "S": suspendido
- "E": error
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Estado de la generación del PDF:
- "P": pendiente
- "G": generado
- "S": suspendido
- "E": error"
*/
public class D_EstadoPDF extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "EstadoPDF"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "EstadoPDF"
    */
    public String get() {
        return m_value;
    }

}
