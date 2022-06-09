package SistemaArchivo.c4_persistencia;

import java.sql.DriverManager;

public class GestorJDBCMySQL extends GestorJDBC{

    @Override
    public void abrirConexion() throws Exception{        
        Class.forName("org.gjt.mm.mysql.Driver");
        String url = "jdbc:mysql://localhost/mydb";
        conexion = DriverManager.getConnection(url, "fernando", "fernando");   
    }   
    
}
