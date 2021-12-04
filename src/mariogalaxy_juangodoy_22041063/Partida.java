/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariogalaxy_juangodoy_22041063;

/**
 *
 * @author jcgol
 */
public class Partida {
    private Object nombre;

    public Partida(Object nombre) {
        this.nombre = nombre;
    }

    public Object getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Partida{" + "nombre=" + nombre + '}';
    }
    
    
    
}
