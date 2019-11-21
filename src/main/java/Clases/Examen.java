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
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Ejercicio e1 = new Ejercicio("ejercicio1", "respuesta1", 4);
        Ejercicio e2 = new Ejercicio("ejercicio2", "respuesta2", 3);
        Ejercicio e3 = new Ejercicio("ejercicio3", "respuesta3", 2);
        Ejercicio e4 = new Ejercicio("ejercicio4", "respuesta4", 1);
        Ejercicio e5 = new Ejercicio("ejercicio5", "respuesta5", 4);
        
        TrabajoPractico tp1 = new TrabajoPractico("geografia economica", 4);
        TrabajoPractico tp2 = new TrabajoPractico("geografia politica", 6);
        
        tp1.addEjercicio(e1);
        tp1.addEjercicio(e2);
        tp1.addEjercicio(e3);
        
        tp2.addEjercicio(e3);
        tp2.addEjercicio(e4);
        tp2.addEjercicio(e5);
        
        tp1.addEjercicio(e4);
        
        System.out.println(tp1);
        System.out.println(tp2);
        
        
    }
    
}
