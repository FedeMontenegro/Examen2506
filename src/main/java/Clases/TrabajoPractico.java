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
public class TrabajoPractico {
    
    private String tema;
    protected List<Ejercicio> Ejercicios;
    private float puntajeDeAprobacion;

    public TrabajoPractico(String tema, float puntajeDeAprobacion) {
        this.tema = tema;
        this.puntajeDeAprobacion = puntajeDeAprobacion;
    }
    
    public boolean addEjercicio(Ejercicio ejercicio){
        return true;
    }
    
    public float corregirTrabajoPractico(List<String>Respuestas){
        return 0;
    }
    
    public boolean estaAprobado(List<String>Respuestas){
        
        Alumno alumno = null;
        
        if (this.esDeTema(tema)) {
            for (int i = 0; i < alumno.getTrabajosPracticos().size(); i++) {
                for (int j = 0; j < Respuestas.size(); j++) {
                    if (alumno.sumarRespuestas(Respuestas.get(i))<this.puntajeDeAprobacion) {
                        
                    }
                }
            }
        }
    }

    public String getTema() {
        return tema;
    }
    
    public String esDeTema(){
        return "";
    }

    public List<Ejercicio> getEjercicios() {
        return Ejercicios;
    }
    
    public boolean esDeTema(String tema){
        return this.tema.equals(tema);
    }
}
