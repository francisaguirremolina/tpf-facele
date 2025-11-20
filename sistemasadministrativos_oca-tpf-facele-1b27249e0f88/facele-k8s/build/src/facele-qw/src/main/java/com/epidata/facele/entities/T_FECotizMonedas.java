/**
ORM table class for: FECotizMonedas
Generated: 2025-10-21 15:27:38
CRDETR una moneda y su cotización vigente.
La lista puede obtenerse invocando la operación "FEParamGetTiposMonedas" del web-service WSFE,
y de la operación execFEXGetParamMon del web-service WSFEX.
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

public class T_FECotizMonedas extends AbstractTable<TR_FECotizMonedas> implements SinglePkRelation<Integer> {

    public T_FECotizMonedas() {
        super(TR_FECotizMonedas.class);
    }

    public T_FECotizMonedas(ResultSet p_rs) throws Exception {
        super(TR_FECotizMonedas.class, p_rs);
    }

    public T_FECotizMonedas(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(TR_FECotizMonedas.class, p_conn, p_where, p_orderBy);
    }

    public Integer executeSPI(java.sql.Connection p_conn,
        String p_MonId,
        Date p_FechaCotiz,
        Double p_MonCotiz) throws Exception {
        String l_sql = "SELECT facele.spi_FECotizMonedas(" 
        + sqlQuote( p_MonId) + "," 
        + sqlQuote( p_FechaCotiz) + "," 
        + sqlQuote( p_MonCotiz) + ")";
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
    public Integer executeSPIR(java.sql.Connection p_conn, TR_FECotizMonedas p_rec) throws Exception {
        Integer l_toReturn =  executeSPI(p_conn, p_rec.getMonId(),
        p_rec.getFechaCotiz(),
        p_rec.getMonCotiz());
        p_rec.setIdCotizMoneda(l_toReturn);
        return l_toReturn;
    }
    public int executeSPU(java.sql.Connection p_conn,
        String p_MonId,
        Date p_FechaCotiz,
        Double p_MonCotiz,
        Integer p_pk_IdCotizMoneda) throws Exception {
        String l_sql = "SELECT facele.spu_FECotizMonedas(" 
        + sqlQuote( p_MonId) + "," 
        + sqlQuote( p_FechaCotiz) + "," 
        + sqlQuote( p_MonCotiz) + "," 
        + sqlQuote( p_pk_IdCotizMoneda) + ")";
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
    public int executeSPUR(java.sql.Connection p_conn, TR_FECotizMonedas p_rec) throws Exception {
        return executeSPU(p_conn, p_rec.getMonId(),
        p_rec.getFechaCotiz(),
        p_rec.getMonCotiz(),
        p_rec.getIdCotizMoneda());
    }
    @Override
    public void executeSPD(java.sql.Connection p_conn,
        Object p_IdCotizMoneda) throws Exception {
        String l_sql = "SELECT facele.spd_FECotizMonedas(" + sqlQuote( p_IdCotizMoneda) + ")";
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
    public void executeSPDR(java.sql.Connection p_conn, TR_FECotizMonedas p_rec) throws Exception {
        executeSPD(p_conn, p_rec.getIdCotizMoneda());
    }

    public void executeSPDWhere(Connection p_conn, String p_where) throws Exception {
        String l_sql = "SELECT facele.spd_FECotizMonedas(IdCotizMoneda) FROM facele.t_FECotizMonedas";
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
    public TR_FECotizMonedas getById(Integer p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (TR_FECotizMonedas l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.t_FECotizMonedas";
    }

    @Override
    public TR_FECotizMonedas getSelected() {
        return super.getSelected();
    }

}
