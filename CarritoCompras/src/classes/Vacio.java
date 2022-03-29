package classes;

import exceptions.EstadoErroneoException;

import java.util.List;

public class Vacio implements EstadoCarrito {

    @Override
    public void agergar(Producto producto, List<Producto> productos) throws EstadoErroneoException {
        throw new EstadoErroneoException("No puede agregar en el estado Vacio");
    }

    @Override
    public EstadoCarrito cancelar() throws EstadoErroneoException {
        throw new EstadoErroneoException("No puede vaciar en el estado Vacio");
    }

    @Override
    public EstadoCarrito volver() throws EstadoErroneoException {
        throw new EstadoErroneoException("No puede volver en el estado vacio");
    }

    @Override
    public EstadoCarrito avanzar() {
        return new Cargando();
    }
}
