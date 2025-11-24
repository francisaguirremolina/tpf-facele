/**
ORM table class for: FEPtosVta
Generated: 2025-10-21 15:27:38
CRDETR un punto de venta de un CUIT, habilitado para la emisión de comprobantes electrónicos.
Un punto de venta ES-PARTE-DE un CUIT.
La lista puede obtenerse invocando la operación "FEParamGetPtosVenta" del web-service.
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

public class T_FEPtosVta extends AbstractTable<TR_FEPtosVta> implements SinglePkRelation<Integer> {

    public T_FEPtosVta() {
        super(TR_FEPtosVta.class);
    }

    public T_FEPtosVta(ResultSet p_rs) throws Exception {
        super(TR_FEPtosVta.class, p_rs);
    }

    public T_FEPtosVta(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(TR_FEPtosVta.class, p_conn, p_where, p_orderBy);
    }

    public Integer executeSPI(java.sql.Connection p_conn,
        Long p_Cuit,
        Integer p_PtoVta,
        String p_Descripcion,
        String p_LineaComprobante1,
        String p_LineaComprobante2,
        String p_LineaComprobante3,
        String p_LineaComprobante4,
        String p_LineaComprobante5,
        String p_LineaComprobante6,
        String p_LineaComprobante7,
        String p_LineaComprobante8,
        String p_LineaComprobante9,
        String p_LineaComprobante10,
        Long p_CodActividad) throws Exception {
        String l_sql = "SELECT facele.spi_FEPtosVta(" 
        + sqlQuote( p_Cuit) + "," 
        + sqlQuote( p_PtoVta) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_LineaComprobante1) + "," 
        + sqlQuote( p_LineaComprobante2) + "," 
        + sqlQuote( p_LineaComprobante3) + "," 
        + sqlQuote( p_LineaComprobante4) + "," 
        + sqlQuote( p_LineaComprobante5) + "," 
        + sqlQuote( p_LineaComprobante6) + "," 
        + sqlQuote( p_LineaComprobante7) + "," 
        + sqlQuote( p_LineaComprobante8) + "," 
        + sqlQuote( p_LineaComprobante9) + "," 
        + sqlQuote( p_LineaComprobante10) + "," 
        + sqlQuote( p_CodActividad) + ")";
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
    public Integer executeSPIR(java.sql.Connection p_conn, TR_FEPtosVta p_rec) throws Exception {
        Integer l_toReturn =  executeSPI(p_conn, p_rec.getCuit(),
        p_rec.getPtoVta(),
        p_rec.getDescripcion(),
        p_rec.getLineaComprobante1(),
        p_rec.getLineaComprobante2(),
        p_rec.getLineaComprobante3(),
        p_rec.getLineaComprobante4(),
        p_rec.getLineaComprobante5(),
        p_rec.getLineaComprobante6(),
        p_rec.getLineaComprobante7(),
        p_rec.getLineaComprobante8(),
        p_rec.getLineaComprobante9(),
        p_rec.getLineaComprobante10(),
        p_rec.getCodActividad());
        p_rec.setIdPtoVta(l_toReturn);
        return l_toReturn;
    }
    public int executeSPU(java.sql.Connection p_conn,
        Long p_Cuit,
        Integer p_PtoVta,
        String p_Descripcion,
        String p_LineaComprobante1,
        String p_LineaComprobante2,
        String p_LineaComprobante3,
        String p_LineaComprobante4,
        String p_LineaComprobante5,
        String p_LineaComprobante6,
        String p_LineaComprobante7,
        String p_LineaComprobante8,
        String p_LineaComprobante9,
        String p_LineaComprobante10,
        Long p_CodActividad,
        Integer p_pk_IdPtoVta) throws Exception {
        String l_sql = "SELECT facele.spu_FEPtosVta(" 
        + sqlQuote( p_Cuit) + "," 
        + sqlQuote( p_PtoVta) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_LineaComprobante1) + "," 
        + sqlQuote( p_LineaComprobante2) + "," 
        + sqlQuote( p_LineaComprobante3) + "," 
        + sqlQuote( p_LineaComprobante4) + "," 
        + sqlQuote( p_LineaComprobante5) + "," 
        + sqlQuote( p_LineaComprobante6) + "," 
        + sqlQuote( p_LineaComprobante7) + "," 
        + sqlQuote( p_LineaComprobante8) + "," 
        + sqlQuote( p_LineaComprobante9) + "," 
        + sqlQuote( p_LineaComprobante10) + "," 
        + sqlQuote( p_CodActividad) + "," 
        + sqlQuote( p_pk_IdPtoVta) + ")";
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
    public int executeSPUR(java.sql.Connection p_conn, TR_FEPtosVta p_rec) throws Exception {
        return executeSPU(p_conn, p_rec.getCuit(),
        p_rec.getPtoVta(),
        p_rec.getDescripcion(),
        p_rec.getLineaComprobante1(),
        p_rec.getLineaComprobante2(),
        p_rec.getLineaComprobante3(),
        p_rec.getLineaComprobante4(),
        p_rec.getLineaComprobante5(),
        p_rec.getLineaComprobante6(),
        p_rec.getLineaComprobante7(),
        p_rec.getLineaComprobante8(),
        p_rec.getLineaComprobante9(),
        p_rec.getLineaComprobante10(),
        p_rec.getCodActividad(),
        p_rec.getIdPtoVta());
    }
    @Override
    public void executeSPD(java.sql.Connection p_conn,
        Object p_IdPtoVta) throws Exception {
        String l_sql = "SELECT facele.spd_FEPtosVta(" + sqlQuote( p_IdPtoVta) + ")";
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
    public void executeSPDR(java.sql.Connection p_conn, TR_FEPtosVta p_rec) throws Exception {
        executeSPD(p_conn, p_rec.getIdPtoVta());
    }

    public void executeSPDWhere(Connection p_conn, String p_where) throws Exception {
        String l_sql = "SELECT facele.spd_FEPtosVta(IdPtoVta) FROM facele.t_FEPtosVta";
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
    public TR_FEPtosVta getById(Integer p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (TR_FEPtosVta l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.t_FEPtosVta";
    }

    @Override
    public TR_FEPtosVta getSelected() {
        return super.getSelected();
    }

}
