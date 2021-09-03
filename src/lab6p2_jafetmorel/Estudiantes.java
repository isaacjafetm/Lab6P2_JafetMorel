/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_jafetmorel;

/**
 *
 * @author 24661
 */
public class Estudiantes extends Usuarios{
    private String carrera;
    private int año1, año2;

    public Estudiantes() {
    }

    public Estudiantes(String carrera, int año1, int año2, String nombre, String apellido, String correo) {
        super(nombre, apellido, correo);
        this.carrera = carrera;
        this.año1 = año1;
        this.año2 = año2;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAño1() {
        return año1;
    }

    public void setAño1(int año1) {
        this.año1 = año1;
    }

    public int getAño2() {
        return año2;
    }

    public void setAño2(int año2) {
        this.año2 = año2;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "carrera=" + carrera + ", a\u00f1o1=" + año1 + ", a\u00f1o2=" + año2 + '}';
    }
    
}
