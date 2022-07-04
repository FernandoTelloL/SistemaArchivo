
package SistemaArchivo.c4_persistencia;

import SistemaArchivo.c3_dominio.Documento;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DocumentoDAO {
    
    GestorJDBC gestorJDBC;

    public DocumentoDAO() {
    }

    public DocumentoDAO(GestorJDBC gestorJDBC) {
        this.gestorJDBC = gestorJDBC;
    }
    
    public int guardarDocumento(Documento documento) throws SQLException {
        int registros_afectados;
        String sentenciaSQL = "INSERT INTO documento\n" +
               "(num_expediente, id_area, numero_documento, fecha_creacion_documento, descripcion, created_by, tipo_documento, estado, file)\n" +
               "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setString(1, documento.getNum_expediente());
            sentencia.setInt(2, documento.getArea().getId());
            sentencia.setString(3, documento.getNumero_documento());
            sentencia.setDate(4, documento.getFecha_creacion_documento());
            sentencia.setString(5, documento.getDescripcion());
            sentencia.setInt(6, documento.getUsuario().getId());
            sentencia.setInt(7, documento.getTipo_documento().getId());
            sentencia.setString(8, documento.getEstado());
            sentencia.setString(9, documento.getFile());
            
            registros_afectados = sentencia.executeUpdate();
            return registros_afectados;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            throw new SQLException("Error al intentar guardar el Documento.\n"
                    + "Intente de nuevo o consulte con el Administrador.");
        }
    }

}
