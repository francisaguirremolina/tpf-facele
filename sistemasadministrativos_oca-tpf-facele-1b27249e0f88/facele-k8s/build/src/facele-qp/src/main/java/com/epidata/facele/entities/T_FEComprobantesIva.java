/**
ORM table class for: FEComprobantesIva
Generated: 2025-10-21 15:27:38
CRDETR una alícuota de IVA declarada en un comprobante electrónico.
Un registro de IVA ES-PARTE-DE un comprobante electrónico.
Se utiliza en comprobantes "A", "B", o "M".
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

public class T_FEComprobantesIva extends AbstractTable<TR_FEComprobantesIva> implements SinglePkRelation<Integer> {

    public T_FEComprobantesIva() {
        super(TR_FEComprobantesIva.class);
    }

    public T_FEComprobantesIva(ResultSet p_rs) throws Exception {
        super(TR_FEComprobantesIva.class, p_rs);
    }

    public T_FEComprobantesIva(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(TR_FEComprobantesIva.class, p_conn, p_where, p_orderBy);
    }

    public Integer executeSPI(java.sql.Connection p_conn,
        Integer p_IdDocumentoFE,
        Integer p_CodAlicIVA,
        Double p_BaseImp,
        Double p_Importe) throws Exception {
        String l_sql = "SELECT facele.spi_FEComprobantesIva(" 
        + sqlQuote( p_IdDocumentoFE) + "," 
        + sqlQuote( p_CodAlicIVA) + "," 
        + sqlQuote( p_BaseImp) + "," 
        + sqlQuote( p_Importe) + ")";
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
    public Integer executeSPIR(java.sql.Connection p_conn, TR_FEComprobantesIva p_rec) throws Exception {
        Integer l_toReturn =  executeSPI(p_conn, p_rec.getIdDocumentoFE(),
        p_rec.getCodAlicIVA(),
        p_rec.getBaseImp(),
        p_rec.getImporte());
        p_rec.setIdComprobIVA(l_toReturn);
        return l_toReturn;
    }
    public int executeSPU(java.sql.Connection p_conn,
        Integer p_IdDocumentoFE,
        Integer p_CodAlicIVA,
        Double p_BaseImp,
        Double p_Importe,
        Integer p_pk_IdComprobIVA) throws Exception {
        String l_sql = "SELECT facele.spu_FEComprobantesIva(" 
        + sqlQuote( p_IdDocumentoFE) + "," 
        + sqlQuote( p_CodAlicIVA) + "," 
        + sqlQuote( p_BaseImp) + "," 
        + sqlQuote( p_Importe) + "," 
        + sqlQuote( p_pk_IdComprobIVA) + ")";
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
    public int executeSPUR(java.sql.Connection p_conn, TR_FEComprobantesIva p_rec) throws Exception {
        return executeSPU(p_conn, p_rec.getIdDocumentoFE(),
        p_rec.getCodAlicIVA(),
        p_rec.getBaseImp(),
        p_rec.getImporte(),
        p_rec.getIdComprobIVA());
    }
    @Override
    public void executeSPD(java.sql.Connection p_conn,
        Object p_IdComprobIVA) throws Exception {
        String l_sql = "SELECT facele.spd_FEComprobantesIva(" + sqlQuote( p_IdComprobIVA) + ")";
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
    public void executeSPDR(java.sql.Connection p_conn, TR_FEComprobantesIva p_rec) throws Exception {
        executeSPD(p_conn, p_rec.getIdComprobIVA());
    }

    public void executeSPDWhere(Connection p_conn, String p_where) throws Exception {
        String l_sql = "SELECT facele.spd_FEComprobantesIva(IdComprobIVA) FROM facele.t_FEComprobantesIva";
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
    public TR_FEComprobantesIva getById(Integer p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (TR_FEComprobantesIva l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.t_FEComprobantesIva";
    }

    @Override
    public TR_FEComprobantesIva getSelected() {
        return super.getSelected();
    }

}
