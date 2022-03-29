package c20.states;

import java.util.*;
/**
 *
 * @author luis-1995
 */

public class Carrito {
    private Estados estadoActual;
    List<Producto> productos = new ArrayList<Producto>();
    
    
    public Carrito() {
        this.estadoActual = new Vacio(this);
    }
    
    public void agregarProd(Producto prod){
        estadoActual = new Cargando(this);
        estadoActual.cargar();
        productos.add(prod);
    }
    
    public void cancelarCarrito(){
        estadoActual = new Vacio(this);
        estadoActual.vaciar();
        productos.clear();
    }
    
    public void estadoSiguiente(){
        this.estadoActual.estadoSiguiente();
    }
    
    public void estadoAnterior(){
        this.estadoActual.estadoAnterior();
    }
    
    public void setEstado(Estados estado) {
        this.estadoActual = estado;
    }
    
    public Estados getEstado(){
        return this.estadoActual;
    }
    
    public void verProductos(){
        for(Producto prod:productos){
            System.out.println(prod);
        }
    }
    
}
