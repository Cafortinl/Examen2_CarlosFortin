package examen2_carlosfortin;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Carlos Fortin
 */
public class Usuario implements Serializable{
    private String nombre;
    private int edad;
    private String correo;
    private String usuario;
    private Canal canal;
    private String password;
    private ArrayList<Canal> subscripciones=new ArrayList();
    private PlayList favoritos;
    

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String correo, String usuario, Canal canal, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.usuario = usuario;
        this.canal = canal;
        this.password = password;
        this.subscripciones=new ArrayList();
        this.favoritos=new PlayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Canal> getSuscripciones() {
        return subscripciones;
    }

    public void setSubscripciones(ArrayList<Canal> suscripciones) {
        this.subscripciones = suscripciones;
    }

    public PlayList getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(PlayList favoritos) {
        this.favoritos = favoritos;
    }
    
    public void setFavorito(Video video){
        this.favoritos.getVideos().add(video);
    }

    @Override
    public String toString() {
        return usuario;
    }
    
    
}
