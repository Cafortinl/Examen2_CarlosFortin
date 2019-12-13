package examen2_carlosfortin;

import java.util.ArrayList;

/**
 *
 * @author Carlos Fortin
 */
public class Canal {
    private int no_sus;
    private String nombre;
    private String categoria;
    private int no_vid;
    private int likes;
    private ArrayList<Video> videos=new ArrayList();

    public Canal() {
    }

    public Canal(int no_sus, String nombre, String categoria, int no_vid, int likes) {
        this.no_sus = no_sus;
        this.nombre = nombre;
        this.categoria = categoria;
        this.no_vid = no_vid;
        this.likes = likes;
    }

    public int getNo_sus() {
        return no_sus;
    }

    public void setNo_sus(int no_sus) {
        this.no_sus = no_sus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNo_vid() {
        return no_vid;
    }

    public void setNo_vid(int no_vid) {
        this.no_vid = no_vid;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
