package c20.states;
/**
 *
 * @author luis-1995
 */

public class C20STATES {
    public static void main(String[] args) {
        
        Producto cerveza = new Producto("club colombia", 12500.0);
        Producto mani = new Producto("mani moto", 1500.0);
        Producto vodka = new Producto("absolut", 75000.0);
        Producto cafe = new Producto("Aguila roja", 5000.0);
        
        
        Carrito d1 = new Carrito();
        // Inicia vacio el carrito porque aun no le he agregado un producto y asi se programó
        System.out.println(d1.getEstado());
        
        d1.agregarProd(cerveza);
        d1.agregarProd(mani);
        d1.agregarProd(vodka);
        d1.agregarProd(cafe);
        // Ahora se encuentra en estado Cargando, porque el metodo agregar producto lo lleva a ese estado
        System.out.println(d1.getEstado());
        
        // Pasando de estad cargando a pagando
        d1.estadoSiguiente();
        System.out.println(d1.getEstado());
        
        // Pasando de estado pagando a cerrado
        d1.estadoSiguiente();
        System.out.println(d1.getEstado());
        
        // Intentando devolver al estado pagando, pero como ya esta en cerrado, no se puede devolver y se queda en el mismo estado (Cerrado)
        d1.estadoAnterior();
        System.out.println(d1.getEstado());
        
        // Pasando a estado vacio desde el estado cerrado
        d1.estadoSiguiente();
        System.out.println(d1.getEstado());
        
        d1.estadoSiguiente();
        System.out.println(d1.getEstado());
        
        System.out.println("\nProductos en el carrito:");
        // Imprime los productos almacenados en carrito
        d1.verProductos();
        
        System.out.println("\nEliminando productos de carrito.... ");
        d1.cancelarCarrito();
        d1.verProductos();
        
        System.out.println(d1.getEstado());
    }
    
}
