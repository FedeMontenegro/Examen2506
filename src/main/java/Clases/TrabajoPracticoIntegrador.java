/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author visita
 */
public class TrabajoPracticoIntegrador extends TrabajoPractico {
    
    private float puntajeMinimoPorEjercicio;

    public TrabajoPracticoIntegrador(String tema, float puntajeDeAprobacion, float puntajeMinimoPorEjercicio) {
        super(tema, puntajeDeAprobacion);
        this.puntajeMinimoPorEjercicio = puntajeMinimoPorEjercicio;
    }

    public boolean addEjercicio(Ejercicio ejercicio){
        
        if (ejercicio.getPuntajeMaximo()<this.puntajeMinimoPorEjercicio) {
            return false;
        }
            super.Ejercicios.add(ejercicio);
            return true;
    }

    public float getPuntajeMinimoPorEjercicio() {
        return puntajeMinimoPorEjercicio;
    }

    public void setPuntajeMinimoPorEjercicio(float puntajeMinimoPorEjercicio) {
        this.puntajeMinimoPorEjercicio = puntajeMinimoPorEjercicio;
    }
    
    
    
}
