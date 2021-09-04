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
public class Neje extends Notas{
    private String reun;
    private ArrayList<String>  invitados = new ArrayList();
    private String asunto, descripcion;

    public Neje() {
    }

    public Neje(String reun, String asunto, String descripcion, String titulo, Date fecha, String prioridad) {
        super(titulo, fecha, prioridad);
        this.reun = reun;
        this.asunto = asunto;
        this.descripcion = descripcion;
    }

    public String getReun() {
        return reun;
    }

    public void setReun(String reun) {
        this.reun = reun;
    }

    public ArrayList<String> getInvitados() {
        return invitados;
    }

    public void setInvitados(ArrayList<String> invitados) {
        this.invitados = invitados;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return super.toString()+"Neje{" + "reun=" + reun + ", invitados=" + invitados + ", asunto=" + asunto + ", descripcion=" + descripcion + '}';
    }
    
}
