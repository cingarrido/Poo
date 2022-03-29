public abstract class Item {
    private String nombre;

    public Item(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularPrecio();
    public abstract String mostrar();
}
