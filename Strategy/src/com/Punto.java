package com;

public class Punto {

    private Double latitud;
    private Double longitud;

    public Punto(Double latitud, Double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Double calcularDistancia(Punto otroPunto){
        return Math.abs(latitud - otroPunto.latitud) + Math.abs(longitud - otroPunto.longitud);
    }
}
