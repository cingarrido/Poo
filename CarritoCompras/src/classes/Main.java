package classes;

import exceptions.EstadoErroneoException;

public class Main {
    public static void main(String[] args) throws Exception {

        //Instancio variables
        Carrito carrito = new Carrito(); // -> empieza en estado vacio
        Producto mesa = new Producto("Mesa", 200);
        Producto tele = new Producto("Tele", 500);
        Producto silla = new Producto("Silla", 50);

        //carrito.agregar(mesa);

        carrito.avanzar();

        //Esta en estado cargando
        carrito.agregar(mesa);
        carrito.agregar(tele);
        carrito.agregar(silla);

        carrito.mostrarProductos();

        carrito.avanzar();

        //Pagando

        carrito.avanzar();

        //Cerrado

        carrito.cancelar(); // -> vuelve a el estado vacio
    }
}
