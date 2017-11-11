/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbapatronobserver;

/**
 *
 * @author joel
 */
public class PbaPatronObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Observado o = new Observado();
          
        Observador ob = new Observador(o);
        ob.setNombre("Excel");
        Observador ob2 = new Observador(o);
        ob2.setNombre("PowerPoint ");
        Observador ob3 = new Observador(o);
        ob3.setNombre("BaseDatos ");
        Observador ob4 = new Observador(o);
        ob4.setNombre("Impresora ");
         Observador ob5 = new Observador(o);
        ob5.setNombre("JoelFlores ");
         Observador ob6 = new Observador(o);
        ob6.setNombre("Marlen ");
        System.out.println("Se tienen:"+ o.countObservers()+ " Suscriptores");
        o.setF(87);       
    }    
}

