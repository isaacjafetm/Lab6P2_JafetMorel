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
public class Creativos extends Usuarios{
    private int edad;

    public Creativos() {
    }

    public Creativos(int edad, String nombre, String apellido, String correo) {
        super(nombre, apellido, correo);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Creativos{" + "edad=" + edad + '}';
    }
    
}
