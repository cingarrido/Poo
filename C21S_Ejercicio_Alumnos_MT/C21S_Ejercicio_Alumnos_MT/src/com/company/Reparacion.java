package com.company;

public class Reparacion implements StateArticulo {

    private Articulo articulo;

    public Reparacion(Articulo articulo){
        this.articulo = articulo;
    }

    @Override
    public void cambiarDireccion(String direccion) {
        System.out.println("*Estado Reparación* - 'Método Cambiar Dirección': No se permite cambiar dirección");
    }

    @Override
    public void darValorPresupuesto(Double cantidad) {
        System.out.println("*Estado Reparación* - 'Método Dar Valor Presupuesto': No se permite agregar el presupuesto");
    }

    @Override
    public void agregarRepuestos(Double cantidad) {
        System.out.println("*Estado Reparación* - 'Método Agregar Repuestos': Se permite agregar el valor de los repuestos");
        articulo.setCosto(articulo.getCosto() + cantidad);
    }

    @Override
    public void pasarSiguiente() {
        System.out.println("*Estado Reparación* - 'Método Pasar Siguiente': Se mueve al *Estado Para Envío*");
        articulo.setEstado(new ParaEnvio(articulo));
        System.out.printf("Articulo { nombre: '%s', estado: '%s', presupuesto: '%s', dirección envió: '%s' %n",
                articulo.getNombre(), articulo.getEstado(), articulo.getCosto(), articulo.getDireccionEntrega());
    }

    @Override
    public String toString() {
        return "Reparación";
    }

}
