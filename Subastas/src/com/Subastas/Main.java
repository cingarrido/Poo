package com.Subastas;

public class Main {
    public static void main(String[] args) {

        Subasta subasta = new Subasta(100000000000.0, "el corazon de Pau");
        Oferente oferenteEnamorado = new Oferente("Jonathan", "Quiroz", 123, 10000000000000000000000000000000000000000000000000000000000000.0);

        subasta.agregarOferente(oferenteEnamorado);
        subasta.notificar();

    }
}
