/**
ORM table class for: Monedas
Generated: 2025-10-21 15:27:38
CRDETR una moneda nacional o divisa extranjera (o ambas).
La enumeración se obtiene invocando el web-service WSFE "FEParamGetTiposMonedas"
o al web-service WSFEX "FEXGetPARAM_MON".
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

public class T_Monedas extends AbstractTable<TR_Monedas> implements SinglePkRelation<String> {

    public T_Monedas() {
        super(TR_Monedas.class);
    }

    public T_Monedas(ResultSet p_rs) throws Exception {
        super(TR_Monedas.class, p_rs);
    }

    public T_Monedas(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(TR_Monedas.class, p_conn, p_where, p_orderBy);
    }

    public Void executeSPI(java.sql.Connection p_conn,
        String p_MonId,
        String p_Descripcion,
        Date p_FchDesde,
        Date p_FchHasta,
        Integer p_UsoNacional,
        Integer p_UsoExportac,
        String p_SimboloMoneda) throws Exception {
        String l_sql = "SELECT facele.spi_Monedas(" 
        + sqlQuote( p_MonId) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_FchDesde) + "," 
        + sqlQuote( p_FchHasta) + "," 
        + sqlQuote( p_UsoNacional) + "," 
        + sqlQuote( p_UsoExportac) + "," 
        + sqlQuote( p_SimboloMoneda) + ")";
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
    public Void executeSPIR(java.sql.Connection p_conn, TR_Monedas p_rec) throws Exception {
        return executeSPI(p_conn, p_rec.getMonId(),
        p_rec.getDescripcion(),
        p_rec.getFchDesde(),
        p_rec.getFchHasta(),
        p_rec.getUsoNacional(),
        p_rec.getUsoExportac(),
        p_rec.getSimboloMoneda());
    }
    public int executeSPU(java.sql.Connection p_conn,
        String p_MonId,
        String p_Descripcion,
        Date p_FchDesde,
        Date p_FchHasta,
        Integer p_UsoNacional,
        Integer p_UsoExportac,
        String p_SimboloMoneda,
        String p_pk_MonId) throws Exception {
        String l_sql = "SELECT facele.spu_Monedas(" 
        + sqlQuote( p_MonId) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_FchDesde) + "," 
        + sqlQuote( p_FchHasta) + "," 
        + sqlQuote( p_UsoNacional) + "," 
        + sqlQuote( p_UsoExportac) + "," 
        + sqlQuote( p_SimboloMoneda) + "," 
        + sqlQuote( p_pk_MonId) + ")";
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
    public int executeSPUR(java.sql.Connection p_conn, TR_Monedas p_rec) throws Exception {
        return executeSPU(p_conn, p_rec.getMonId(),
        p_rec.getDescripcion(),
        p_rec.getFchDesde(),
        p_rec.getFchHasta(),
        p_rec.getUsoNacional(),
        p_rec.getUsoExportac(),
        p_rec.getSimboloMoneda(),
        p_rec.getMonId());
    }
    @Override
    public void executeSPD(java.sql.Connection p_conn,
        Object p_MonId) throws Exception {
        String l_sql = "SELECT facele.spd_Monedas(" + sqlQuote( p_MonId) + ")";
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
    public void executeSPDR(java.sql.Connection p_conn, TR_Monedas p_rec) throws Exception {
        executeSPD(p_conn, p_rec.getMonId());
    }

    public void executeSPDWhere(Connection p_conn, String p_where) throws Exception {
        String l_sql = "SELECT facele.spd_Monedas(MonId) FROM facele.t_Monedas";
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
    public TR_Monedas getById(String p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (TR_Monedas l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.t_Monedas";
    }

    @Override
    public TR_Monedas getSelected() {
        return super.getSelected();
    }

}
