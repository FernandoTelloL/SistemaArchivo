package SistemaArchivo.c4_persistencia;

import config.Utils;
import java.sql.DriverManager;

public class GestorJDBCMySQL extends GestorJDBC{
    
    Utils util = new Utils();

    @Override
    public void abrirConexion() throws Exception{        
        util.loadConfig();
        Class.forName("org.gjt.mm.mysql.Driver");
        String url = "jdbc:mysql://localhost/mydb";
        conexion = DriverManager.getConnection(url, util.getProperty("user").toString(), util.getProperty("pass").toString());   
    }   
    
}
