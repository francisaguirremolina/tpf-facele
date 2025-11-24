/**
ORM table class for: FEXDstCuits
Generated: 2025-10-21 15:27:38
CRDETR el CUIT de un país, estado o región administrativa destinataria de una exportación.
La lista se obtiene desde el web-service WSFEX "FEXGetPARAM_DST_CUIT".
Ejemplos:
50000000016: "URUGUAY - Persona Física"
50000000024: "PARAGUAY - Persona Física"
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

public class T_FEXDstCuits extends AbstractTable<TR_FEXDstCuits> implements SinglePkRelation<Long> {

    public T_FEXDstCuits() {
        super(TR_FEXDstCuits.class);
    }

    public T_FEXDstCuits(ResultSet p_rs) throws Exception {
        super(TR_FEXDstCuits.class, p_rs);
    }

    public T_FEXDstCuits(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(TR_FEXDstCuits.class, p_conn, p_where, p_orderBy);
    }

    public Void executeSPI(java.sql.Connection p_conn,
        Long p_IdFEXDstCuit,
        String p_Descripcion) throws Exception {
        String l_sql = "SELECT facele.spi_FEXDstCuits(" 
        + sqlQuote( p_IdFEXDstCuit) + "," 
        + sqlQuote( p_Descripcion) + ")";
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
    public Void executeSPIR(java.sql.Connection p_conn, TR_FEXDstCuits p_rec) throws Exception {
        return executeSPI(p_conn, p_rec.getIdFEXDstCuit(),
        p_rec.getDescripcion());
    }
    public int executeSPU(java.sql.Connection p_conn,
        Long p_IdFEXDstCuit,
        String p_Descripcion,
        Long p_pk_IdFEXDstCuit) throws Exception {
        String l_sql = "SELECT facele.spu_FEXDstCuits(" 
        + sqlQuote( p_IdFEXDstCuit) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_pk_IdFEXDstCuit) + ")";
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
    public int executeSPUR(java.sql.Connection p_conn, TR_FEXDstCuits p_rec) throws Exception {
        return executeSPU(p_conn, p_rec.getIdFEXDstCuit(),
        p_rec.getDescripcion(),
        p_rec.getIdFEXDstCuit());
    }
    @Override
    public void executeSPD(java.sql.Connection p_conn,
        Object p_IdFEXDstCuit) throws Exception {
        String l_sql = "SELECT facele.spd_FEXDstCuits(" + sqlQuote( p_IdFEXDstCuit) + ")";
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
    public void executeSPDR(java.sql.Connection p_conn, TR_FEXDstCuits p_rec) throws Exception {
        executeSPD(p_conn, p_rec.getIdFEXDstCuit());
    }

    public void executeSPDWhere(Connection p_conn, String p_where) throws Exception {
        String l_sql = "SELECT facele.spd_FEXDstCuits(IdFEXDstCuit) FROM facele.t_FEXDstCuits";
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
    public TR_FEXDstCuits getById(Long p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (TR_FEXDstCuits l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.t_FEXDstCuits";
    }

    @Override
    public TR_FEXDstCuits getSelected() {
        return super.getSelected();
    }

}
