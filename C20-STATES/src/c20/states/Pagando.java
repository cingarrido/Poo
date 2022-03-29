package c20.states;

/**
 *
 * @author luis-1995
 */
public class Pagando implements Estados{
    private Carrito carro;
    
    public Pagando(Carrito carro){
        this.carro = carro;
    }
    
    @Override
    public Estados pagar() {
        return this;
    }

    @Override
    public Estados cerrar() {
        return this;
    }

    @Override
    public Estados cargar() {
        return this;
    }

    @Override
    public Estados vaciar() {
        return this;
    }

    @Override
    public void estadoSiguiente() {
        carro.setEstado(new Cerrado(carro));
    }

    @Override
    public void estadoAnterior() {
        carro.setEstado(new Cargando(carro));
    }
    
}
