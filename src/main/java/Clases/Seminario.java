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
public class Seminario {
    
    private String tema;
    private List<String>temaRequisitos;

    public Seminario(String tema) {
        this.tema = tema;
    }
    
    public boolean addRequisito(String Requisito){
        return true;
    }
    
}
