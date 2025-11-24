/**
ORM domain class for: ReportTemplate
Generated: 2025-10-21 15:27:38
Nombre del archivo (relativo o absoluto) .JASPER correspondiente al reporte.
Acepta variables de sistema (@FRAMEWORKDIR, @YEAR, etc.)
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Nombre del archivo (relativo o absoluto) .JASPER correspondiente al reporte.
Acepta variables de sistema (@FRAMEWORKDIR, @YEAR, etc.)"
*/
public class D_ReportTemplate extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "ReportTemplate"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "ReportTemplate"
    */
    public String get() {
        return m_value;
    }

}
