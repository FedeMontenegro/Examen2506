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
    
    /**/
    private float puntajeRespuestaCorrecta;

    public Ejercicio(String consigna, String respuestaCorrecta, float puntajeMaximo) {
        this.consigna = consigna;
        this.respuestaCorrecta = respuestaCorrecta;
        this.puntajeMaximo = puntajeMaximo;
    }
    
    public boolean resueltoCorrectamente(String Respuesta){
        return true;
    }
    
    public float corregirEjercicio(String Respuesta){
        return 0;
    }

    public float getPuntajeMaximo() {
        return puntajeMaximo;
    }
    
    /**/
    public float getPuntajeRespuestaCorrecta() {
        return puntajeRespuestaCorrecta;
    }
    /**/
    public void setPuntajeRespuestaCorrecta(float puntajeRespuestaCorrecta) {
        this.puntajeRespuestaCorrecta = puntajeRespuestaCorrecta;
    }

    
}
