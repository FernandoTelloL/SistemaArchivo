package SistemaArchivo.c4_persistencia;

import SistemaArchivo.c1_presentacion.FormLogin;
import SistemaArchivo.c3_dominio.Cargo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CargoDAO {

    GestorJDBC gestorJDBC;

    public CargoDAO() {
    }

    public CargoDAO(GestorJDBC gestorJDBC) {
        this.gestorJDBC = gestorJDBC;
    }

    public int guardarCargo(Cargo cargo) throws SQLException {
        int registros_afectados;
        String sentenciaSQL = "INSERT INTO cargo (cargo,descripcion) VALUES (?,?)";
        try {
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setString(1, cargo.getCargo());
            sentencia.setString(2, cargo.getDescripcion());
            registros_afectados = sentencia.executeUpdate();
            return registros_afectados;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar guardar el cargo.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
    }

    public int actualizarCargo(Cargo cargo) throws SQLException {
        int registros_afectados;
        String sentenciaSQL = "update cargo set cargo=?, descripcion=? where id = ?";
        try {
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setInt(3, cargo.getId());
            sentencia.setString(1, cargo.getCargo());
            sentencia.setString(2, cargo.getDescripcion());
            registros_afectados = sentencia.executeUpdate();
            return registros_afectados;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar actualizar el cargo.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
    }

    public int eliminarCargo(int cargoId) throws SQLException {
        int registros_afectados;
        String sentenciaSQL = "update cargo set estado='E' where id = ?";
        try {
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setInt(1, cargoId);
            registros_afectados = sentencia.executeUpdate();
            return registros_afectados;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar eliminar el cargo.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
    }

    //mostrar cargos en tabla
    public ArrayList<Cargo> mostrarCargo() throws SQLException {
        ArrayList<Cargo> lista = new ArrayList<>();
        String sentenciaSQL = "select * from cargo where estado = 'V'";
        try {
            ResultSet resultado = gestorJDBC.ejecutarConsulta(sentenciaSQL);
            while (resultado.next()) {
                Cargo cargo = new Cargo();
                cargo.setId(resultado.getInt("id"));
                cargo.setCargo(resultado.getString("cargo"));
                cargo.setDescripcion(resultado.getString("descripcion"));
                lista.add(cargo);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar mostrar Cargos.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
        return lista;
    }

    public int obtenerIdCargo(String nombreCargo) throws SQLException {
        int registros_afectados;
        int idCargo = 0;
        String sentenciaSQL = "select id from cargo where cargo = ?";
        try {
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setString(1, nombreCargo);
            registros_afectados = sentencia.executeUpdate();
            return registros_afectados;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar obtener el id de cargo.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
    }

    public String obtenerNombreCargo(int id) throws SQLException {
        int registros_afectados;
        //int idCargo = 0;
        String nombreCargo = null;
        String sentenciaSQL = "select cargo from cargo where id= ?";
        try {
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setInt(1, id);
            registros_afectados = sentencia.executeUpdate();
            return nombreCargo;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar obtener el id de cargo.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
    }

    public Cargo findById(int id) {
        
        Cargo cargo = null;
        String sql = "select * from cargo where id = "+id+" ";

        try {                        
            ResultSet result = gestorJDBC.ejecutarConsulta(sql);
            
            if (result.next()) {
                cargo = new Cargo();
                cargo.setId(result.getInt("id"));
                cargo.setCargo(result.getString("cargo"));
                cargo.setDescripcion(result.getString("descripcion"));
            }                        
        } catch (SQLException e) {
            Logger.getLogger(CargoDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return cargo;
    }
}
