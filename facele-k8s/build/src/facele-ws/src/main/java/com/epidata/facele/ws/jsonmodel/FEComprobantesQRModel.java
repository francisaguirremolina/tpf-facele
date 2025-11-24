package com.epidata.facele.ws.jsonmodel;

import com.epidata.facele.entities.TR_FEComprobantes;
import com.epidata.facele.entities.VR_rp_ComprobanteQR_b64;
import com.epidata.facele.entities.VW_rp_ComprobanteQR_b64;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.util.Base64;
import java.util.Hashtable;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class FEComprobantesQRModel {

    private Integer m_IdDocumentoFE;
    private String m_QRurl;
    private String m_QRjson;

    public String getQRjson() {
        return m_QRjson;
    }

    public void setQRjson(String p_QRjson) {
        this.m_QRjson = p_QRjson;
    }

    public String getQRurl() {
        return m_QRurl;
    }

    public void setQRurl(String p_QRurl) {
        this.m_QRurl = p_QRurl;
    }
    private String m_QRBinary;

    public Integer getIdDocumentoFE() {
        return m_IdDocumentoFE;
    }

    public void setIdDocumentoFE(Integer p_IdDocumentoFE) {
        this.m_IdDocumentoFE = p_IdDocumentoFE;
    }

    public String getQRBinary() {
        return m_QRBinary;
    }

    public void setQRBinary(String p_QRBinary) {
        this.m_QRBinary = p_QRBinary;
    }

    public FEComprobantesQRModel(TR_FEComprobantes p_rec, Connection p_conn)
            throws Exception {

        setIdDocumentoFE(p_rec.getIdDocumentoFE());

        VW_rp_ComprobanteQR_b64 l_view = new VW_rp_ComprobanteQR_b64(p_conn,
                "IdDocumentoFE=" + p_rec.getIdDocumentoFE(), null);
        if (l_view.getRows().isEmpty()) {
            throw new Exception("Comprobante no encontrado");
        } // end if

        VR_rp_ComprobanteQR_b64 l_rec = l_view.getRows().getFirst();
        setQRjson(l_rec.getTextoqr1());
        setQRurl(l_rec.getTextoqr2());

        // Create the ByteMatrix for the QR-Code that encodes the given String
        Hashtable<EncodeHintType, ErrorCorrectionLevel> l_hintMap = new Hashtable<>();
        l_hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
        QRCodeWriter l_qrCodeWriter = new QRCodeWriter();
        BitMatrix l_byteMatrix = l_qrCodeWriter.encode(getQRurl(), BarcodeFormat.QR_CODE, 256, 256, l_hintMap);
        // Make the BufferedImage that are to hold the QRCode
        int l_matrixWidth = l_byteMatrix.getWidth();
        BufferedImage l_image = new BufferedImage(l_matrixWidth, l_matrixWidth, BufferedImage.TYPE_INT_RGB);
        l_image.createGraphics();

        Graphics2D l_graphics = (Graphics2D) l_image.getGraphics();
        l_graphics.setColor(Color.WHITE);
        l_graphics.fillRect(0, 0, l_matrixWidth, l_matrixWidth);
        // Paint and save the image using the ByteMatrix
        l_graphics.setColor(Color.BLACK);

        for (int l_i = 0; l_i < l_matrixWidth; l_i++) {
            for (int l_j = 0; l_j < l_matrixWidth; l_j++) {
                if (l_byteMatrix.get(l_i, l_j)) {
                    l_graphics.fillRect(l_i, l_j, 1, 1);
                } // end if
            } // end for
        } // end if
        
        ByteArrayOutputStream l_outputStream = new ByteArrayOutputStream();
        ImageIO.write(l_image, "png", l_outputStream);
        
        Base64.Encoder l_encoder = Base64.getEncoder();
        String l_base64 = l_encoder.encodeToString(l_outputStream.toByteArray());
        setQRBinary(l_base64);
        
    }

}
