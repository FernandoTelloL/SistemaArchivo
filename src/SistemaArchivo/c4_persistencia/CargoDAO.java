package SistemaArchivo.c4_persistencia;

import SistemaArchivo.c3_dominio.Cargo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CargoDAO {
    
    GestorJDBC gestorJDBC;
    
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

}
