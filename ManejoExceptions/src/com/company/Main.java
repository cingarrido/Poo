package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = null;
        try {
            cliente = new Cliente("Juan","Gonzales", "123", 1000.0, 500.0);
        } catch (ClienteException e) {
            e.printStackTrace();
        }

        List<Cliente> carteraClientes = new ArrayList<>();
        carteraClientes.add(cliente);

        try {
            cliente.saldarDeuda(20.0);
        } catch (ClienteException e) {
            e.printStackTrace();
        }

        try {
            cliente.comprar(3000.0);
        } catch (ClienteException e) {
            e.printStackTrace();
        }

        System.out.println("llegue hasta aca");





    }
}
