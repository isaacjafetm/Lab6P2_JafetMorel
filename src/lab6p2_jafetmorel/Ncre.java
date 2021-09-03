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
public class Ncre extends Notas{
    private String categorias, descripcion, publico;

    public Ncre() {
    }

    public Ncre(String categorias, String descripcion, String publico, String titulo, Date fecha, String prioridad) {
        super(titulo, fecha, prioridad);
        this.categorias = categorias;
        this.descripcion = descripcion;
        this.publico = publico;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }

    @Override
    public String toString() {
        return "Ncre{" + "categorias=" + categorias + ", descripcion=" + descripcion + ", publico=" + publico + '}';
    }
    
}
