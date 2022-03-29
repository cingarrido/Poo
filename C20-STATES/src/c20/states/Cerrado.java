package c20.states;

/**
 *
 * @author luis-1995
 */
public class Cerrado implements Estados{
    private Carrito carro;
    
    public Cerrado(Carrito carro){
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
        carro.setEstado(new Vacio(carro));
    }

    @Override
    public void estadoAnterior() {
        carro.setEstado(this);
    }
    
}
