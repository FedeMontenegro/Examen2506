/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.List;

/**
 *
 * @author visita
 */
public class Alumno {
    
    private String nombre;
    private List<TrabajoPractico> TrabajosPracticos;
    private List<String>Respuestas;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean RealizarTrabajoPractico(TrabajoPractico TrabajoPractico, List<String>Respuestas){
        return true;
    }
    
    /**/
    public void sumarRespuestas(List<String>Respuestas){
        
        int sumaRespuestas = 0;
        Ejercicio ejercicio = null;
        
        for (int i = 0; i < Respuestas.size(); i++) {
            if (ejercicio.resueltoCorrectamente(Respuestas.get(i))) {
                sumaRespuestas += ejercicio.getPuntajeRespuestaCorrecta();
            }
        }
    }
    
    /**Fede
     */
    public List<TrabajoPractico> getTrabajosPracticos(){
        return TrabajosPracticos;
    }
    
    
}
