package McDH;

public class McDH {
    public static void main(String[] args) {

        Producto hamburguesa = new Producto("bigDH", 5.0);
        Producto papaFrita = new Producto("papa frita", 2.0);
        Producto gaseosa = new Producto("CocaCola", 1.5);
        Producto helado = new Producto("helado", 1.2);

        Combo combo1 = new Combo(0.1);
        combo1.agregarComprable(hamburguesa);
        combo1.agregarComprable(papaFrita);
        combo1.agregarComprable(gaseosa);

        Combo comboFamiliar = new Combo(0.2);
        comboFamiliar.agregarComprable(combo1);
        comboFamiliar.agregarComprable(combo1);

        Combo combo2 = new Combo(0.3);
        combo2.agregarComprable(combo1);
        combo2.agregarComprable(helado);
        combo2.agregarComprable(helado);
        combo2.agregarComprable(helado);
        combo2.agregarComprable(comboFamiliar);

        Carrito carrito = new Carrito();

        carrito.agregarComprable(combo1);
        carrito.agregarComprable(comboFamiliar);
        carrito.agregarComprable(combo2);

        System.out.println(carrito.calcularPrecioCarrito());

    }
}
