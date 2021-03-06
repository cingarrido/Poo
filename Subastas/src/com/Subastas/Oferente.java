package com.Subastas;

public class Oferente implements Observador{

    private String nombre;
    private String apellido;
    private Integer dni;
    private Double montoTope;

    public Oferente(String nombre, String apellido, Integer dni, Double montoTope) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.montoTope = montoTope;
    }

    @Override
    public void actualizar(Subasta subasta) {
        if (subasta.getMonto() < this.montoTope)
            System.out.println(this.nombre + " " + this.apellido + " ofrece " + this.montoTope + " por " + subasta.getDescripcion());
    }
}
