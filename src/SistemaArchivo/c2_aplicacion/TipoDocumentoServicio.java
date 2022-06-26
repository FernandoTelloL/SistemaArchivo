
package SistemaArchivo.c2_aplicacion;


import SistemaArchivo.c3_dominio.TipoDocumento;
import SistemaArchivo.c4_persistencia.GestorJDBC;
import SistemaArchivo.c4_persistencia.GestorJDBCMySQL;
import SistemaArchivo.c4_persistencia.TipoDocumentoDAO;
import java.util.ArrayList;

public class TipoDocumentoServicio {
    
    private GestorJDBC gestorJDBC;
    private TipoDocumentoDAO tipoDocumentoDAO;
    
    
    public TipoDocumentoServicio() {
        gestorJDBC = new GestorJDBCMySQL();
        tipoDocumentoDAO = new TipoDocumentoDAO(gestorJDBC);
    }
    
     public int guardarTipoDocumento(TipoDocumento tipoDocumento) throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            int registros_afectados = tipoDocumentoDAO.guardarArea(tipoDocumento);
            gestorJDBC.terminarTransaccion();
            return registros_afectados;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }
     
    public int eliminarTipoDocumento(int tipoDocumentoId) throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            int registros_afectados = tipoDocumentoDAO.eliminarTipoDocumento(tipoDocumentoId);
            gestorJDBC.terminarTransaccion();
            return registros_afectados;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }
    
    public int actualizarTipoDocumento(TipoDocumento tipoDocumento) throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            int registros_afectados = tipoDocumentoDAO.actualizarTipoDocumento(tipoDocumento);
            gestorJDBC.terminarTransaccion();
            return registros_afectados;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }
    
    //este método lo uso para mostrar en la tabla los datos del area
     public ArrayList<TipoDocumento> mostrarTipoDocumento() throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            ArrayList<TipoDocumento> lista = tipoDocumentoDAO.mostrarTipoDocumento();
            gestorJDBC.terminarTransaccion();
            return lista;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }
}
