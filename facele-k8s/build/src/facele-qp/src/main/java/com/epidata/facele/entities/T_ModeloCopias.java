/**
ORM table class for: ModeloCopias
Generated: 2025-10-21 15:27:38
CRDETR una copia de un modelo de documento (ORIGINAL en el modelo ORIGINAL+DUPLICADO, DUPLICADO en el modelo ORIGINAL+DUPLICADO, etc.
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

public class T_ModeloCopias extends AbstractTable<TR_ModeloCopias> implements SinglePkRelation<Integer> {

    public T_ModeloCopias() {
        super(TR_ModeloCopias.class);
    }

    public T_ModeloCopias(ResultSet p_rs) throws Exception {
        super(TR_ModeloCopias.class, p_rs);
    }

    public T_ModeloCopias(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(TR_ModeloCopias.class, p_conn, p_where, p_orderBy);
    }

    public Integer executeSPI(java.sql.Connection p_conn,
        String p_Modelo,
        String p_Copia,
        String p_Observaciones,
        Integer p_Predeterminado) throws Exception {
        String l_sql = "SELECT facele.spi_ModeloCopias(" 
        + sqlQuote( p_Modelo) + "," 
        + sqlQuote( p_Copia) + "," 
        + sqlQuote( p_Observaciones) + "," 
        + sqlQuote( p_Predeterminado) + ")";
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
    public Integer executeSPIR(java.sql.Connection p_conn, TR_ModeloCopias p_rec) throws Exception {
        Integer l_toReturn =  executeSPI(p_conn, p_rec.getModelo(),
        p_rec.getCopia(),
        p_rec.getObservaciones(),
        p_rec.getPredeterminado());
        p_rec.setIdCopia(l_toReturn);
        return l_toReturn;
    }
    public int executeSPU(java.sql.Connection p_conn,
        String p_Modelo,
        String p_Copia,
        String p_Observaciones,
        Integer p_Predeterminado,
        Integer p_pk_IdCopia) throws Exception {
        String l_sql = "SELECT facele.spu_ModeloCopias(" 
        + sqlQuote( p_Modelo) + "," 
        + sqlQuote( p_Copia) + "," 
        + sqlQuote( p_Observaciones) + "," 
        + sqlQuote( p_Predeterminado) + "," 
        + sqlQuote( p_pk_IdCopia) + ")";
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
    public int executeSPUR(java.sql.Connection p_conn, TR_ModeloCopias p_rec) throws Exception {
        return executeSPU(p_conn, p_rec.getModelo(),
        p_rec.getCopia(),
        p_rec.getObservaciones(),
        p_rec.getPredeterminado(),
        p_rec.getIdCopia());
    }
    @Override
    public void executeSPD(java.sql.Connection p_conn,
        Object p_IdCopia) throws Exception {
        String l_sql = "SELECT facele.spd_ModeloCopias(" + sqlQuote( p_IdCopia) + ")";
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
    public void executeSPDR(java.sql.Connection p_conn, TR_ModeloCopias p_rec) throws Exception {
        executeSPD(p_conn, p_rec.getIdCopia());
    }

    public void executeSPDWhere(Connection p_conn, String p_where) throws Exception {
        String l_sql = "SELECT facele.spd_ModeloCopias(IdCopia) FROM facele.t_ModeloCopias";
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
    public TR_ModeloCopias getById(Integer p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (TR_ModeloCopias l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.t_ModeloCopias";
    }

    @Override
    public TR_ModeloCopias getSelected() {
        return super.getSelected();
    }

}
