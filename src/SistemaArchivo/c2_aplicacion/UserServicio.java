
package SistemaArchivo.c2_aplicacion;

import SistemaArchivo.c3_dominio.User;
import SistemaArchivo.c4_persistencia.UserDAO;
import SistemaArchivo.c4_persistencia.GestorJDBC;
import SistemaArchivo.c4_persistencia.GestorJDBCMySQL;
import java.util.ArrayList;

public class UserServicio {
    
    private GestorJDBC gestorJDBC;
    private UserDAO userDAO;

    public UserServicio() {
        gestorJDBC = new GestorJDBCMySQL();
        userDAO = new UserDAO(gestorJDBC);
    }
    
     public int guardarUser(User user) throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            int registros_afectados = userDAO.guardarUser(user);
            gestorJDBC.terminarTransaccion();
            return registros_afectados;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }

     public int eliminarUser(int userId) throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            int registros_afectados = userDAO.eliminarUser(userId);
            gestorJDBC.terminarTransaccion();
            return registros_afectados;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }
     
     public int actualizarUser(User user) throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            int registros_afectados = userDAO.actualizarUser(user);
            gestorJDBC.terminarTransaccion();
            return registros_afectados;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }
    
     
     //este método lo uso para mostrar en la tabla los datos del usuario
     public ArrayList<User> mostrarUser() throws Exception {
        try {
            gestorJDBC.abrirConexion();
            gestorJDBC.iniciarTransaccion();
            ArrayList<User> lista = userDAO.mostrarUser();
            gestorJDBC.terminarTransaccion();
            return lista;
        } catch (Exception e) {
            gestorJDBC.cancelarTransaccion();
            gestorJDBC.cerrarConexion();
            throw e;
        }
    }
}
