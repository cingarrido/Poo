package com.RedSocial;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Pau", "Muñiz");

        Seguidor seguidor1 = new Seguidor("Jonathan", "Quiroz");
        Seguidor seguidor2 = new Seguidor("Fede", "Abriboca");
        Seguidor seguidor3 = new Seguidor("Pepe", "Lepu");

        usuario.agregarSeguidor(seguidor1);
        usuario.agregarSeguidor(seguidor2);
        usuario.agregarSeguidor(seguidor3);
        usuario.agregarSeguidor(new Observador() {
            @Override
            public void actualizar(Usuario sujeto) {
                System.out.println("Felicitaciones !");
            }
        });

        usuario.agregarFoto();

    }
}
