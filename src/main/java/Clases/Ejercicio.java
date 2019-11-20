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
class Ejercicio {
    
    private String consigna;
    private String respuestaCorrecta;
    private float puntajeMaximo;
    
    public Ejercicio(String consigna, String respuestaCorrecta, float puntajeMaximo) {
        this.consigna = consigna;
        this.respuestaCorrecta = respuestaCorrecta;
        this.puntajeMaximo = puntajeMaximo;
    }
    
    public boolean resueltoCorrectamente(String respuesta){
        if (respuesta.equals(respuestaCorrecta)) {
            return true;
        }
        return false;
    }
    
    public float corregirEjercicio(String respuesta){
        if (respuesta.equals(respuestaCorrecta)) {
            return puntajeMaximo;
        }
        return 0;
    }

    public float getPuntajeMaximo() {
        return puntajeMaximo;
        
        
    }
    /**/
    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }
    
    
    public boolean resueltoCorrectamente(String rta){
        return this.corregirEjercicio(rta) = puntajeMaximo;
    }
}
