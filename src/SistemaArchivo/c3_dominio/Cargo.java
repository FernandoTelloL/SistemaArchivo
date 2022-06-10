
package SistemaArchivo.c3_dominio;

public class Cargo {

    private int id;
    private String cargo;
    private String descripcion;
    
    public Cargo(){
        
    }
    
    public Cargo(int id, String cargo, String descripcion) {
        this.id = id;
        this.cargo = cargo;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String toString() {
        return cargo; 
    }
    
}
