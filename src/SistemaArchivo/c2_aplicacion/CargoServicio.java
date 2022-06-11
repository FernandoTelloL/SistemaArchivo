

package SistemaArchivo.c2_aplicacion;

import SistemaArchivo.c3_dominio.Cargo;
import SistemaArchivo.c4_persistencia.CargoDAO;
import SistemaArchivo.c4_persistencia.GestorJDBC;
import SistemaArchivo.c4_persistencia.GestorJDBCMySQL;
import java.util.ArrayList;

public class CargoServicio {
    
    private GestorJDBC gestorJDBC;
    private CargoDAO cargoDAO;

    public CargoServicio() {
        gestorJDBC = new GestorJDBCMySQL();
        cargoDAO = new CargoDAO(gestorJDBC);
    }
     
    public int guardarCargo(Cargo cargo) throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            int registros_afectados = cargoDAO.guardarCargo(cargo);
            gestorJDBC.terminarTransaccion();
            return registros_afectados;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }

    public int eliminarCargo(int cargoId) throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            int registros_afectados = cargoDAO.eliminarCargo(cargoId);
            gestorJDBC.terminarTransaccion();
            return registros_afectados;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }
    
    public int actualizarCargo(Cargo cargo) throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            int registros_afectados = cargoDAO.actualizarCargo(cargo);
            gestorJDBC.terminarTransaccion();
            return registros_afectados;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }
    
    public ArrayList<Cargo> mostrarCargo() throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            ArrayList<Cargo> lista = cargoDAO.mostrarCargo();
            gestorJDBC.terminarTransaccion();
            return lista;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }
    
    public int obtenerIdCargo(String nombreCargo) throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            int idCargo = cargoDAO.obtenerIdCargo(nombreCargo);
            gestorJDBC.terminarTransaccion();
            return idCargo;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }

    public String obtenerNombreCargo(int id) throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            String nombreCargo = cargoDAO.obtenerNombreCargo(id);
            gestorJDBC.terminarTransaccion();
            return nombreCargo;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }
    
}
