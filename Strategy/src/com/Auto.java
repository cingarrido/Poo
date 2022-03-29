package com;

public class Auto implements TransporteStrategy{

    @Override
    public Double calcularTiempo(Double distancia) {
        return distancia / 0.40366 * 4;
    }
}
