package com.RedSocial;

public class Seguidor implements Observador{
    // ATRIBUTOS
    private String nombre;
    private String apellido;
    private Integer cantNotificaciones;

    // CONSTRUCTOR

    public Seguidor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cantNotificaciones = 0;
    }

    @Override
    public void actualizar(Usuario sujeto) {
        cantNotificaciones++;
        System.out.println(nombre + " fue notificado de la foto que subio " + sujeto.getNombre());
    }
}
