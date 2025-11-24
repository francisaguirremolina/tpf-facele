/**
ORM table class for: FEComprobantes
Generated: 2025-10-21 15:27:38
CRDETR un comprobante electrónico, ya autorizado o pendiente de autorización.
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

public class T_FEComprobantes extends AbstractTable<TR_FEComprobantes> implements SinglePkRelation<Integer> {

    public T_FEComprobantes() {
        super(TR_FEComprobantes.class);
    }

    public T_FEComprobantes(ResultSet p_rs) throws Exception {
        super(TR_FEComprobantes.class, p_rs);
    }

    public T_FEComprobantes(Connection p_conn, String p_where, String p_orderBy) throws Exception {
        super(TR_FEComprobantes.class, p_conn, p_where, p_orderBy);
    }

    public Void executeSPI(java.sql.Connection p_conn,
        Integer p_IdDocumentoFE,
        Integer p_IdPtoVta,
        Integer p_CbteTipo,
        Integer p_CbteDesde,
        Integer p_CbteHasta,
        Integer p_Concepto,
        Integer p_DocTipo,
        Long p_DocNro,
        Date p_CbteFch,
        Double p_ImpTotal,
        Double p_ImpTotConc,
        Double p_ImpNeto,
        Double p_ImpOpEx,
        Double p_ImpTrib,
        Double p_ImpIVA,
        Date p_FchServDesde,
        Date p_FchServHasta,
        Date p_FchVtoPago,
        String p_MonId,
        Double p_MonCotiz,
        String p_Resultado,
        String p_CodAutorizacion,
        Date p_CAEFchVto,
        String p_HashLink,
        String p_CodeErrs,
        String p_MsgErrs,
        String p_ReportTemplate,
        String p_BarCode,
        String p_RazonSocial,
        String p_Domicilio1,
        String p_Domicilio2,
        String p_LineaCab1,
        String p_LineaCab2,
        String p_LineaCab3,
        String p_LineaCab4,
        String p_LineaCab5,
        String p_LineaCab6,
        String p_LineaCab7,
        String p_LineaCab8,
        String p_LineaCab9,
        String p_LineaCab10,
        String p_LineaCab11,
        String p_LineaCab12,
        String p_LineaCab13,
        String p_LineaCab14,
        String p_LineaCab15,
        String p_LineaCab16,
        String p_LineaCab17,
        String p_LineaCab18,
        String p_LineaCab19,
        String p_LineaCab20,
        java.sql.Timestamp p_FchProceso,
        String p_PDFFileName,
        String p_ModeloCopias,
        String p_EstadoPDF,
        Integer p_IdLoteFacturacion,
        Long p_CodActividad,
        Integer p_CodCondIva,
        String p_PermisoExistente,
        String p_IdFEXDstPais,
        Long p_IdFEXDstCuit,
        String p_CanMisMonExt,
        String p_ObsComerciales,
        String p_Observaciones,
        String p_FormaPago,
        Integer p_IdFEXIdioma,
        String p_IdFEXIncoterm,
        String p_IncotermsDesc,
        String p_MontoEscrito) throws Exception {
        String l_sql = "SELECT facele.spi_FEComprobantes(" 
        + sqlQuote( p_IdDocumentoFE) + "," 
        + sqlQuote( p_IdPtoVta) + "," 
        + sqlQuote( p_CbteTipo) + "," 
        + sqlQuote( p_CbteDesde) + "," 
        + sqlQuote( p_CbteHasta) + "," 
        + sqlQuote( p_Concepto) + "," 
        + sqlQuote( p_DocTipo) + "," 
        + sqlQuote( p_DocNro) + "," 
        + sqlQuote( p_CbteFch) + "," 
        + sqlQuote( p_ImpTotal) + "," 
        + sqlQuote( p_ImpTotConc) + "," 
        + sqlQuote( p_ImpNeto) + "," 
        + sqlQuote( p_ImpOpEx) + "," 
        + sqlQuote( p_ImpTrib) + "," 
        + sqlQuote( p_ImpIVA) + "," 
        + sqlQuote( p_FchServDesde) + "," 
        + sqlQuote( p_FchServHasta) + "," 
        + sqlQuote( p_FchVtoPago) + "," 
        + sqlQuote( p_MonId) + "," 
        + sqlQuote( p_MonCotiz) + "," 
        + sqlQuote( p_Resultado) + "," 
        + sqlQuote( p_CodAutorizacion) + "," 
        + sqlQuote( p_CAEFchVto) + "," 
        + sqlQuote( p_HashLink) + "," 
        + sqlQuote( p_CodeErrs) + "," 
        + sqlQuote( p_MsgErrs) + "," 
        + sqlQuote( p_ReportTemplate) + "," 
        + sqlQuote( p_BarCode) + "," 
        + sqlQuote( p_RazonSocial) + "," 
        + sqlQuote( p_Domicilio1) + "," 
        + sqlQuote( p_Domicilio2) + "," 
        + sqlQuote( p_LineaCab1) + "," 
        + sqlQuote( p_LineaCab2) + "," 
        + sqlQuote( p_LineaCab3) + "," 
        + sqlQuote( p_LineaCab4) + "," 
        + sqlQuote( p_LineaCab5) + "," 
        + sqlQuote( p_LineaCab6) + "," 
        + sqlQuote( p_LineaCab7) + "," 
        + sqlQuote( p_LineaCab8) + "," 
        + sqlQuote( p_LineaCab9) + "," 
        + sqlQuote( p_LineaCab10) + "," 
        + sqlQuote( p_LineaCab11) + "," 
        + sqlQuote( p_LineaCab12) + "," 
        + sqlQuote( p_LineaCab13) + "," 
        + sqlQuote( p_LineaCab14) + "," 
        + sqlQuote( p_LineaCab15) + "," 
        + sqlQuote( p_LineaCab16) + "," 
        + sqlQuote( p_LineaCab17) + "," 
        + sqlQuote( p_LineaCab18) + "," 
        + sqlQuote( p_LineaCab19) + "," 
        + sqlQuote( p_LineaCab20) + "," 
        + sqlQuote( p_FchProceso) + "," 
        + sqlQuote( p_PDFFileName) + "," 
        + sqlQuote( p_ModeloCopias) + "," 
        + sqlQuote( p_EstadoPDF) + "," 
        + sqlQuote( p_IdLoteFacturacion) + "," 
        + sqlQuote( p_CodActividad) + "," 
        + sqlQuote( p_CodCondIva) + "," 
        + sqlQuote( p_PermisoExistente) + "," 
        + sqlQuote( p_IdFEXDstPais) + "," 
        + sqlQuote( p_IdFEXDstCuit) + "," 
        + sqlQuote( p_CanMisMonExt) + "," 
        + sqlQuote( p_ObsComerciales) + "," 
        + sqlQuote( p_Observaciones) + "," 
        + sqlQuote( p_FormaPago) + "," 
        + sqlQuote( p_IdFEXIdioma) + "," 
        + sqlQuote( p_IdFEXIncoterm) + "," 
        + sqlQuote( p_IncotermsDesc) + "," 
        + sqlQuote( p_MontoEscrito) + ")";
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
    public Void executeSPIR(java.sql.Connection p_conn, TR_FEComprobantes p_rec) throws Exception {
        return executeSPI(p_conn, p_rec.getIdDocumentoFE(),
        p_rec.getIdPtoVta(),
        p_rec.getCbteTipo(),
        p_rec.getCbteDesde(),
        p_rec.getCbteHasta(),
        p_rec.getConcepto(),
        p_rec.getDocTipo(),
        p_rec.getDocNro(),
        p_rec.getCbteFch(),
        p_rec.getImpTotal(),
        p_rec.getImpTotConc(),
        p_rec.getImpNeto(),
        p_rec.getImpOpEx(),
        p_rec.getImpTrib(),
        p_rec.getImpIVA(),
        p_rec.getFchServDesde(),
        p_rec.getFchServHasta(),
        p_rec.getFchVtoPago(),
        p_rec.getMonId(),
        p_rec.getMonCotiz(),
        p_rec.getResultado(),
        p_rec.getCodAutorizacion(),
        p_rec.getCAEFchVto(),
        p_rec.getHashLink(),
        p_rec.getCodeErrs(),
        p_rec.getMsgErrs(),
        p_rec.getReportTemplate(),
        p_rec.getBarCode(),
        p_rec.getRazonSocial(),
        p_rec.getDomicilio1(),
        p_rec.getDomicilio2(),
        p_rec.getLineaCab1(),
        p_rec.getLineaCab2(),
        p_rec.getLineaCab3(),
        p_rec.getLineaCab4(),
        p_rec.getLineaCab5(),
        p_rec.getLineaCab6(),
        p_rec.getLineaCab7(),
        p_rec.getLineaCab8(),
        p_rec.getLineaCab9(),
        p_rec.getLineaCab10(),
        p_rec.getLineaCab11(),
        p_rec.getLineaCab12(),
        p_rec.getLineaCab13(),
        p_rec.getLineaCab14(),
        p_rec.getLineaCab15(),
        p_rec.getLineaCab16(),
        p_rec.getLineaCab17(),
        p_rec.getLineaCab18(),
        p_rec.getLineaCab19(),
        p_rec.getLineaCab20(),
        p_rec.getFchProceso(),
        p_rec.getPDFFileName(),
        p_rec.getModeloCopias(),
        p_rec.getEstadoPDF(),
        p_rec.getIdLoteFacturacion(),
        p_rec.getCodActividad(),
        p_rec.getCodCondIva(),
        p_rec.getPermisoExistente(),
        p_rec.getIdFEXDstPais(),
        p_rec.getIdFEXDstCuit(),
        p_rec.getCanMisMonExt(),
        p_rec.getObsComerciales(),
        p_rec.getObservaciones(),
        p_rec.getFormaPago(),
        p_rec.getIdFEXIdioma(),
        p_rec.getIdFEXIncoterm(),
        p_rec.getIncotermsDesc(),
        p_rec.getMontoEscrito());
    }
    public int executeSPU(java.sql.Connection p_conn,
        Integer p_IdDocumentoFE,
        Integer p_IdPtoVta,
        Integer p_CbteTipo,
        Integer p_CbteDesde,
        Integer p_CbteHasta,
        Integer p_Concepto,
        Integer p_DocTipo,
        Long p_DocNro,
        Date p_CbteFch,
        Double p_ImpTotal,
        Double p_ImpTotConc,
        Double p_ImpNeto,
        Double p_ImpOpEx,
        Double p_ImpTrib,
        Double p_ImpIVA,
        Date p_FchServDesde,
        Date p_FchServHasta,
        Date p_FchVtoPago,
        String p_MonId,
        Double p_MonCotiz,
        String p_Resultado,
        String p_CodAutorizacion,
        Date p_CAEFchVto,
        String p_HashLink,
        String p_CodeErrs,
        String p_MsgErrs,
        String p_ReportTemplate,
        String p_BarCode,
        String p_RazonSocial,
        String p_Domicilio1,
        String p_Domicilio2,
        String p_LineaCab1,
        String p_LineaCab2,
        String p_LineaCab3,
        String p_LineaCab4,
        String p_LineaCab5,
        String p_LineaCab6,
        String p_LineaCab7,
        String p_LineaCab8,
        String p_LineaCab9,
        String p_LineaCab10,
        String p_LineaCab11,
        String p_LineaCab12,
        String p_LineaCab13,
        String p_LineaCab14,
        String p_LineaCab15,
        String p_LineaCab16,
        String p_LineaCab17,
        String p_LineaCab18,
        String p_LineaCab19,
        String p_LineaCab20,
        java.sql.Timestamp p_FchProceso,
        String p_PDFFileName,
        String p_ModeloCopias,
        String p_EstadoPDF,
        Integer p_IdLoteFacturacion,
        Long p_CodActividad,
        Integer p_CodCondIva,
        String p_PermisoExistente,
        String p_IdFEXDstPais,
        Long p_IdFEXDstCuit,
        String p_CanMisMonExt,
        String p_ObsComerciales,
        String p_Observaciones,
        String p_FormaPago,
        Integer p_IdFEXIdioma,
        String p_IdFEXIncoterm,
        String p_IncotermsDesc,
        String p_MontoEscrito,
        Integer p_pk_IdDocumentoFE) throws Exception {
        String l_sql = "SELECT facele.spu_FEComprobantes(" 
        + sqlQuote( p_IdDocumentoFE) + "," 
        + sqlQuote( p_IdPtoVta) + "," 
        + sqlQuote( p_CbteTipo) + "," 
        + sqlQuote( p_CbteDesde) + "," 
        + sqlQuote( p_CbteHasta) + "," 
        + sqlQuote( p_Concepto) + "," 
        + sqlQuote( p_DocTipo) + "," 
        + sqlQuote( p_DocNro) + "," 
        + sqlQuote( p_CbteFch) + "," 
        + sqlQuote( p_ImpTotal) + "," 
        + sqlQuote( p_ImpTotConc) + "," 
        + sqlQuote( p_ImpNeto) + "," 
        + sqlQuote( p_ImpOpEx) + "," 
        + sqlQuote( p_ImpTrib) + "," 
        + sqlQuote( p_ImpIVA) + "," 
        + sqlQuote( p_FchServDesde) + "," 
        + sqlQuote( p_FchServHasta) + "," 
        + sqlQuote( p_FchVtoPago) + "," 
        + sqlQuote( p_MonId) + "," 
        + sqlQuote( p_MonCotiz) + "," 
        + sqlQuote( p_Resultado) + "," 
        + sqlQuote( p_CodAutorizacion) + "," 
        + sqlQuote( p_CAEFchVto) + "," 
        + sqlQuote( p_HashLink) + "," 
        + sqlQuote( p_CodeErrs) + "," 
        + sqlQuote( p_MsgErrs) + "," 
        + sqlQuote( p_ReportTemplate) + "," 
        + sqlQuote( p_BarCode) + "," 
        + sqlQuote( p_RazonSocial) + "," 
        + sqlQuote( p_Domicilio1) + "," 
        + sqlQuote( p_Domicilio2) + "," 
        + sqlQuote( p_LineaCab1) + "," 
        + sqlQuote( p_LineaCab2) + "," 
        + sqlQuote( p_LineaCab3) + "," 
        + sqlQuote( p_LineaCab4) + "," 
        + sqlQuote( p_LineaCab5) + "," 
        + sqlQuote( p_LineaCab6) + "," 
        + sqlQuote( p_LineaCab7) + "," 
        + sqlQuote( p_LineaCab8) + "," 
        + sqlQuote( p_LineaCab9) + "," 
        + sqlQuote( p_LineaCab10) + "," 
        + sqlQuote( p_LineaCab11) + "," 
        + sqlQuote( p_LineaCab12) + "," 
        + sqlQuote( p_LineaCab13) + "," 
        + sqlQuote( p_LineaCab14) + "," 
        + sqlQuote( p_LineaCab15) + "," 
        + sqlQuote( p_LineaCab16) + "," 
        + sqlQuote( p_LineaCab17) + "," 
        + sqlQuote( p_LineaCab18) + "," 
        + sqlQuote( p_LineaCab19) + "," 
        + sqlQuote( p_LineaCab20) + "," 
        + sqlQuote( p_FchProceso) + "," 
        + sqlQuote( p_PDFFileName) + "," 
        + sqlQuote( p_ModeloCopias) + "," 
        + sqlQuote( p_EstadoPDF) + "," 
        + sqlQuote( p_IdLoteFacturacion) + "," 
        + sqlQuote( p_CodActividad) + "," 
        + sqlQuote( p_CodCondIva) + "," 
        + sqlQuote( p_PermisoExistente) + "," 
        + sqlQuote( p_IdFEXDstPais) + "," 
        + sqlQuote( p_IdFEXDstCuit) + "," 
        + sqlQuote( p_CanMisMonExt) + "," 
        + sqlQuote( p_ObsComerciales) + "," 
        + sqlQuote( p_Observaciones) + "," 
        + sqlQuote( p_FormaPago) + "," 
        + sqlQuote( p_IdFEXIdioma) + "," 
        + sqlQuote( p_IdFEXIncoterm) + "," 
        + sqlQuote( p_IncotermsDesc) + "," 
        + sqlQuote( p_MontoEscrito) + "," 
        + sqlQuote( p_pk_IdDocumentoFE) + ")";
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
    public int executeSPUR(java.sql.Connection p_conn, TR_FEComprobantes p_rec) throws Exception {
        return executeSPU(p_conn, p_rec.getIdDocumentoFE(),
        p_rec.getIdPtoVta(),
        p_rec.getCbteTipo(),
        p_rec.getCbteDesde(),
        p_rec.getCbteHasta(),
        p_rec.getConcepto(),
        p_rec.getDocTipo(),
        p_rec.getDocNro(),
        p_rec.getCbteFch(),
        p_rec.getImpTotal(),
        p_rec.getImpTotConc(),
        p_rec.getImpNeto(),
        p_rec.getImpOpEx(),
        p_rec.getImpTrib(),
        p_rec.getImpIVA(),
        p_rec.getFchServDesde(),
        p_rec.getFchServHasta(),
        p_rec.getFchVtoPago(),
        p_rec.getMonId(),
        p_rec.getMonCotiz(),
        p_rec.getResultado(),
        p_rec.getCodAutorizacion(),
        p_rec.getCAEFchVto(),
        p_rec.getHashLink(),
        p_rec.getCodeErrs(),
        p_rec.getMsgErrs(),
        p_rec.getReportTemplate(),
        p_rec.getBarCode(),
        p_rec.getRazonSocial(),
        p_rec.getDomicilio1(),
        p_rec.getDomicilio2(),
        p_rec.getLineaCab1(),
        p_rec.getLineaCab2(),
        p_rec.getLineaCab3(),
        p_rec.getLineaCab4(),
        p_rec.getLineaCab5(),
        p_rec.getLineaCab6(),
        p_rec.getLineaCab7(),
        p_rec.getLineaCab8(),
        p_rec.getLineaCab9(),
        p_rec.getLineaCab10(),
        p_rec.getLineaCab11(),
        p_rec.getLineaCab12(),
        p_rec.getLineaCab13(),
        p_rec.getLineaCab14(),
        p_rec.getLineaCab15(),
        p_rec.getLineaCab16(),
        p_rec.getLineaCab17(),
        p_rec.getLineaCab18(),
        p_rec.getLineaCab19(),
        p_rec.getLineaCab20(),
        p_rec.getFchProceso(),
        p_rec.getPDFFileName(),
        p_rec.getModeloCopias(),
        p_rec.getEstadoPDF(),
        p_rec.getIdLoteFacturacion(),
        p_rec.getCodActividad(),
        p_rec.getCodCondIva(),
        p_rec.getPermisoExistente(),
        p_rec.getIdFEXDstPais(),
        p_rec.getIdFEXDstCuit(),
        p_rec.getCanMisMonExt(),
        p_rec.getObsComerciales(),
        p_rec.getObservaciones(),
        p_rec.getFormaPago(),
        p_rec.getIdFEXIdioma(),
        p_rec.getIdFEXIncoterm(),
        p_rec.getIncotermsDesc(),
        p_rec.getMontoEscrito(),
        p_rec.getIdDocumentoFE());
    }
    @Override
    public void executeSPD(java.sql.Connection p_conn,
        Object p_IdDocumentoFE) throws Exception {
        String l_sql = "SELECT facele.spd_FEComprobantes(" + sqlQuote( p_IdDocumentoFE) + ")";
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
    public void executeSPDR(java.sql.Connection p_conn, TR_FEComprobantes p_rec) throws Exception {
        executeSPD(p_conn, p_rec.getIdDocumentoFE());
    }

    public void executeSPDWhere(Connection p_conn, String p_where) throws Exception {
        String l_sql = "SELECT facele.spd_FEComprobantes(IdDocumentoFE) FROM facele.t_FEComprobantes";
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
    public TR_FEComprobantes getById(Integer p_id) {
        if (p_id == null) {return null;} // end if
        if (getRows().isEmpty()) {return null;} // end if
        for (TR_FEComprobantes l_aRow : getRows()) {
            if (l_aRow.getId().equals(p_id)) {return l_aRow;} // end if
        } // end for
        return null;
    }

    @Override
    public String getSqlName() {
        return "facele.t_FEComprobantes";
    }

    @Override
    public TR_FEComprobantes getSelected() {
        return super.getSelected();
    }

}
