
package observador;

import java.util.Observable;
import java.util.Observer;


public class Producto extends Observable {
    private String nombre;
    private String descripcion;
    private float precio;
    private int stock;
    
    
    //observador
    private Observer observer;

    public Producto() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
        notifyObservers();
    }

    public Observer getObserver() {
        return observer;
    }

    public void setObserver(Observer observer) {
        this.observer = observer;
    }
    
    //metodo que permite añadir observadores de esta clase
    @Override
    public void addObserver(Observer observer){
        this.observer = observer;
    }
    
    //Metodo que notifica os cambios a los observadores de esta clase
    @Override
    public void notifyObservers(){
        if(observer != null){
            //se pasa como parametro la clase observable
            observer.update(this, "stock");
        }
    }
    
}
