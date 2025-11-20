/**
ORM table class for: FECbteTipos
Generated: 2025-10-21 15:27:38
CRDETR un tipo de comprobante, según la tipificación establecida por ARCA.
La lista puede obtenerse invocando la operación "FEParamGetTiposCbte" del web-service WSFE,
y la operación "FEXGetPARAM_Cbte_Tipo" del web-service WSFEX.
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

public class T_FECbteTipos extends AbstractTable<TR_FECbteTipos> implements SinglePkRelation<Integer> {

    public T_FECbteTipos() {
        super(TR_FECbteTipos.class);
    }

    public T_FECbteTipos(ResultSet p_rs) throws Exception {
        super(TR_FECbteTipos.class, p_rs);
    }

    public T_FECbteTipos(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(TR_FECbteTipos.class, p_conn, p_where, p_orderBy);
    }

    public Void executeSPI(java.sql.Connection p_conn,
        Integer p_CbteTipo,
        String p_Descripcion,
        Date p_FchDesde,
        Date p_FchHasta,
        String p_LetraFiscal,
        String p_Sintetico,
        String p_ReportTemplate,
        String p_CbteFam,
        Integer p_UsoNacional,
        Integer p_UsoExportac) throws Exception {
        String l_sql = "SELECT facele.spi_FECbteTipos(" 
        + sqlQuote( p_CbteTipo) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_FchDesde) + "," 
        + sqlQuote( p_FchHasta) + "," 
        + sqlQuote( p_LetraFiscal) + "," 
        + sqlQuote( p_Sintetico) + "," 
        + sqlQuote( p_ReportTemplate) + "," 
        + sqlQuote( p_CbteFam) + "," 
        + sqlQuote( p_UsoNacional) + "," 
        + sqlQuote( p_UsoExportac) + ")";
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
    public Void executeSPIR(java.sql.Connection p_conn, TR_FECbteTipos p_rec) throws Exception {
        return executeSPI(p_conn, p_rec.getCbteTipo(),
        p_rec.getDescripcion(),
        p_rec.getFchDesde(),
        p_rec.getFchHasta(),
        p_rec.getLetraFiscal(),
        p_rec.getSintetico(),
        p_rec.getReportTemplate(),
        p_rec.getCbteFam(),
        p_rec.getUsoNacional(),
        p_rec.getUsoExportac());
    }
    public int executeSPU(java.sql.Connection p_conn,
        Integer p_CbteTipo,
        String p_Descripcion,
        Date p_FchDesde,
        Date p_FchHasta,
        String p_LetraFiscal,
        String p_Sintetico,
        String p_ReportTemplate,
        String p_CbteFam,
        Integer p_UsoNacional,
        Integer p_UsoExportac,
        Integer p_pk_CbteTipo) throws Exception {
        String l_sql = "SELECT facele.spu_FECbteTipos(" 
        + sqlQuote( p_CbteTipo) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_FchDesde) + "," 
        + sqlQuote( p_FchHasta) + "," 
        + sqlQuote( p_LetraFiscal) + "," 
        + sqlQuote( p_Sintetico) + "," 
        + sqlQuote( p_ReportTemplate) + "," 
        + sqlQuote( p_CbteFam) + "," 
        + sqlQuote( p_UsoNacional) + "," 
        + sqlQuote( p_UsoExportac) + "," 
        + sqlQuote( p_pk_CbteTipo) + ")";
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
    public int executeSPUR(java.sql.Connection p_conn, TR_FECbteTipos p_rec) throws Exception {
        return executeSPU(p_conn, p_rec.getCbteTipo(),
        p_rec.getDescripcion(),
        p_rec.getFchDesde(),
        p_rec.getFchHasta(),
        p_rec.getLetraFiscal(),
        p_rec.getSintetico(),
        p_rec.getReportTemplate(),
        p_rec.getCbteFam(),
        p_rec.getUsoNacional(),
        p_rec.getUsoExportac(),
        p_rec.getCbteTipo());
    }
    @Override
    public void executeSPD(java.sql.Connection p_conn,
        Object p_CbteTipo) throws Exception {
        String l_sql = "SELECT facele.spd_FECbteTipos(" + sqlQuote( p_CbteTipo) + ")";
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
    public void executeSPDR(java.sql.Connection p_conn, TR_FECbteTipos p_rec) throws Exception {
        executeSPD(p_conn, p_rec.getCbteTipo());
    }

    public void executeSPDWhere(Connection p_conn, String p_where) throws Exception {
        String l_sql = "SELECT facele.spd_FECbteTipos(CbteTipo) FROM facele.t_FECbteTipos";
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
    public TR_FECbteTipos getById(Integer p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (TR_FECbteTipos l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.t_FECbteTipos";
    }

    @Override
    public TR_FECbteTipos getSelected() {
        return super.getSelected();
    }

}
