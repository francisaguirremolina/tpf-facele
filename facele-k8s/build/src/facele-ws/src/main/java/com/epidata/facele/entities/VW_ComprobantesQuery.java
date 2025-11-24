/**
ORM view class for: ComprobantesQuery
Generated: 2025-10-21 15:27:38
null
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

public class VW_ComprobantesQuery extends AbstractView<VR_ComprobantesQuery> implements SinglePkRelation<Integer> {

    public VW_ComprobantesQuery() {
        super(VR_ComprobantesQuery.class);
    }

    public VW_ComprobantesQuery(ResultSet p_rs) throws Exception {
        super(VR_ComprobantesQuery.class, p_rs);
    }

    public VW_ComprobantesQuery(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(VR_ComprobantesQuery.class, p_conn, p_where, p_orderBy);
    }

    @Override
    public VR_ComprobantesQuery getById(Integer p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (VR_ComprobantesQuery l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.vw_ComprobantesQuery";
    }

    @Override
    public VR_ComprobantesQuery getSelected() {
        return super.getSelected();
    }

}
