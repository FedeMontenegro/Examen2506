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
    private List<TrabajoPractico> trabajosPracticos;
    private List<String>respuestas;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean RealizarTrabajoPractico(TrabajoPractico trabajoPractico, List<String>respuestas){
        
        
        return true;
    }
    
    public boolean trabajoAprobado(String tema){
        
        TrabajoPractico trabajoPractico = null;
      
        for (int i = 0; i < trabajosPracticos.size(); i++) {
            
            if (trabajoPractico.esDeTema(tema)) {
                
            if (trabajoPractico.estaAprobado(respuestas)) {
                return true;
            }
        }
        }
        return false;
        
    }

}
