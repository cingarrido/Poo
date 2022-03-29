package McDH;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable{

    private List<Comprable> comprables;
    private Double descuento;

    public Combo(Double descuento) {
        this.comprables = new ArrayList<>();
        this.descuento = descuento;
    }

    public void agregarComprable(Comprable comprables){
        this.comprables.add(comprables);
    }

    public String verCombo(){
        String lista = "";
        for (Comprable comprable : comprables) {
            lista += comprable.toString();
        }
        return lista;
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        System.out.println("estoy recorriendo un combo");
        for (Comprable comprable : comprables) {
            precioTotal += comprable.calcularPrecio();
        }
        Double valor = precioTotal - (precioTotal*descuento);
        System.out.println("termine de recorrer el combo, el precio final es " + valor);
        return valor;
    }
}
