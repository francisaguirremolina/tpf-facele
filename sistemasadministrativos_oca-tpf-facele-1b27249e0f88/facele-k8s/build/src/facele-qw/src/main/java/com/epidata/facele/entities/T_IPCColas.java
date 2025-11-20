/**
ORM table class for: IPCColas
Generated: 2025-10-21 15:27:38
CRDETR un registro para la comunicación inter procesos (IPC) entre el application server (WS) y las colas de generación de PDFs (QP) y autorizaciones en ARCA (QW).
Contiene un (y solo un) registro por cada cola; dos en total.
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

public class T_IPCColas extends AbstractTable<TR_IPCColas> implements SinglePkRelation<Integer> {

    public T_IPCColas() {
        super(TR_IPCColas.class);
    }

    public T_IPCColas(ResultSet p_rs) throws Exception {
        super(TR_IPCColas.class, p_rs);
    }

    public T_IPCColas(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(TR_IPCColas.class, p_conn, p_where, p_orderBy);
    }

    public Integer executeSPI(java.sql.Connection p_conn,
        String p_TipoCola,
        Integer p_ColaActiva,
        String p_MensajeACola,
        String p_RespuestaDeCola,
        String p_EstadoDeCola) throws Exception {
        String l_sql = "SELECT facele.spi_IPCColas(" 
        + sqlQuote( p_TipoCola) + "," 
        + sqlQuote( p_ColaActiva) + "," 
        + sqlQuote( p_MensajeACola) + "," 
        + sqlQuote( p_RespuestaDeCola) + "," 
        + sqlQuote( p_EstadoDeCola) + ")";
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
    public Integer executeSPIR(java.sql.Connection p_conn, TR_IPCColas p_rec) throws Exception {
        Integer l_toReturn =  executeSPI(p_conn, p_rec.getTipoCola(),
        p_rec.getColaActiva(),
        p_rec.getMensajeACola(),
        p_rec.getRespuestaDeCola(),
        p_rec.getEstadoDeCola());
        p_rec.setIdIPCCola(l_toReturn);
        return l_toReturn;
    }
    public int executeSPU(java.sql.Connection p_conn,
        String p_TipoCola,
        Integer p_ColaActiva,
        String p_MensajeACola,
        String p_RespuestaDeCola,
        String p_EstadoDeCola,
        Integer p_pk_IdIPCCola) throws Exception {
        String l_sql = "SELECT facele.spu_IPCColas(" 
        + sqlQuote( p_TipoCola) + "," 
        + sqlQuote( p_ColaActiva) + "," 
        + sqlQuote( p_MensajeACola) + "," 
        + sqlQuote( p_RespuestaDeCola) + "," 
        + sqlQuote( p_EstadoDeCola) + "," 
        + sqlQuote( p_pk_IdIPCCola) + ")";
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
    public int executeSPUR(java.sql.Connection p_conn, TR_IPCColas p_rec) throws Exception {
        return executeSPU(p_conn, p_rec.getTipoCola(),
        p_rec.getColaActiva(),
        p_rec.getMensajeACola(),
        p_rec.getRespuestaDeCola(),
        p_rec.getEstadoDeCola(),
        p_rec.getIdIPCCola());
    }
    @Override
    public void executeSPD(java.sql.Connection p_conn,
        Object p_IdIPCCola) throws Exception {
        String l_sql = "SELECT facele.spd_IPCColas(" + sqlQuote( p_IdIPCCola) + ")";
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
    public void executeSPDR(java.sql.Connection p_conn, TR_IPCColas p_rec) throws Exception {
        executeSPD(p_conn, p_rec.getIdIPCCola());
    }

    public void executeSPDWhere(Connection p_conn, String p_where) throws Exception {
        String l_sql = "SELECT facele.spd_IPCColas(IdIPCCola) FROM facele.t_IPCColas";
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
    public TR_IPCColas getById(Integer p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (TR_IPCColas l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.t_IPCColas";
    }

    @Override
    public TR_IPCColas getSelected() {
        return super.getSelected();
    }

}
