package com.Subastas;

import java.util.ArrayList;
import java.util.List;

public class Subasta implements Sujeto{

    private Double monto;
    private String descripcion;
    private List<Observador> oferentes;

    public Subasta(Double monto, String descripcion) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.oferentes = new ArrayList<>();
    }

    public void agregarOferente(Observador observador){
        this.oferentes.add(observador);
    }

    @Override
    public void notificar() {

        System.out.println("Se ha notificado sobre la subasta!!!");

        for (Observador oferente : this.oferentes) {
            oferente.actualizar(this);
        }
    }


    public Double getMonto(){
        return this.monto;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}
