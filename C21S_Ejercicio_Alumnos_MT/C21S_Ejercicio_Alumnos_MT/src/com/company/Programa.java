package com.company;

public class Programa {
    public static void main(String[] args) {

        Articulo articulo = new Articulo("Batidora", "Argentina");

        articulo.getEstado().darValorPresupuesto(1000d);
        articulo.getEstado().pasarSiguiente();
        articulo.getEstado().agregarRepuestos(1200d);
        articulo.getEstado().pasarSiguiente();
        articulo.getEstado().cambiarDireccion("Colombia");
        articulo.getEstado().pasarSiguiente();
    }
}
