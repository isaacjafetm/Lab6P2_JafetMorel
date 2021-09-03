/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_jafetmorel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 24661
 */
public class administrarEstudiantes {
    private ArrayList<Estudiantes> listaPersonas = new ArrayList();
    private File archivo = null;

    public administrarEstudiantes(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Estudiantes> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Estudiantes> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaPersonas;
    }

    //extra mutador
    public void setPersona(Estudiantes p) {
        this.listaPersonas.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Estudiantes t : listaPersonas) {
                bw.write(t.getCarrera() + ";");
                bw.write(t.getAño1() + ";");
                bw.write(t.getAño2()+ ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getCorreo()+";");
                bw.write(t.getUsuario()+";");
                bw.write(t.getContraseña()+";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaPersonas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaPersonas.add(new Estudiantes(sc.next(),sc.nextInt(),sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }    
}
