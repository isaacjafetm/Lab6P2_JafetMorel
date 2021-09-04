/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_jafetmorel;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 24661
 */
public class Notas {
    private String titulo;
    private Date fecha;
    private String prioridad;
    private ArrayList<String> etiquetas = new ArrayList();

    public Notas() {
    }

    public Notas(String titulo, Date fecha, String prioridad) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public ArrayList<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(ArrayList<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    @Override
    public String toString() {
        return "Notas{" + "titulo=" + titulo + ", fecha=" + fecha + ", prioridad=" + prioridad + ", etiquetas=" + etiquetas + '}';
    }
    
}
