/**
ORM table class for: FEXIncoterms
Generated: 2025-10-21 15:27:38
CRDETR un "término de comercio internacional" o incoterm (véase: https://es.wikipedia.org/wiki/Incoterms)
La lista se obtiene desde el web-service WSFEX "FEXGetPARAM_Incoterms".
Ejemplos: "EXW", "FCA", "FAS", "FOB".
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

public class T_FEXIncoterms extends AbstractTable<TR_FEXIncoterms> implements SinglePkRelation<String> {

    public T_FEXIncoterms() {
        super(TR_FEXIncoterms.class);
    }

    public T_FEXIncoterms(ResultSet p_rs) throws Exception {
        super(TR_FEXIncoterms.class, p_rs);
    }

    public T_FEXIncoterms(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(TR_FEXIncoterms.class, p_conn, p_where, p_orderBy);
    }

    public Void executeSPI(java.sql.Connection p_conn,
        String p_IdFEXIncoterm,
        String p_Descripcion,
        Date p_FchDesde,
        Date p_FchHasta) throws Exception {
        String l_sql = "SELECT facele.spi_FEXIncoterms(" 
        + sqlQuote( p_IdFEXIncoterm) + "," 
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
    public Void executeSPIR(java.sql.Connection p_conn, TR_FEXIncoterms p_rec) throws Exception {
        return executeSPI(p_conn, p_rec.getIdFEXIncoterm(),
        p_rec.getDescripcion(),
        p_rec.getFchDesde(),
        p_rec.getFchHasta());
    }
    public int executeSPU(java.sql.Connection p_conn,
        String p_IdFEXIncoterm,
        String p_Descripcion,
        Date p_FchDesde,
        Date p_FchHasta,
        String p_pk_IdFEXIncoterm) throws Exception {
        String l_sql = "SELECT facele.spu_FEXIncoterms(" 
        + sqlQuote( p_IdFEXIncoterm) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_FchDesde) + "," 
        + sqlQuote( p_FchHasta) + "," 
        + sqlQuote( p_pk_IdFEXIncoterm) + ")";
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
    public int executeSPUR(java.sql.Connection p_conn, TR_FEXIncoterms p_rec) throws Exception {
        return executeSPU(p_conn, p_rec.getIdFEXIncoterm(),
        p_rec.getDescripcion(),
        p_rec.getFchDesde(),
        p_rec.getFchHasta(),
        p_rec.getIdFEXIncoterm());
    }
    @Override
    public void executeSPD(java.sql.Connection p_conn,
        Object p_IdFEXIncoterm) throws Exception {
        String l_sql = "SELECT facele.spd_FEXIncoterms(" + sqlQuote( p_IdFEXIncoterm) + ")";
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
    public void executeSPDR(java.sql.Connection p_conn, TR_FEXIncoterms p_rec) throws Exception {
        executeSPD(p_conn, p_rec.getIdFEXIncoterm());
    }

    public void executeSPDWhere(Connection p_conn, String p_where) throws Exception {
        String l_sql = "SELECT facele.spd_FEXIncoterms(IdFEXIncoterm) FROM facele.t_FEXIncoterms";
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
    public TR_FEXIncoterms getById(String p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (TR_FEXIncoterms l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.t_FEXIncoterms";
    }

    @Override
    public TR_FEXIncoterms getSelected() {
        return super.getSelected();
    }

}
