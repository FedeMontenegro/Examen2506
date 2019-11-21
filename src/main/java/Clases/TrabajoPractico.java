/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author visita
 */
public class TrabajoPractico {
    
    private String tema;
    protected List<Ejercicio> ejercicios;
    private float puntajeDeAprobacion;
    

    public TrabajoPractico(String tema, float puntajeDeAprobacion) {
        this.tema = tema;
        this.puntajeDeAprobacion = puntajeDeAprobacion;
        ejercicios = new ArrayList<>();
    }
    
    public boolean addEjercicio(Ejercicio ejercicio){
        
        ejercicios.add(ejercicio);
        return true;
    }
    
    public float corregirTrabajoPractico(List<String>respuestas){
        
        Ejercicio ejercicio = null;
        int puntaje = 0;
        
        for (int i = 0; i < respuestas.size(); i++) {
            //ejercicio.corregirEjercicio(respuestas.get(i));
            puntaje += ejercicio.corregirEjercicio(respuestas.get(i));
        }
        return puntaje;
    }
    
    public boolean estaAprobado(List<String>respuestas){
        
        if (corregirTrabajoPractico(respuestas)>= this.puntajeDeAprobacion) {
            return true;
        }
        return false;
        
    }

    public String getTema() {
        return tema;
    }
    
    public String esDeTema(){
        return "";
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }
    
    public boolean esDeTema(String tema){
        return this.tema.equals(tema);
    }

    @Override
    public String toString() {
        String resultado = "";
        Iterator <Ejercicio> it = ejercicios.iterator();
        while(it.hasNext()){
            Ejercicio e = it.next();
            resultado += e.toString() + " ";
        }
        return resultado;
    }
    
    
    

 }
