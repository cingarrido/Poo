package com;

public class UberDH {
    public static void main(String[] args) {

        Punto ubicacion1 = new Punto(20.0, 50.0);
        Punto ubicacion2 = new Punto(-3.0, 60.0);
        Punto ubicacion3 = new Punto(-20.0, -20.0);

        Auto auto = new Auto();
        Bicicleta bicicleta = new Bicicleta();

        Usuario usuario = new Usuario(ubicacion1);

        System.out.println(usuario.cuantoTardo(ubicacion2, auto));
        System.out.println(usuario.cuantoTardo(ubicacion3, bicicleta));
        System.out.println(usuario.cuantoTardo(ubicacion1, bicicleta));
        System.out.println(usuario.cuantoTardo(ubicacion2, new TransporteStrategy() {
            @Override
            public Double calcularTiempo(Double distancia) {
                return distancia/10;
            }
        }));


    }
}
