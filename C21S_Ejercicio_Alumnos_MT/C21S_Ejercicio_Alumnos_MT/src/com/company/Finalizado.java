package com.company;

public class Finalizado implements StateArticulo {

    private Articulo articulo;

    public Finalizado(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public void cambiarDireccion(String direccion) {
        System.out.println("*Estado Finalizado* - 'Método Cambiar Dirección': No se permite cambiar dirección");
    }

    @Override
    public void darValorPresupuesto(Double cantidad) {
        System.out.println("*Estado Finalizado* - 'Método Dar Valor Presupuesto': No se permite agregar el presupuesto");
    }

    @Override
    public void agregarRepuestos(Double cantidad) {
        System.out.println("*Estado Finalizado* - 'Método Agregar Repuestos': No se permite agregar el valor de los repuestos");
        articulo.setCosto(articulo.getCosto() + cantidad);
    }

    @Override
    public void pasarSiguiente() {
        System.out.println("*Estado Finalizado* - 'Método Pasar Siguiente': Se mueve al *Estado Finalizado*");
        articulo.setEstado(this);
        System.out.printf("Articulo { nombre: '%s', estado: '%s', presupuesto: '%s', dirección envió: '%s' %n",
                articulo.getNombre(), articulo.getEstado(), articulo.getCosto(), articulo.getDireccionEntrega());
    }

    @Override
    public String toString() {
        return "Finalizado";
    }
}
