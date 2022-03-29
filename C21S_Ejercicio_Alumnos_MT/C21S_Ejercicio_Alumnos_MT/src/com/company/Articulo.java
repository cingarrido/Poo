package com.company;

public class Articulo {

    private String nombre;
    private Double costo;
    private String direccionEntrega;

    private StateArticulo estado;

    public Articulo(String nombre, String direccionEntrega) {
        this.nombre = nombre;
        this.direccionEntrega = direccionEntrega;
        this.estado = new Presupuesto(this);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
    public Double getCosto() {
        return costo;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }
    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setEstado(StateArticulo estado) {
        this.estado = estado;
    }
    public StateArticulo getEstado() {
        return estado;
    }
}
