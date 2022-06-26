
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
        String sentenciaSQL = "INSERT INTO user (username, password, cargo_id, nombres, apellidos) VALUES (?,?,?,?,?)";
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
    
    public int eliminarUser(int userId) throws SQLException {
        int registros_afectados;
        String sentenciaSQL = "update user set estado='E' where id = ?";
        try {
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setInt(1, userId);
            registros_afectados = sentencia.executeUpdate();
            return registros_afectados;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar eliminar el USUARIO.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
    }
    
     public int actualizarUser(User user) throws SQLException {
        int registros_afectados;
        String sentenciaSQL = "update user set username=?, password=?, cargo_id=?, nombres=?, apellidos=? where id = ?";
        try {
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setString(1, user.getUsername());
            sentencia.setString(2, user.getPassword());
            sentencia.setInt(3, user.getCargo());
            sentencia.setString(4, user.getNombres());
            sentencia.setString(5, user.getApellidos());
            sentencia.setInt(6, user.getId());
            registros_afectados = sentencia.executeUpdate();
            return registros_afectados;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar actualizar el USUARIO.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
    }
    
     //ESTE METODO FALTA IMPLEMENTAR EN INTERFAZ
    public int obtenerIdUser(Object user) throws SQLException {
        int registros_afectados;
        int idUser = 0;
        String sentenciaSQL = "select id from cargo where username = ?";
        try {
           PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setString(1, (String) user);
            registros_afectados = sentencia.executeUpdate();
            return idUser;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar obtener el id de USUARIO.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
    }
    
    //mostrar cargos en tabla
    public ArrayList<User> mostrarUser() throws SQLException {
        ArrayList<User> lista = new ArrayList<>();
        String sentenciaSQL = "select * from user where estado = 'V'";
        try {
            ResultSet resultado = gestorJDBC.ejecutarConsulta(sentenciaSQL);
            while (resultado.next()) {
                User user = new User();
                user.setId(resultado.getInt("id"));
                user.setUsername(resultado.getString("username"));
                user.setPassword(resultado.getString("password"));
                user.setCargo(resultado.getInt("cargo_id"));
                user.setNombres(resultado.getString("nombres"));
                user.setApellidos(resultado.getString("apellidos"));
                lista.add(user);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar mostrar USUARIOS.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
        return lista;
    }
    
    public ArrayList<User> mostrarComboUser() throws SQLException {
        ArrayList<User> lista = new ArrayList<>();
        String sentenciaSQL = "select * from user where estado = 'V'";
        try {
            ResultSet resultado = gestorJDBC.ejecutarConsulta(sentenciaSQL);
            while (resultado.next()) {
                User user = new User();
                user.setId(resultado.getInt("id"));
                user.setUsername(resultado.getString("username"));
                user.setPassword(resultado.getString("password"));
                user.setNombres(resultado.getString("nombres"));
                user.setApellidos(resultado.getString("apellidos"));
                lista.add(user);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar mostrar USUARIOS.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
        return lista;
    }
    
}
