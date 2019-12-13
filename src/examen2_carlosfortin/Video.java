package examen2_carlosfortin;

import java.util.ArrayList;

/**
 *
 * @author Carlos Fortin
 */
public class Video {
    private String nombre;
    private int tiempo;
    private int likes;
    private int dislikes;
    private ArrayList<String> comentarios=new ArrayList();
    private ArrayList<String> subtitulos=new ArrayList();

    public Video() {
    }

    public Video(String nombre, int tiempo, int likes, int dislikes) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.likes = likes;
        this.dislikes = dislikes;
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
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
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

    public void setSubtitulos(ArrayList<String> subtitulos) {
        this.subtitulos = subtitulos;
    }

    @Override
    public String toString() {
        return "Video{" + "nombre=" + nombre + ", tiempo=" + tiempo + '}';
    }
    
    
}
