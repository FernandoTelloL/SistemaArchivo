package config;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Utils {

    Properties config = new Properties();
    InputStream configInput = null;
    String filename = "config.properties";

    public void loadConfig() {
        try {
            File file = new File("./src/config/" + filename);
            if (file.exists()) {
                configInput = new FileInputStream(file);
                config.load(configInput);                
            }else{
                JOptionPane.showMessageDialog(null, "El archivo properties no existe");
            }
        } catch (IOException e) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public Object getProperty(String key){
        return config.getProperty(key);
    }

}
