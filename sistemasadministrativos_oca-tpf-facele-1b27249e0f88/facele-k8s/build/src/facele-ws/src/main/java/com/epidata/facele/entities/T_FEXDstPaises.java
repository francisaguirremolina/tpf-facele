/**
ORM table class for: FEXDstPaises
Generated: 2025-10-21 15:27:38
CRDETR un país, zona o región destino de exportación. 
La lista se obtiene desde el web-service WSFEX "FEXGetPARAM_DST_Pais".
Por ejemplo:
101: BURKINA FASO
108: CONGO
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

public class T_FEXDstPaises extends AbstractTable<TR_FEXDstPaises> implements SinglePkRelation<String> {

    public T_FEXDstPaises() {
        super(TR_FEXDstPaises.class);
    }

    public T_FEXDstPaises(ResultSet p_rs) throws Exception {
        super(TR_FEXDstPaises.class, p_rs);
    }

    public T_FEXDstPaises(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(TR_FEXDstPaises.class, p_conn, p_where, p_orderBy);
    }

    public Void executeSPI(java.sql.Connection p_conn,
        String p_IdFEXDstPais,
        String p_Descripcion) throws Exception {
        String l_sql = "SELECT facele.spi_FEXDstPaises(" 
        + sqlQuote( p_IdFEXDstPais) + "," 
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
    public Void executeSPIR(java.sql.Connection p_conn, TR_FEXDstPaises p_rec) throws Exception {
        return executeSPI(p_conn, p_rec.getIdFEXDstPais(),
        p_rec.getDescripcion());
    }
    public int executeSPU(java.sql.Connection p_conn,
        String p_IdFEXDstPais,
        String p_Descripcion,
        String p_pk_IdFEXDstPais) throws Exception {
        String l_sql = "SELECT facele.spu_FEXDstPaises(" 
        + sqlQuote( p_IdFEXDstPais) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_pk_IdFEXDstPais) + ")";
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
    public int executeSPUR(java.sql.Connection p_conn, TR_FEXDstPaises p_rec) throws Exception {
        return executeSPU(p_conn, p_rec.getIdFEXDstPais(),
        p_rec.getDescripcion(),
        p_rec.getIdFEXDstPais());
    }
    @Override
    public void executeSPD(java.sql.Connection p_conn,
        Object p_IdFEXDstPais) throws Exception {
        String l_sql = "SELECT facele.spd_FEXDstPaises(" + sqlQuote( p_IdFEXDstPais) + ")";
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
    public void executeSPDR(java.sql.Connection p_conn, TR_FEXDstPaises p_rec) throws Exception {
        executeSPD(p_conn, p_rec.getIdFEXDstPais());
    }

    public void executeSPDWhere(Connection p_conn, String p_where) throws Exception {
        String l_sql = "SELECT facele.spd_FEXDstPaises(IdFEXDstPais) FROM facele.t_FEXDstPaises";
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
    public TR_FEXDstPaises getById(String p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (TR_FEXDstPaises l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.t_FEXDstPaises";
    }

    @Override
    public TR_FEXDstPaises getSelected() {
        return super.getSelected();
    }

}
