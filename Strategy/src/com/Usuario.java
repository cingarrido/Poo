package com;

public class Usuario {

    private Punto ubicacionActual;

    public Usuario(Punto ubicacionActual) {
        this.ubicacionActual = ubicacionActual;
    }

    public Double cuantoTardo(Punto ubicacionFinal, TransporteStrategy transporteStrategy){
        return transporteStrategy.calcularTiempo(ubicacionActual.calcularDistancia(ubicacionFinal));
    }
}
