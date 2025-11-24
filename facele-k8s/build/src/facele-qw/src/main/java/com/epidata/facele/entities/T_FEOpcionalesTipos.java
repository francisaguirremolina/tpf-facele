/**
ORM table class for: FEOpcionalesTipos
Generated: 2025-10-21 15:27:38
CRDETR un tipo de atributo opcional de un documento.
La lista puede obtenerse invocando la operación "FEParamGetTiposOpcional" del web-service WSFE,
y la operación "FEXGetPARAM_Opcionales" del web-service WSFEX.
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

public class T_FEOpcionalesTipos extends AbstractTable<TR_FEOpcionalesTipos> implements SinglePkRelation<String> {

    public T_FEOpcionalesTipos() {
        super(TR_FEOpcionalesTipos.class);
    }

    public T_FEOpcionalesTipos(ResultSet p_rs) throws Exception {
        super(TR_FEOpcionalesTipos.class, p_rs);
    }

    public T_FEOpcionalesTipos(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(TR_FEOpcionalesTipos.class, p_conn, p_where, p_orderBy);
    }

    public Void executeSPI(java.sql.Connection p_conn,
        String p_CodOpcional,
        String p_Descripcion,
        Date p_FchDesde,
        Date p_FchHasta,
        Integer p_UsoNacional,
        Integer p_UsoExportac) throws Exception {
        String l_sql = "SELECT facele.spi_FEOpcionalesTipos(" 
        + sqlQuote( p_CodOpcional) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_FchDesde) + "," 
        + sqlQuote( p_FchHasta) + "," 
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
    public Void executeSPIR(java.sql.Connection p_conn, TR_FEOpcionalesTipos p_rec) throws Exception {
        return executeSPI(p_conn, p_rec.getCodOpcional(),
        p_rec.getDescripcion(),
        p_rec.getFchDesde(),
        p_rec.getFchHasta(),
        p_rec.getUsoNacional(),
        p_rec.getUsoExportac());
    }
    public int executeSPU(java.sql.Connection p_conn,
        String p_CodOpcional,
        String p_Descripcion,
        Date p_FchDesde,
        Date p_FchHasta,
        Integer p_UsoNacional,
        Integer p_UsoExportac,
        String p_pk_CodOpcional) throws Exception {
        String l_sql = "SELECT facele.spu_FEOpcionalesTipos(" 
        + sqlQuote( p_CodOpcional) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_FchDesde) + "," 
        + sqlQuote( p_FchHasta) + "," 
        + sqlQuote( p_UsoNacional) + "," 
        + sqlQuote( p_UsoExportac) + "," 
        + sqlQuote( p_pk_CodOpcional) + ")";
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
    public int executeSPUR(java.sql.Connection p_conn, TR_FEOpcionalesTipos p_rec) throws Exception {
        return executeSPU(p_conn, p_rec.getCodOpcional(),
        p_rec.getDescripcion(),
        p_rec.getFchDesde(),
        p_rec.getFchHasta(),
        p_rec.getUsoNacional(),
        p_rec.getUsoExportac(),
        p_rec.getCodOpcional());
    }
    @Override
    public void executeSPD(java.sql.Connection p_conn,
        Object p_CodOpcional) throws Exception {
        String l_sql = "SELECT facele.spd_FEOpcionalesTipos(" + sqlQuote( p_CodOpcional) + ")";
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
    public void executeSPDR(java.sql.Connection p_conn, TR_FEOpcionalesTipos p_rec) throws Exception {
        executeSPD(p_conn, p_rec.getCodOpcional());
    }

    public void executeSPDWhere(Connection p_conn, String p_where) throws Exception {
        String l_sql = "SELECT facele.spd_FEOpcionalesTipos(CodOpcional) FROM facele.t_FEOpcionalesTipos";
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
    public TR_FEOpcionalesTipos getById(String p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (TR_FEOpcionalesTipos l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.t_FEOpcionalesTipos";
    }

    @Override
    public TR_FEOpcionalesTipos getSelected() {
        return super.getSelected();
    }

}
