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
public class Normales extends Usuarios{
    private String hobbie, interes;

    public Normales() {
    }

    public Normales(String hobbie, String interes, String nombre, String apellido, String correo) {
        super(nombre, apellido, correo);
        this.hobbie = hobbie;
        this.interes = interes;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Normales{" + "hobbie=" + hobbie + ", interes=" + interes + '}';
    }
    
}
