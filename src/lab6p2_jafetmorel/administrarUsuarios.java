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
public class administrarUsuarios {
    private ArrayList<Usuarios> listaUsuarios = new ArrayList();
    private File archivo = null;

    public administrarUsuarios(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Usuarios> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuarios> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public String toString() {
        return "administrarUsuarios{" + "listaUsuarios=" + listaUsuarios + ", archivo=" + archivo + '}';
    }


    //extra mutador
    public void setPersona(Usuarios u) {
        this.listaUsuarios.add(u);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuarios t : listaUsuarios) {
                bw.write(t.getUsuario() + ";");
                bw.write(t.getContraseña() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaUsuarios = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaUsuarios.add(new Usuarios(sc.next(),sc.next(),sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
