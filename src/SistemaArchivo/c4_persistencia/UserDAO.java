
package SistemaArchivo.c4_persistencia;

import SistemaArchivo.c3_dominio.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {

    GestorJDBC gestorJDBC;
    
    public UserDAO(GestorJDBC gestorJDBC) {
        this.gestorJDBC = gestorJDBC;
    }
    
    public int guardarUser(User user) throws SQLException {
        int registros_afectados;
        String sentenciaSQL = "INSERT INTO user (username, password, cargo, nombres, apellidos) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setString(1, user.getUsername());
            sentencia.setString(2, user.getPassword());
            sentencia.setInt(3, user.getCargo());
            sentencia.setString(4, user.getNombres());
            sentencia.setString(5, user.getApellidos());
            registros_afectados = sentencia.executeUpdate();
            return registros_afectados;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar guardar el usuario.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
    }
    
}
