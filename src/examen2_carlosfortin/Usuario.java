package examen2_carlosfortin;

import java.util.ArrayList;

/**
 *
 * @author Carlos Fortin
 */
public class Usuario {
    private String nombre;
    private int edad;
    private String correo;
    private String usuario;
    private Canal canal;
    private String password;
    private ArrayList<Canal> suscripciones=new ArrayList();
    private ArrayList<Video> favoritos=new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String correo, String usuario, Canal canal, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.usuario = usuario;
        this.canal = canal;
        this.password = password;
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
        return suscripciones;
    }

    public void setSuscripciones(ArrayList<Canal> suscripciones) {
        this.suscripciones = suscripciones;
    }

    public ArrayList<Video> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<Video> favoritos) {
        this.favoritos = favoritos;
    }

    @Override
    public String toString() {
        return usuario;
    }
    
    
}
