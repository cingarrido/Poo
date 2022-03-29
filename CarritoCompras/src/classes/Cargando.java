package classes;

import java.util.List;

public class Cargando implements EstadoCarrito {

    @Override
    public void agergar(Producto producto, List<Producto> productos) {
        productos.add(producto);
    }

    @Override
    public EstadoCarrito cancelar() {
        return new Vacio();
    }

    @Override
    public EstadoCarrito volver() {
        return new Vacio();
    }

    @Override
    public EstadoCarrito avanzar() {
        return new Pagando();
    }
}
