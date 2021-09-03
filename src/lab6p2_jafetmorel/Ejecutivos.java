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
public class Ejecutivos extends Usuarios{
    private String cargo, empresa, titun, titma;

    public Ejecutivos() {
    }

    public Ejecutivos(String cargo, String empresa, String titun, String titma, String nombre, String apellido, String correo) {
        super(nombre, apellido, correo);
        this.cargo = cargo;
        this.empresa = empresa;
        this.titun = titun;
        this.titma = titma;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTitun() {
        return titun;
    }

    public void setTitun(String titun) {
        this.titun = titun;
    }

    public String getTitma() {
        return titma;
    }

    public void setTitma(String titma) {
        this.titma = titma;
    }

    @Override
    public String toString() {
        return "Ejecutivos{" + "cargo=" + cargo + ", empresa=" + empresa + ", titun=" + titun + ", titma=" + titma + '}';
    }
    
}
