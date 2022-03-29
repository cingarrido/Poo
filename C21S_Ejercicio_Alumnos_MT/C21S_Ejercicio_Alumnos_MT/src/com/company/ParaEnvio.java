package com.company;

public class ParaEnvio implements StateArticulo {

    private Articulo articulo;

    public ParaEnvio(Articulo articulo){
        this.articulo = articulo;
    }

    @Override
    public void cambiarDireccion(String direccion) {
        System.out.println("*Estado Para Envío* - 'Método Cambiar Dirección': Se permite cambiar dirección");
        articulo.setDireccionEntrega(direccion);
    }

    @Override
    public void darValorPresupuesto(Double cantidad) {
        System.out.println("*Estado Para Envío* - 'Método Dar Valor Presupuesto': No se permite agregar el presupuesto");
    }

    @Override
    public void agregarRepuestos(Double cantidad) {
        System.out.println("*Estado Para Envío* - 'Método Agregar Repuestos': No se permite agregar repuestos");
    }

    @Override
    public void pasarSiguiente() {
        System.out.println("*Estado Para Envío* - 'Método Pasar Siguiente': Se mueve al *Estado Finalizado*");
        articulo.setEstado(new Finalizado(articulo));
        System.out.printf("Articulo { nombre: '%s', estado: '%s', presupuesto: '%s', dirección envió: '%s' %n",
                articulo.getNombre(), articulo.getEstado(), articulo.getCosto(), articulo.getDireccionEntrega());
    }

    @Override
    public String toString() {
        return "Para Envió";
    }

}
