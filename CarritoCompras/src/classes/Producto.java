package classes;

public class Producto {
    private String descripcion;
    private float precio;

    public Producto(String descripcion, float precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return  "descripcion='" + descripcion + '\'' + ", precio=" + precio;
    }
}
