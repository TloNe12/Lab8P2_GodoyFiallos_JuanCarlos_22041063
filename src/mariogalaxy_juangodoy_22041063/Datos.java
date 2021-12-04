/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariogalaxy_juangodoy_22041063;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.EOFException;
import javax.swing.JProgressBar;
/**
 *
 * @author jcgol
 */
public class Datos extends Thread{

    private ArrayList<Partida> partida = new ArrayList();
    private ArrayList<Estrella> estrella = new ArrayList();
    private ArrayList<Jugador> jugador = new ArrayList();

    //Crear Partidas 
    public void crearPartida(Object nombre) {
        for (int i = 0; partida.size() > i; i++) {

            if (partida.get(i).getNombre().equals(nombre)) {
                JOptionPane.showMessageDialog(null, "No se puede crear, ya existe");
                return;
            }
            partida.add(new Partida(nombre));
        }

    }

    public void editarPartida(Object nombre) {
        for (int i = 0; i < partida.size(); i++) {
            if (partida.get(i).getNombre().equals(nombre)) {
                partida.get(i).setNombre(nombre.toString());
                return;
            }

        }

        JOptionPane.showMessageDialog(null, "No se puedo modificar");

    }

    public void eliminarPartida(Object nombre) {
        for (int i = 0; i < partida.size(); i++) {
            if (partida.get(i).getNombre().equals(nombre)) {
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
    
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;

    public Datos(JProgressBar barra) {
        this.barra = barra;
        avanzar=true;
        vive=true;
    }
    
    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }


    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }


    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    @Override
    public void run(){
        while(vive){
            if(avanzar){
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==100000000){
                    vive=false;
                }                
            } //FIN IF
            
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }
}
