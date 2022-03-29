package com.RedSocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Sujeto{
    // ATRIBUTOS
    private String nombre;
    private String apellido;
    private Boolean subirFoto;
    private List<Observador> seguidores;

    // CONSTRUCTOR

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.subirFoto = false;
        this.seguidores = new ArrayList<>();
    }

    // METODOS
    public void agregarSeguidor(Observador observador){
        seguidores.add(observador);
    }

    @Override
    public void agregarFoto() {
        System.out.println("subi una foto nueva");
        subirFoto = true;
        notificar();
    }

    @Override
    public void eliminarFoto() {
        System.out.println("elimine una foto");
        subirFoto = false;
    }

    @Override
    public void notificar() {
        for (Observador seguidor : seguidores) {
            seguidor.actualizar(this);
        }
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }
}
