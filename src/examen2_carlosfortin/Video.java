package examen2_carlosfortin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Fortin
 */
public class Video implements Serializable{
    private String nombre;
    private int tiempo;
    private ArrayList<Usuario> likes=new ArrayList();
    private ArrayList<Usuario> dislikes=new ArrayList();
    private ArrayList<String> comentarios=new ArrayList();
    private ArrayList<String> subtitulos=new ArrayList();

    public Video() {
    }

    public Video(String nombre){
        this.nombre=nombre;
        this.likes = new ArrayList();
        this.dislikes = new ArrayList();
        this.comentarios=new ArrayList();
    }
    
    public Video(String nombre, int tiempo, String subtitulos) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.likes = new ArrayList();
        this.dislikes = new ArrayList();
        this.comentarios=new ArrayList();
        Scanner leer=new Scanner(subtitulos);
        leer.useDelimiter(";");
        while(leer.hasNext()){
            this.subtitulos.add(leer.next());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getLikes() {
        return this.likes.size();
    }

    public void setLikes(ArrayList likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return this.dislikes.size();
    }

    public void setDislikes(ArrayList dislikes) {
        this.dislikes = dislikes;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public ArrayList<String> getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(String subtitulos) {
        Scanner leer=new Scanner(subtitulos);
        leer.useDelimiter(";");
        while(leer.hasNext()){
            this.subtitulos.add(leer.next());
        }
    }

    @Override
    public String toString() {
        return nombre+"-"+tiempo+" seg.";
    }
    
    
}
