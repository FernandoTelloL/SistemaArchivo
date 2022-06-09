
package SistemaArchivo.c2_aplicacion;

import SistemaArchivo.c3_dominio.User;
import SistemaArchivo.c4_persistencia.UserDAO;
import SistemaArchivo.c4_persistencia.GestorJDBC;
import SistemaArchivo.c4_persistencia.GestorJDBCMySQL;

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

}
