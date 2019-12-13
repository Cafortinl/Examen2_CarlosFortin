package examen2_carlosfortin;

import java.util.ArrayList;

/**
 *
 * @author Carlos Fortin
 */
public class PlayList {
    private ArrayList<Video> videos=new ArrayList();
    private int duracion;

    public PlayList() {
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "PlayList{" + "videos=" + videos + '}';
    }
    
    
}
