package c20.states;

/**
 *
 * @author luis-1995
 */
public class Vacio implements Estados{
    private Carrito carro;
    
    public Vacio(Carrito carro){
        this.carro = carro;
    }
    
    @Override
    public Estados pagar() {
        System.out.println("Carrito vacio, no hay nada por pagar");
        return this;
    }

    @Override
    public Estados cerrar() {
        System.out.println("No se puede cerrar porque esta vacio el carrito");
        return this;
    }

    @Override
    public Estados cargar() {
        return new Cargando(carro);
    }

    @Override
    public Estados vaciar() {
        return this;
    }

    @Override
    public void estadoSiguiente() {
        carro.setEstado(new Cargando(carro));
    }

    @Override
    public void estadoAnterior() {
        carro.setEstado(this);
    }
    
    
}
