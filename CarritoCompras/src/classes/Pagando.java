package classes;

import exceptions.EstadoErroneoException;

import java.util.List;

public class Pagando implements EstadoCarrito {

    @Override
    public void agergar(Producto producto, List<Producto> productos) throws EstadoErroneoException {
        throw new EstadoErroneoException("No se puede agregar en el estado Pagando");
    }

    @Override
    public EstadoCarrito cancelar() {
        return new Vacio();
    }

    @Override
    public EstadoCarrito volver() {
        return new Cargando();
    }

    @Override
    public EstadoCarrito avanzar() {
        return new Cerrado();
    }
}
