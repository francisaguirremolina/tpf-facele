/**
ORM table class for: FEComprobantesDet
Generated: 2025-10-21 15:27:38
CRDETR una línea de detalle de un comprobante electrónico. Estas líneas no se necesitan para la solicitud del CAE, pero sí para la impresión autónoma del comprobante, independizando el módulo de Factura Electrónica del resto del sistema de gestión.
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

public class T_FEComprobantesDet extends AbstractTable<TR_FEComprobantesDet> implements SinglePkRelation<Integer> {

    public T_FEComprobantesDet() {
        super(TR_FEComprobantesDet.class);
    }

    public T_FEComprobantesDet(ResultSet p_rs) throws Exception {
        super(TR_FEComprobantesDet.class, p_rs);
    }

    public T_FEComprobantesDet(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(TR_FEComprobantesDet.class, p_conn, p_where, p_orderBy);
    }

    public Integer executeSPI(java.sql.Connection p_conn,
        Integer p_IdDocumentoFE,
        Double p_Cantidad,
        String p_Descripcion,
        Double p_PrecioUnitario,
        Double p_Valor1,
        Double p_Valor2,
        Double p_Subtotal,
        String p_LineaDet1,
        String p_LineaDet2,
        String p_CodigoProducto,
        Double p_Bonificacion,
        Integer p_IdFEXUnidadMedida) throws Exception {
        String l_sql = "SELECT facele.spi_FEComprobantesDet(" 
        + sqlQuote( p_IdDocumentoFE) + "," 
        + sqlQuote( p_Cantidad) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_PrecioUnitario) + "," 
        + sqlQuote( p_Valor1) + "," 
        + sqlQuote( p_Valor2) + "," 
        + sqlQuote( p_Subtotal) + "," 
        + sqlQuote( p_LineaDet1) + "," 
        + sqlQuote( p_LineaDet2) + "," 
        + sqlQuote( p_CodigoProducto) + "," 
        + sqlQuote( p_Bonificacion) + "," 
        + sqlQuote( p_IdFEXUnidadMedida) + ")";
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
    public Integer executeSPIR(java.sql.Connection p_conn, TR_FEComprobantesDet p_rec) throws Exception {
        Integer l_toReturn =  executeSPI(p_conn, p_rec.getIdDocumentoFE(),
        p_rec.getCantidad(),
        p_rec.getDescripcion(),
        p_rec.getPrecioUnitario(),
        p_rec.getValor1(),
        p_rec.getValor2(),
        p_rec.getSubtotal(),
        p_rec.getLineaDet1(),
        p_rec.getLineaDet2(),
        p_rec.getCodigoProducto(),
        p_rec.getBonificacion(),
        p_rec.getIdFEXUnidadMedida());
        p_rec.setIdComprobanteDet(l_toReturn);
        return l_toReturn;
    }
    public int executeSPU(java.sql.Connection p_conn,
        Integer p_IdDocumentoFE,
        Double p_Cantidad,
        String p_Descripcion,
        Double p_PrecioUnitario,
        Double p_Valor1,
        Double p_Valor2,
        Double p_Subtotal,
        String p_LineaDet1,
        String p_LineaDet2,
        String p_CodigoProducto,
        Double p_Bonificacion,
        Integer p_IdFEXUnidadMedida,
        Integer p_pk_IdComprobanteDet) throws Exception {
        String l_sql = "SELECT facele.spu_FEComprobantesDet(" 
        + sqlQuote( p_IdDocumentoFE) + "," 
        + sqlQuote( p_Cantidad) + "," 
        + sqlQuote( p_Descripcion) + "," 
        + sqlQuote( p_PrecioUnitario) + "," 
        + sqlQuote( p_Valor1) + "," 
        + sqlQuote( p_Valor2) + "," 
        + sqlQuote( p_Subtotal) + "," 
        + sqlQuote( p_LineaDet1) + "," 
        + sqlQuote( p_LineaDet2) + "," 
        + sqlQuote( p_CodigoProducto) + "," 
        + sqlQuote( p_Bonificacion) + "," 
        + sqlQuote( p_IdFEXUnidadMedida) + "," 
        + sqlQuote( p_pk_IdComprobanteDet) + ")";
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
    public int executeSPUR(java.sql.Connection p_conn, TR_FEComprobantesDet p_rec) throws Exception {
        return executeSPU(p_conn, p_rec.getIdDocumentoFE(),
        p_rec.getCantidad(),
        p_rec.getDescripcion(),
        p_rec.getPrecioUnitario(),
        p_rec.getValor1(),
        p_rec.getValor2(),
        p_rec.getSubtotal(),
        p_rec.getLineaDet1(),
        p_rec.getLineaDet2(),
        p_rec.getCodigoProducto(),
        p_rec.getBonificacion(),
        p_rec.getIdFEXUnidadMedida(),
        p_rec.getIdComprobanteDet());
    }
    @Override
    public void executeSPD(java.sql.Connection p_conn,
        Object p_IdComprobanteDet) throws Exception {
        String l_sql = "SELECT facele.spd_FEComprobantesDet(" + sqlQuote( p_IdComprobanteDet) + ")";
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
    public void executeSPDR(java.sql.Connection p_conn, TR_FEComprobantesDet p_rec) throws Exception {
        executeSPD(p_conn, p_rec.getIdComprobanteDet());
    }

    public void executeSPDWhere(Connection p_conn, String p_where) throws Exception {
        String l_sql = "SELECT facele.spd_FEComprobantesDet(IdComprobanteDet) FROM facele.t_FEComprobantesDet";
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
    public TR_FEComprobantesDet getById(Integer p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (TR_FEComprobantesDet l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.t_FEComprobantesDet";
    }

    @Override
    public TR_FEComprobantesDet getSelected() {
        return super.getSelected();
    }

}
