/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaArchivo.c3_dominio;

import java.sql.Date;



/**
 *
 * @author Ricardo
 */
public class Documento{

    private int id;
    private String num_expediente;
    private Area area;
    private Date fecha_registro_archivo;
    private String numero_documento;
    private Date fecha_creacion_documento;
    private String descripcion;
    private User usuario;
    private TipoDocumento tipo_documento;
    private String estado;
    private String file;

    public Documento() {
    }

    public Documento(String num_expediente, Area area,String numero_documento, Date fecha_creacion_documento, String descripcion, User usuario, TipoDocumento tipo_documento, String estado, String file) {        
        this.num_expediente = num_expediente;
        this.area = area;        
        this.numero_documento = numero_documento;
        this.fecha_creacion_documento = fecha_creacion_documento;
        this.descripcion = descripcion;
        this.usuario = usuario;
        this.tipo_documento = tipo_documento;
        this.estado = estado;
        this.file = file;
    }        

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum_expediente() {
        return num_expediente;
    }

    public void setNum_expediente(String num_expediente) {
        this.num_expediente = num_expediente;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
    
    
    public Date getFecha_registro_archivo() {
        return fecha_registro_archivo;
    }

    public void setFecha_registro_archivo(Date fecha_registro_archivo) {
        this.fecha_registro_archivo = fecha_registro_archivo;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public Date getFecha_creacion_documento() {
        return fecha_creacion_documento;
    }

    public void setFecha_creacion_documento(Date fecha_creacion_documento) {
        this.fecha_creacion_documento = fecha_creacion_documento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }    

    public TipoDocumento getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(TipoDocumento tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
    
    
    

}
