
package SistemaArchivo.c4_persistencia;

import SistemaArchivo.c3_dominio.TipoDocumento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TipoDocumentoDAO {
    GestorJDBC gestorJDBC;
    
    public TipoDocumentoDAO(GestorJDBC gestorJDBC) {
        this.gestorJDBC = gestorJDBC;
    }
    
    public int guardarArea(TipoDocumento tipoDocumento) throws SQLException {
        int registros_afectados;
        String sentenciaSQL = "INSERT INTO tipo_documento (nombre) VALUES (?)";
        try {
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setString(1, tipoDocumento.getNombre());
            registros_afectados = sentencia.executeUpdate();
            return registros_afectados;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar guardar el TIPO DOCUMENTO.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
    }
    
      public int eliminarTipoDocumento(int tipoDocumentoId) throws SQLException {
        int registros_afectados;
        String sentenciaSQL = "update tipo_documento set estado='E' where id = ?";
        try {
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setInt(1, tipoDocumentoId);
            registros_afectados = sentencia.executeUpdate();
            return registros_afectados;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar eliminar el TIPO DOCUMENTO.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
    }
      
       public int actualizarTipoDocumento(TipoDocumento tipoDocumento) throws SQLException {
        int registros_afectados;
        String sentenciaSQL = "update tipo_documento set nombre=? where id=?";
        try {
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setString(1, tipoDocumento.getNombre());
            sentencia.setInt(2, tipoDocumento.getId());
            registros_afectados = sentencia.executeUpdate();
            return registros_afectados;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar actualizar el TIPO DOCUMENTO.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
    }
       
    //mostrar cargos en tabla
    public ArrayList<TipoDocumento> mostrarTipoDocumento() throws SQLException {
        ArrayList<TipoDocumento> lista = new ArrayList<>();
        String sentenciaSQL = "select * from tipo_documento where estado = 'V'";
        try {
            ResultSet resultado = gestorJDBC.ejecutarConsulta(sentenciaSQL);
            while (resultado.next()) {
                TipoDocumento tipoDocumento = new TipoDocumento();
                tipoDocumento.setId(resultado.getInt("id"));
                tipoDocumento.setNombre(resultado.getString("nombre"));
                lista.add(tipoDocumento);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar mostrar TIPO DOCUMENTO.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
        return lista;
    }
    
    //ESTE METODO FALTA IMPLEMENTAR EN LA INTERFAZ
       public int obtenerIdTipoDocumento(Object tipoDocumento) throws SQLException {
        int registros_afectados;
        int idTipoDocumento = 0;
        String sentenciaSQL = "select id from tipo_documento where nombre=?";
        try {
           PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setString(1, (String) tipoDocumento);
            registros_afectados = sentencia.executeUpdate();
            return idTipoDocumento;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException("Error al intentar obtener el id de TIPO DOCUMENTO.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
    }
}
