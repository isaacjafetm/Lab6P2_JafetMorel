/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_jafetmorel;

import java.util.ArrayList;

/**
 *
 * @author 24661
 */
public class Normales extends Usuarios{
    private String hobbie;
    private ArrayList<String> interes = new ArrayList();

    public Normales() {
    }

    public Normales(String hobbie, String nombre, String apellido, String correo, String usuario, String contraseña) {
        super(nombre, apellido, correo, usuario, contraseña);
        this.hobbie = hobbie;
    }


    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public ArrayList<String> getInteres() {
        return interes;
    }

    public void setInteres(ArrayList<String> interes) {
        this.interes = interes;
    }



    @Override
    public String toString() {
        return "Normales{" + "hobbie=" + hobbie + ", interes=" + interes + '}';
    }
    
}
