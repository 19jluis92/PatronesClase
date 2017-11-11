/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbapatronobserver;

import java.util.Observable;

/**
 *
 * @author joel
 */
public class Observador implements java.util.Observer {
    private Observado modelo;
    private String nombre;
    public  void setNombre(String nom){
        nombre = nom;
    }
    
    public Observador( Observado model){
        modelo= model;
      model.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        
        System.out.println("La temperatura en " +nombre +" ha cambiado " + modelo.getF());
    }
    
}
