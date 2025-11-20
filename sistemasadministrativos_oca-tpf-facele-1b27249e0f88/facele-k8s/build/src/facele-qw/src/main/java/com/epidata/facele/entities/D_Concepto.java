/**
ORM domain class for: Concepto
Generated: 2025-10-21 15:27:38
Concepto del Comprobante. 
Valores permitidos: 
1=Productos 
2=Servicios 
3=Productos y Servicios
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Concepto del Comprobante. 
Valores permitidos: 
1=Productos 
2=Servicios 
3=Productos y Servicios"
*/
public class D_Concepto extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "Concepto"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "Concepto"
    */
    public Integer get() {
        return m_value;
    }

}
