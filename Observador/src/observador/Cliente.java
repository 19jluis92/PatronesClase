/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;


public class Cliente implements Observer{
    private String codigo;
    private String nombre;
    private String apellidos;
    private String email;
    private Date fechaNacimiento;

    public Cliente() {
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //metodo que se ejecuta cuando se producen cambios en la clase observada 
    public void  update(Observable o, Object arg){
        if(((String)arg).equals("stock")){
            System.out.println("El cliente " + nombre +" ha sido notificado  de un cambio en el stock");
        }
    }
    
}
