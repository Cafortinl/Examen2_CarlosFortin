package examen2_carlosfortin;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Fortin
 */
public class AdministrarUsuarios {
    private ArrayList<Usuario> usuarios=new ArrayList();
    private File archivo=null;

    public AdministrarUsuarios() {
    }
    
    public AdministrarUsuarios(String path){
        this.archivo=new File(path);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }
    
    public void cargarArchivo(){
        try{
        FileInputStream fr=null;
        ObjectInputStream br=null;
        this.usuarios=new ArrayList();
        Usuario temp;
            if(archivo.exists()){

                    fr=new FileInputStream(archivo);
                    br=new ObjectInputStream(fr);
                    try {
                        while((temp=(Usuario)br.readObject())!=null){
                            this.usuarios.add((temp));
                        }
                    } catch (EOFException e) {
                    }
                    br.close();
                    fr.close();
            }
        } catch (Exception ex) {
            Logger.getLogger(AdministrarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void escribirArchivo(){
        try {
            FileOutputStream fw=null;
            ObjectOutputStream bw=null;
            try {
                fw=new FileOutputStream(archivo);
                bw=new ObjectOutputStream(fw);
                for (Usuario p : usuarios) {
                    bw.writeObject(p);
                }
            } catch (Exception e) {
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(AdministrarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
