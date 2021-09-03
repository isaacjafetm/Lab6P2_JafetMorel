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
public class administrarEjecutivos {
    private ArrayList<Ejecutivos> listaPersonas = new ArrayList();
    private File archivo = null;

    public administrarEjecutivos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Ejecutivos> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Ejecutivos> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaPersonas;
    }

    //extra mutador
    public void setPersona(Ejecutivos p) {
        this.listaPersonas.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Ejecutivos t : listaPersonas) {
                bw.write(t.getCargo() + ";");
                bw.write(t.getEmpresa() + ";");
                bw.write(t.getTitun()+ ";");
                bw.write(t.getTitma()+ ";");
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
                    listaPersonas.add(new Ejecutivos(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }      
}
