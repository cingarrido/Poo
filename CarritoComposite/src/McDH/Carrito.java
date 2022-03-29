package McDH;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Comprable> comprables;

    public Carrito() {
        this.comprables = new ArrayList<>();
    }
    
    public void agregarComprable(Comprable comprable){
        this.comprables.add(comprable);
    }
    
    public Double calcularPrecioCarrito(){
        Double precioTotal = 0.0;
        for (Comprable comprable : comprables) {
            precioTotal += comprable.calcularPrecio();
        }
        return precioTotal;
    }
}
