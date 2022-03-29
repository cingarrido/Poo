package c20.states;

/**
 *
 * @author luis-1995
 */
public class Cargando implements Estados{
    private Carrito carro;
    
    public Cargando(Carrito carro){
        this.carro = carro;
    }
    
    @Override
    public Estados pagar() {
        return new Pagando(carro);
    }

    @Override
    public Estados cerrar() {
        return new Cerrado(carro);
    }

    @Override
    public Estados cargar() {
        System.out.println("Llenando el carrito");
        return this;
    }

    @Override
    public Estados vaciar() {
        return new Vacio(carro);
    }

    @Override
    public void estadoSiguiente() {
        carro.setEstado(new Pagando(carro));
    }

    @Override
    public void estadoAnterior() {
        carro.setEstado(new Vacio(carro));
    }

}
