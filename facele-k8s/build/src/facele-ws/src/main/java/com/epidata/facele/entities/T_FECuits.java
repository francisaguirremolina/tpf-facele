/**
ORM table class for: FECuits
Generated: 2025-10-21 15:27:38
CRDETR un contribuyente que emite comprobantes electrónicos. 
También almacena sus claves, certificados y el último ticket obtenido.
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

public class T_FECuits extends AbstractTable<TR_FECuits> implements SinglePkRelation<Long> {

    public T_FECuits() {
        super(TR_FECuits.class);
    }

    public T_FECuits(ResultSet p_rs) throws Exception {
        super(TR_FECuits.class, p_rs);
    }

    public T_FECuits(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(TR_FECuits.class, p_conn, p_where, p_orderBy);
    }

    public Void executeSPI(java.sql.Connection p_conn,
        Long p_Cuit,
        String p_Descripcion,
        String p_Certificado,
        String p_ClavePrivada,
        Integer p_TicketLive,
        java.sql.Timestamp p_Vencimiento,
        String p_Token,
        String p_Sign,
        Date p_VencCert,
        String p_CBU,
        java.sql.Timestamp p_VencimientoCDC,
        String p_TokenCDC,
        String p_SignCDC,
        java.sql.Timestamp p_VencimientoFEX,
        String p_TokenFEX,
        String p_SignFEX) throws Exception {
        String l_sql = "SELECT facele.spi_FECuits(" 
        + sqlQuote( p_Cuit) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_Certificado) + "," 
        + sqlQuote( p_ClavePrivada) + "," 
        + sqlQuote( p_TicketLive) + "," 
        + sqlQuote( p_Vencimiento) + "," 
        + sqlQuote( p_Token) + "," 
        + sqlQuote( p_Sign) + "," 
        + sqlQuote( p_VencCert) + "," 
        + sqlQuote( p_CBU) + "," 
        + sqlQuote( p_VencimientoCDC) + "," 
        + sqlQuote( p_TokenCDC) + "," 
        + sqlQuote( p_SignCDC) + "," 
        + sqlQuote( p_VencimientoFEX) + "," 
        + sqlQuote( p_TokenFEX) + "," 
        + sqlQuote( p_SignFEX) + ")";
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
    public Void executeSPIR(java.sql.Connection p_conn, TR_FECuits p_rec) throws Exception {
        return executeSPI(p_conn, p_rec.getCuit(),
        p_rec.getDescripcion(),
        p_rec.getCertificado(),
        p_rec.getClavePrivada(),
        p_rec.getTicketLive(),
        p_rec.getVencimiento(),
        p_rec.getToken(),
        p_rec.getSign(),
        p_rec.getVencCert(),
        p_rec.getCBU(),
        p_rec.getVencimientoCDC(),
        p_rec.getTokenCDC(),
        p_rec.getSignCDC(),
        p_rec.getVencimientoFEX(),
        p_rec.getTokenFEX(),
        p_rec.getSignFEX());
    }
    public int executeSPU(java.sql.Connection p_conn,
        Long p_Cuit,
        String p_Descripcion,
        String p_Certificado,
        String p_ClavePrivada,
        Integer p_TicketLive,
        java.sql.Timestamp p_Vencimiento,
        String p_Token,
        String p_Sign,
        Date p_VencCert,
        String p_CBU,
        java.sql.Timestamp p_VencimientoCDC,
        String p_TokenCDC,
        String p_SignCDC,
        java.sql.Timestamp p_VencimientoFEX,
        String p_TokenFEX,
        String p_SignFEX,
        Long p_pk_Cuit) throws Exception {
        String l_sql = "SELECT facele.spu_FECuits(" 
        + sqlQuote( p_Cuit) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_Certificado) + "," 
        + sqlQuote( p_ClavePrivada) + "," 
        + sqlQuote( p_TicketLive) + "," 
        + sqlQuote( p_Vencimiento) + "," 
        + sqlQuote( p_Token) + "," 
        + sqlQuote( p_Sign) + "," 
        + sqlQuote( p_VencCert) + "," 
        + sqlQuote( p_CBU) + "," 
        + sqlQuote( p_VencimientoCDC) + "," 
        + sqlQuote( p_TokenCDC) + "," 
        + sqlQuote( p_SignCDC) + "," 
        + sqlQuote( p_VencimientoFEX) + "," 
        + sqlQuote( p_TokenFEX) + "," 
        + sqlQuote( p_SignFEX) + "," 
        + sqlQuote( p_pk_Cuit) + ")";
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
    public int executeSPUR(java.sql.Connection p_conn, TR_FECuits p_rec) throws Exception {
        return executeSPU(p_conn, p_rec.getCuit(),
        p_rec.getDescripcion(),
        p_rec.getCertificado(),
        p_rec.getClavePrivada(),
        p_rec.getTicketLive(),
        p_rec.getVencimiento(),
        p_rec.getToken(),
        p_rec.getSign(),
        p_rec.getVencCert(),
        p_rec.getCBU(),
        p_rec.getVencimientoCDC(),
        p_rec.getTokenCDC(),
        p_rec.getSignCDC(),
        p_rec.getVencimientoFEX(),
        p_rec.getTokenFEX(),
        p_rec.getSignFEX(),
        p_rec.getCuit());
    }
    @Override
    public void executeSPD(java.sql.Connection p_conn,
        Object p_Cuit) throws Exception {
        String l_sql = "SELECT facele.spd_FECuits(" + sqlQuote( p_Cuit) + ")";
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
    public void executeSPDR(java.sql.Connection p_conn, TR_FECuits p_rec) throws Exception {
        executeSPD(p_conn, p_rec.getCuit());
    }

    public void executeSPDWhere(Connection p_conn, String p_where) throws Exception {
        String l_sql = "SELECT facele.spd_FECuits(Cuit) FROM facele.t_FECuits";
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
    public TR_FECuits getById(Long p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (TR_FECuits l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.t_FECuits";
    }

    @Override
    public TR_FECuits getSelected() {
        return super.getSelected();
    }

}
