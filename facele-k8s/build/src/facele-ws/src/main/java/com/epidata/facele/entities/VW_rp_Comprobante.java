/**
ORM view class for: rp_Comprobante
Generated: 2025-10-21 15:27:38
Relación de base para la cabecera de los reportes de comprobantes
*/
package com.epidata.facele.entities;

import static com.epidata.facele.orm.OrmSupport.sqlQuote;
import com.epidata.facele.orm.ModelException;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import com.epidata.facele.orm.AbstractView;
import com.epidata.facele.orm.SinglePkRelation;

public class VW_rp_Comprobante extends AbstractView<VR_rp_Comprobante> implements SinglePkRelation<Integer> {

    public VW_rp_Comprobante() {
        super(VR_rp_Comprobante.class);
    }

    public VW_rp_Comprobante(ResultSet p_rs) throws Exception {
        super(VR_rp_Comprobante.class, p_rs);
    }

    public VW_rp_Comprobante(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(VR_rp_Comprobante.class, p_conn, p_where, p_orderBy);
    }

    @Override
    public VR_rp_Comprobante getById(Integer p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (VR_rp_Comprobante l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.vw_rp_Comprobante";
    }

    @Override
    public VR_rp_Comprobante getSelected() {
        return super.getSelected();
    }

}
