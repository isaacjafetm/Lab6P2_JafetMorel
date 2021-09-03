/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_jafetmorel;

import java.util.Date;

/**
 *
 * @author 24661
 */
public class Nest extends Notas{
    private String recor;
    private Date fechafut;
    private String descripcion;

    public Nest() {
    }

    public Nest(String recor, Date fechafut, String descripcion, String titulo, Date fecha, String prioridad) {
        super(titulo, fecha, prioridad);
        this.recor = recor;
        this.fechafut = fechafut;
        this.descripcion = descripcion;
    }

    public String getRecor() {
        return recor;
    }

    public void setRecor(String recor) {
        this.recor = recor;
    }

    public Date getFechafut() {
        return fechafut;
    }

    public void setFechafut(Date fechafut) {
        this.fechafut = fechafut;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Nest{" + "recor=" + recor + ", fechafut=" + fechafut + ", descripcion=" + descripcion + '}';
    }
    
}
