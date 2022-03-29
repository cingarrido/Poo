package com;

public class Caminar implements TransporteStrategy{
    @Override
    public Double calcularTiempo(Double distancia) {
        return distancia / 0.20366 * 13;
    }
}
