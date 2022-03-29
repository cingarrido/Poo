package com.company;

public interface StateArticulo {

    void cambiarDireccion(String direccion);
    void darValorPresupuesto(Double cantidad);
    void agregarRepuestos(Double cantidad);
    void pasarSiguiente();
}
