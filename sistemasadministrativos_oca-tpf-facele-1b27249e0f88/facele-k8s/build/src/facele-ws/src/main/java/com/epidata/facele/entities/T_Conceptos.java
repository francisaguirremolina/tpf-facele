/**
ORM table class for: Conceptos
Generated: 2025-10-21 15:27:38
CRDETR un concepto: productos, servicios, etc.
La enumeración se obtiene invocando el WS "FEParamGetTiposConcepto"
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

public class T_Conceptos extends AbstractTable<TR_Conceptos> implements SinglePkRelation<Integer> {

    public T_Conceptos() {
        super(TR_Conceptos.class);
    }

    public T_Conceptos(ResultSet p_rs) throws Exception {
        super(TR_Conceptos.class, p_rs);
    }

    public T_Conceptos(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(TR_Conceptos.class, p_conn, p_where, p_orderBy);
    }

    public Void executeSPI(java.sql.Connection p_conn,
        Integer p_Concepto,
        String p_Descripcion,
        Date p_FchDesde,
        Date p_FchHasta) throws Exception {
        String l_sql = "SELECT facele.spi_Conceptos(" 
        + sqlQuote( p_Concepto) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_FchDesde) + "," 
        + sqlQuote( p_FchHasta) + ")";
        if (isDebug()) {
            System.out.println("ORM-DEBUG: " + l_sql);
        } // end if
        try (Statement l_stmt = p_conn.createStatement()) {
        l_stmt.executeQuery(l_sql);
        l_stmt.close();
        return null;
    } catch(Exception l_ex) {
         String l_msg = ModelException.extractUserMsg(l_ex);
         if (l_msg != null) {
             throw new ModelException(l_ex);
         } // end if
         throw l_ex;
    } // end try-catch
    }
    @Override
    public Void executeSPIR(java.sql.Connection p_conn, TR_Conceptos p_rec) throws Exception {
        return executeSPI(p_conn, p_rec.getConcepto(),
        p_rec.getDescripcion(),
        p_rec.getFchDesde(),
        p_rec.getFchHasta());
    }
    public int executeSPU(java.sql.Connection p_conn,
        Integer p_Concepto,
        String p_Descripcion,
        Date p_FchDesde,
        Date p_FchHasta,
        Integer p_pk_Concepto) throws Exception {
        String l_sql = "SELECT facele.spu_Conceptos(" 
        + sqlQuote( p_Concepto) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_FchDesde) + "," 
        + sqlQuote( p_FchHasta) + "," 
        + sqlQuote( p_pk_Concepto) + ")";
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
    public int executeSPUR(java.sql.Connection p_conn, TR_Conceptos p_rec) throws Exception {
        return executeSPU(p_conn, p_rec.getConcepto(),
        p_rec.getDescripcion(),
        p_rec.getFchDesde(),
        p_rec.getFchHasta(),
        p_rec.getConcepto());
    }
    @Override
    public void executeSPD(java.sql.Connection p_conn,
        Object p_Concepto) throws Exception {
        String l_sql = "SELECT facele.spd_Conceptos(" + sqlQuote( p_Concepto) + ")";
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
    public void executeSPDR(java.sql.Connection p_conn, TR_Conceptos p_rec) throws Exception {
        executeSPD(p_conn, p_rec.getConcepto());
    }

    public void executeSPDWhere(Connection p_conn, String p_where) throws Exception {
        String l_sql = "SELECT facele.spd_Conceptos(Concepto) FROM facele.t_Conceptos";
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
    public TR_Conceptos getById(Integer p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (TR_Conceptos l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.t_Conceptos";
    }

    @Override
    public TR_Conceptos getSelected() {
        return super.getSelected();
    }

}
