package c20.states;

/**
 *
 * @author luis-1995
 */
public class Producto {
    private String descripcion;
    private Double precio;
    
    public Producto(String descripcion, Double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
}
