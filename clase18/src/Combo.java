import java.util.ArrayList;

public class Combo extends Item{
    private ArrayList<Item> items;
    private double descuento;

    public Combo(String nombre, double descuento) {
        super(nombre);
        items= new ArrayList<>();
        this.descuento = descuento;
    }

    public void agregarItem(Item i){
        items.add(i);
    }

    @Override
    public double calcularPrecio() {
        double totalPrecio=0;
        for (Item unItem:items) {
            totalPrecio+=unItem.calcularPrecio();
        }
        return totalPrecio-totalPrecio*descuento;
    }

    @Override
    public String mostrar() {
        String elTexto= getNombre()+"---> Precio del combo: "+calcularPrecio()+"\n";
        elTexto=elTexto.concat("------------------\n");
        for (Item unItem:items) {
            elTexto=elTexto.concat(unItem.mostrar());
        }
        elTexto=elTexto.concat("------------------\n");
        return elTexto;
    }
}
