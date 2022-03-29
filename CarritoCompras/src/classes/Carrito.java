package classes;

import exceptions.EstadoErroneoException;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos = new ArrayList<>();
    private EstadoCarrito estado;

    public Carrito() {
        this.estado = new Vacio();
    }

    public void agregar(Producto producto) throws EstadoErroneoException {
        this.estado.agergar(producto,productos);
    }

    public void cancelar() throws EstadoErroneoException {
        this.productos = new ArrayList<>();
        this.estado = this.estado.cancelar();
    }

    public void volver() throws EstadoErroneoException {
        this.estado = this.estado.volver();
    }

    public void avanzar() throws EstadoErroneoException {
        this.estado = this.estado.avanzar();
    }

    public void mostrarProductos() {
        for(Producto p : this.productos) {
            System.out.println(p.toString());
            System.out.println("----------");
        }
    }
}
