
package SistemaArchivo.c4_persistencia;

import SistemaArchivo.c3_dominio.Area;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AreaDAO {
    GestorJDBC gestorJDBC;
    
    public AreaDAO(GestorJDBC gestorJDBC) {
        this.gestorJDBC = gestorJDBC;
    }
    
    public int guardarArea(Area area) throws SQLException {
        int registros_afectados;
        String sentenciaSQL = "INSERT INTO area (nombre_area) VALUES (?)";
        try {
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setString(1, area.getNombre_area());
            registros_afectados = sentencia.executeUpdate();
            return registros_afectados;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar guardar el área.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
    }
    
     public int eliminarArea(int areaId) throws SQLException {
        int registros_afectados;
        String sentenciaSQL = "update area set estado='E' where id = ?";
        try {
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setInt(1, areaId);
            registros_afectados = sentencia.executeUpdate();
            return registros_afectados;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar eliminar el ÁREA.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
    }
     
     public int actualizarArea(Area area) throws SQLException {
        int registros_afectados;
        String sentenciaSQL = "update area set nombre_area=? where id=?";
        try {
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setString(1, area.getNombre_area());
            sentencia.setInt(2, area.getId());
            registros_afectados = sentencia.executeUpdate();
            return registros_afectados;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar actualizar el ÁREA.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
    }
     
     //mostrar cargos en tabla
    public ArrayList<Area> mostrarArea() throws SQLException {
        ArrayList<Area> lista = new ArrayList<>();
        String sentenciaSQL = "select * from area where estado = 'V'";
        try {
            ResultSet resultado = gestorJDBC.ejecutarConsulta(sentenciaSQL);
            while (resultado.next()) {
                Area area = new Area();
                area.setId(resultado.getInt("id"));
                area.setNombre_area(resultado.getString("nombre_area"));
                lista.add(area);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar mostrar ÁREA.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
        return lista;
    }
    
     
     //ESTE METODO FALTA IMPLEMENTAR EN LA INTERFAZ
       public int obtenerIdArea(Object area) throws SQLException {
        int registros_afectados;
        int idArea = 0;
        String sentenciaSQL = "select id from area where nombre_area=?";
        try {
           PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setString(1, (String) area);
            registros_afectados = sentencia.executeUpdate();
            return idArea;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar obtener el id de ÁREA.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
    }
}
