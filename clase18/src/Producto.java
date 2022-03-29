public class Producto extends Item{
    private double precio;

    public Producto(String nombre, double precio) {
        super(nombre);
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public String mostrar() {
        return getNombre()+" ---> "+calcularPrecio()+"\n";
    }
}
