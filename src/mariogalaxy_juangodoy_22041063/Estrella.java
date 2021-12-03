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
public class Estrella {
    private double distancia;
    private String descripcion;
    private String nombre;

    public Estrella(double distancia, String descripcion, String nombre) {
        this.distancia = distancia;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estrella{" + "distancia=" + distancia + ", descripcion=" + descripcion + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
