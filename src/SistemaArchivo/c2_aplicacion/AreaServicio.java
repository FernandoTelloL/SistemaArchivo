
package SistemaArchivo.c2_aplicacion;

import SistemaArchivo.c3_dominio.Area;
import SistemaArchivo.c4_persistencia.GestorJDBC;
import SistemaArchivo.c4_persistencia.GestorJDBCMySQL;
import SistemaArchivo.c4_persistencia.AreaDAO;
import java.util.ArrayList;

public class AreaServicio {
    
    private GestorJDBC gestorJDBC;
    private AreaDAO areaDAO;
    
    
    public AreaServicio() {
        gestorJDBC = new GestorJDBCMySQL();
        areaDAO = new AreaDAO(gestorJDBC);
    }
    
    public int guardarArea(Area area) throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            int registros_afectados = areaDAO.guardarArea(area);
            gestorJDBC.terminarTransaccion();
            return registros_afectados;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }
    
     public int eliminarArea(int areaId) throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            int registros_afectados = areaDAO.eliminarArea(areaId);
            gestorJDBC.terminarTransaccion();
            return registros_afectados;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }
     
     public int actualizarArea(Area area) throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            int registros_afectados = areaDAO.actualizarArea(area);
            gestorJDBC.terminarTransaccion();
            return registros_afectados;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }
     
     //este método lo uso para mostrar en la tabla los datos del area
     public ArrayList<Area> mostrarArea() throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            ArrayList<Area> lista = areaDAO.mostrarArea();
            gestorJDBC.terminarTransaccion();
            return lista;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }
}
