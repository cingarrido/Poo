package com;

public class Bicicleta implements TransporteStrategy{
    @Override
    public Double calcularTiempo(Double distancia) {
        return distancia / 0.050366 * 1.5;
    }
}
