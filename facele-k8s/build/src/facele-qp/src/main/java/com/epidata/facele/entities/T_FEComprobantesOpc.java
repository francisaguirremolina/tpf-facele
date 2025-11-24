/**
ORM table class for: FEComprobantesOpc
Generated: 2025-10-21 15:27:38
CRDETR un concepto opcional declarado en un comprobante electrónico. 
Los datos opcionales sólo deberán ser incluidos si el emisor pertenece al conjunto de emisores habilitados a informar opcionales. En ese caso podrá incluir el o los datos opcionales que correspondan, especificando el identificador de dato opcional de acuerdo a la situación del emisor.
Un registro de concepto opcional ES-PARTE-DE un comprobante electrónico.
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

public class T_FEComprobantesOpc extends AbstractTable<TR_FEComprobantesOpc> implements SinglePkRelation<Integer> {

    public T_FEComprobantesOpc() {
        super(TR_FEComprobantesOpc.class);
    }

    public T_FEComprobantesOpc(ResultSet p_rs) throws Exception {
        super(TR_FEComprobantesOpc.class, p_rs);
    }

    public T_FEComprobantesOpc(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(TR_FEComprobantesOpc.class, p_conn, p_where, p_orderBy);
    }

    public Integer executeSPI(java.sql.Connection p_conn,
        Integer p_IdDocumentoFE,
        String p_CodOpcional,
        String p_Valor) throws Exception {
        String l_sql = "SELECT facele.spi_FEComprobantesOpc(" 
        + sqlQuote( p_IdDocumentoFE) + "," 
        + sqlQuote( p_CodOpcional) + "," 
        + sqlQuote( p_Valor) + ")";
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
    public Integer executeSPIR(java.sql.Connection p_conn, TR_FEComprobantesOpc p_rec) throws Exception {
        Integer l_toReturn =  executeSPI(p_conn, p_rec.getIdDocumentoFE(),
        p_rec.getCodOpcional(),
        p_rec.getValor());
        p_rec.setIdComprobOpc(l_toReturn);
        return l_toReturn;
    }
    public int executeSPU(java.sql.Connection p_conn,
        Integer p_IdDocumentoFE,
        String p_CodOpcional,
        String p_Valor,
        Integer p_pk_IdComprobOpc) throws Exception {
        String l_sql = "SELECT facele.spu_FEComprobantesOpc(" 
        + sqlQuote( p_IdDocumentoFE) + "," 
        + sqlQuote( p_CodOpcional) + "," 
        + sqlQuote( p_Valor) + "," 
        + sqlQuote( p_pk_IdComprobOpc) + ")";
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
    public int executeSPUR(java.sql.Connection p_conn, TR_FEComprobantesOpc p_rec) throws Exception {
        return executeSPU(p_conn, p_rec.getIdDocumentoFE(),
        p_rec.getCodOpcional(),
        p_rec.getValor(),
        p_rec.getIdComprobOpc());
    }
    @Override
    public void executeSPD(java.sql.Connection p_conn,
        Object p_IdComprobOpc) throws Exception {
        String l_sql = "SELECT facele.spd_FEComprobantesOpc(" + sqlQuote( p_IdComprobOpc) + ")";
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
    public void executeSPDR(java.sql.Connection p_conn, TR_FEComprobantesOpc p_rec) throws Exception {
        executeSPD(p_conn, p_rec.getIdComprobOpc());
    }

    public void executeSPDWhere(Connection p_conn, String p_where) throws Exception {
        String l_sql = "SELECT facele.spd_FEComprobantesOpc(IdComprobOpc) FROM facele.t_FEComprobantesOpc";
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
    public TR_FEComprobantesOpc getById(Integer p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (TR_FEComprobantesOpc l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.t_FEComprobantesOpc";
    }

    @Override
    public TR_FEComprobantesOpc getSelected() {
        return super.getSelected();
    }

}
