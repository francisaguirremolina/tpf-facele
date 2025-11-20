/**
ORM domain class for: CodigoProducto
Generated: 2025-10-21 15:27:38
Código del producto, según el fabricante, el proveedor o la empresa.
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código del producto, según el fabricante, el proveedor o la empresa."
*/
public class D_CodigoProducto extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "CodigoProducto"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "CodigoProducto"
    */
    public String get() {
        return m_value;
    }

}
