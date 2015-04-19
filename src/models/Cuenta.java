
package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cuenta implements Serializable{
    private String nombre;
    private String password;
    
    private List<Personaje> personajes;

    public Cuenta(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
        this.personajes= new ArrayList<>();
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
 
    
}
