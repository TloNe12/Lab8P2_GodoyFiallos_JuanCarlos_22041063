/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariogalaxy_juangodoy_22041063;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.EOFException;
/**
 *
 * @author jcgol
 */
public class Datos {

    private ArrayList<Partida> partida = new ArrayList();
    private ArrayList<Estrella> estrella = new ArrayList();
    private ArrayList<Jugador> jugador = new ArrayList();

    //Crear Partidas 
    public void crearPartida(String nombre) {
        for (int i = 0; partida.size() > i; i++) {

            if (partida.get(i).getNombre().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, "No se puede crear, ya existe");
                return;
            }
            partida.add(new Partida(nombre));
        }

    }

    public void editarPartida(String nombre) {
        for (int i = 0; i < partida.size(); i++) {
            if (partida.get(i).getNombre().equals(nombre)) {
                partida.get(i).setNombre(nombre);
                return;
            }

        }

        JOptionPane.showMessageDialog(null, "No se puedo modificar");

    }

    public void eliminarPartida(String nombre) {
        for (int i = 0; i < partida.size(); i++) {
            if (partida.get(i).getNombre().equalsIgnoreCase(nombre)) {
                partida.remove(i);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se pudo eliminar");
    }

    public void agregarJugador(double velocidad, String nombre) {
         for (int i = 0; jugador.size() > i; i++) {

            if (jugador.get(i).getNombre().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, "No se puede crear, ya existe");
                return;
            }
            jugador.add(new Jugador(velocidad,nombre));
        }
    }

    public void agregarEstrella(double distancia, String descripcion, String nombre) {
         for (int i = 0; estrella.size() > i; i++) {

            if (estrella.get(i).getNombre().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, "No se puede crear, ya existe");
                return;
            }
            estrella.add(new Estrella(distancia,descripcion,nombre));
        }
    }
    
}
