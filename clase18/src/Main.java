public class Main {
    public static void main(String[] args) {
        Combo c1= new Combo("San Valentín",0.20);
        c1.agregarItem(new Producto("Papas fritas",100));
        c1.agregarItem(new Producto("Gaseosa ",150));
        c1.agregarItem(new Producto("Gaseosa ",150));

        Combo c2= new Combo("Postre x2",0.10);
        c2.agregarItem(new Producto("Dulce ",80));
        c2.agregarItem(new Producto("Caramelo ",90));

        Producto p1= new Producto("Hamburguesa", 250);

        Combo carrito= new Combo("Carrito",0);
        carrito.agregarItem(c1);
        carrito.agregarItem(c2);
        carrito.agregarItem(p1);

        System.out.println(carrito.mostrar());
    }
}
