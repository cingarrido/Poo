package com.company;

public class Presupuesto implements StateArticulo {

    private Articulo articulo;

    public Presupuesto(Articulo articulo){
        this.articulo = articulo;
    }

    @Override
    public void cambiarDireccion(String direccion) {
        System.out.println("*Estado Presupuesto* - 'Método Cambiar Dirección': No se permite cambiar dirección");
    }

    @Override
    public void darValorPresupuesto(Double cantidad) {
        System.out.println("*Estado Presupuesto* - 'Método Dar Valor Presupuesto': Se agrego el presupuesto");
        this.articulo.setCosto(cantidad);
    }

    @Override
    public void agregarRepuestos(Double cantidad) {
        System.out.println("*Estado Presupuesto* - 'Método Agregar Repuestos': No se permite agregar repuestos");
    }

    @Override
    public void pasarSiguiente() {
        System.out.println("*Estado Presupuesto* - 'Método Pasar Siguiente': Se mueve al *Estado Reparación*");
        articulo.setEstado(new Reparacion(articulo));
        System.out.printf("Articulo { nombre: '%s', estado: '%s', presupuesto: '%s', dirección envió: '%s' %n",
                articulo.getNombre(), articulo.getEstado(), articulo.getCosto(), articulo.getDireccionEntrega());
    }

    @Override
    public String toString() {
        return "Presupuesto";
    }
}
