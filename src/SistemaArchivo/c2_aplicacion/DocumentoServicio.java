/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaArchivo.c2_aplicacion;

import SistemaArchivo.c3_dominio.Documento;
import SistemaArchivo.c4_persistencia.DocumentoDAO;
import SistemaArchivo.c4_persistencia.GestorJDBC;
import SistemaArchivo.c4_persistencia.GestorJDBCMySQL;

/**
 *
 * @author Ricardo
 */
public class DocumentoServicio {
    
    
    private GestorJDBC gestorJDBC;
    private DocumentoDAO documentoDAO;
    
    
    public DocumentoServicio() {
        gestorJDBC = new GestorJDBCMySQL();
        documentoDAO = new DocumentoDAO(gestorJDBC);
    }
     
    public int guardarDocumento(Documento documento) throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            int registros_afectados = documentoDAO.guardarDocumento(documento);
            gestorJDBC.terminarTransaccion();
            return registros_afectados;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }

    
    
}
