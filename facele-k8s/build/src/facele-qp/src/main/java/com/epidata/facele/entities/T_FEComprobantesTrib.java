/**
ORM table class for: FEComprobantesTrib
Generated: 2025-10-21 15:27:38
CRDETR un tributo declarado en un comprobante electrónico.
Un registro de tributo ES-PARTE-DE un comprobante electrónico.
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
import com.epidata.facele.orm.AbstractTable;
import com.epidata.facele.orm.SinglePkRelation;

public class T_FEComprobantesTrib extends AbstractTable<TR_FEComprobantesTrib> implements SinglePkRelation<Integer> {

    public T_FEComprobantesTrib() {
        super(TR_FEComprobantesTrib.class);
    }

    public T_FEComprobantesTrib(ResultSet p_rs) throws Exception {
        super(TR_FEComprobantesTrib.class, p_rs);
    }

    public T_FEComprobantesTrib(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(TR_FEComprobantesTrib.class, p_conn, p_where, p_orderBy);
    }

    public Integer executeSPI(java.sql.Connection p_conn,
        Integer p_IdDocumentoFE,
        Integer p_CodTributo,
        String p_Descripcion,
        Double p_BaseImp,
        Double p_Alic,
        Double p_Importe) throws Exception {
        String l_sql = "SELECT facele.spi_FEComprobantesTrib(" 
        + sqlQuote( p_IdDocumentoFE) + "," 
        + sqlQuote( p_CodTributo) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_BaseImp) + "," 
        + sqlQuote( p_Alic) + "," 
        + sqlQuote( p_Importe) + ")";
        if (isDebug()) {
            System.out.println("ORM-DEBUG: " + l_sql);
        } // end if
        try (Statement l_stmt = p_conn.createStatement()) {
        ResultSet l_rs = l_stmt.executeQuery(l_sql);
        l_rs.next();
        String l_identity = l_rs.getString(1);
        l_rs.close();
        l_stmt.close();
        return Integer.parseInt(l_identity);
    } catch(Exception l_ex) {
         String l_msg = ModelException.extractUserMsg(l_ex);
         if (l_msg != null) {
             throw new ModelException(l_ex);
         } // end if
         throw l_ex;
    } // end try-catch
    }
    @Override
    public Integer executeSPIR(java.sql.Connection p_conn, TR_FEComprobantesTrib p_rec) throws Exception {
        Integer l_toReturn =  executeSPI(p_conn, p_rec.getIdDocumentoFE(),
        p_rec.getCodTributo(),
        p_rec.getDescripcion(),
        p_rec.getBaseImp(),
        p_rec.getAlic(),
        p_rec.getImporte());
        p_rec.setIdComprobTrib(l_toReturn);
        return l_toReturn;
    }
    public int executeSPU(java.sql.Connection p_conn,
        Integer p_IdDocumentoFE,
        Integer p_CodTributo,
        String p_Descripcion,
        Double p_BaseImp,
        Double p_Alic,
        Double p_Importe,
        Integer p_pk_IdComprobTrib) throws Exception {
        String l_sql = "SELECT facele.spu_FEComprobantesTrib(" 
        + sqlQuote( p_IdDocumentoFE) + "," 
        + sqlQuote( p_CodTributo) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_BaseImp) + "," 
        + sqlQuote( p_Alic) + "," 
        + sqlQuote( p_Importe) + "," 
        + sqlQuote( p_pk_IdComprobTrib) + ")";
        if (isDebug()) {
            System.out.println("ORM-DEBUG: " + l_sql);
        } // end if
        try (Statement l_stmt = p_conn.createStatement()) {
        ResultSet l_rs = l_stmt.executeQuery(l_sql);
        l_rs.next();
        int l_changeCount = l_rs.getInt(1);
        l_rs.close();
        l_stmt.close();
        return l_changeCount;
    } catch(Exception l_ex) {
         String l_msg = ModelException.extractUserMsg(l_ex);
         if (l_msg != null) {
             throw new ModelException(l_ex);
         } // end if
         throw l_ex;
    } // end try-catch
    }
    @Override
    public int executeSPUR(java.sql.Connection p_conn, TR_FEComprobantesTrib p_rec) throws Exception {
        return executeSPU(p_conn, p_rec.getIdDocumentoFE(),
        p_rec.getCodTributo(),
        p_rec.getDescripcion(),
        p_rec.getBaseImp(),
        p_rec.getAlic(),
        p_rec.getImporte(),
        p_rec.getIdComprobTrib());
    }
    @Override
    public void executeSPD(java.sql.Connection p_conn,
        Object p_IdComprobTrib) throws Exception {
        String l_sql = "SELECT facele.spd_FEComprobantesTrib(" + sqlQuote( p_IdComprobTrib) + ")";
        if (isDebug()) {
            System.out.println("ORM-DEBUG: " + l_sql);
        } // end if
        try (Statement l_stmt = p_conn.createStatement()) {
        l_stmt.executeQuery(l_sql);
        l_stmt.close();
    } catch(Exception l_ex) {
         String l_msg = ModelException.extractUserMsg(l_ex);
         if (l_msg != null) {
             throw new ModelException(l_ex);
         } // end if
         throw l_ex;
    } // end try-catch
    }
    public void executeSPDR(java.sql.Connection p_conn, TR_FEComprobantesTrib p_rec) throws Exception {
        executeSPD(p_conn, p_rec.getIdComprobTrib());
    }

    public void executeSPDWhere(Connection p_conn, String p_where) throws Exception {
        String l_sql = "SELECT facele.spd_FEComprobantesTrib(IdComprobTrib) FROM facele.t_FEComprobantesTrib";
    if (p_where != null) {
            l_sql += " WHERE " + p_where;
        } // end if
        if (isDebug()) {
            System.out.println("ORM-DEBUG: " + l_sql);
        } // end if
        try (Statement l_stmt = p_conn.createStatement()) {
        l_stmt.executeQuery(l_sql);
        l_stmt.close();
    } catch(Exception l_ex) {
         String l_msg = ModelException.extractUserMsg(l_ex);
         if (l_msg != null) {
             throw new ModelException(l_ex);
         } // end if
         throw l_ex;
    } // end try-catch
    }

    @Override
    public TR_FEComprobantesTrib getById(Integer p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (TR_FEComprobantesTrib l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.t_FEComprobantesTrib";
    }

    @Override
    public TR_FEComprobantesTrib getSelected() {
        return super.getSelected();
    }

}
