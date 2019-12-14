package examen2_carlosfortin;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Carlos Fortin
 */
public class Canal implements Serializable{
    private int no_sus;
    private String nombre;
    private String categoria;
    private int no_vid;
    private int likes;
    private ArrayList<Video> videos=new ArrayList();

    public Canal() {
    }

    public Canal(String nombre, String categoria) {
        this.no_sus = 0;
        this.nombre = nombre;
        this.categoria = categoria;
        this.no_vid = 0;
        this.likes = 0;
        this.videos=new ArrayList();
    }

    public int getNo_sus() {
        return no_sus;
    }

    public void addNo_sus(){
        this.no_sus++;
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
