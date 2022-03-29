package com.company;

public class Cliente {
    // ATRIBUTOS
    private String nombre;
    private String apellido;
    private String dni;
    private Double saldoCuenta;
    private Double deuda;
    private Double limite;

    // CONSTRUCTOR
    public Cliente(String nombre, String apellido, String dni, Double saldoCuenta, Double limite) throws ClienteException{
        if(limite <= 0){
            throw new ClienteException("limite debe ser positivo mayor a 0");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.saldoCuenta = saldoCuenta;
        this.limite = limite;
        this.deuda = 0.0;
    }

    // METODOS
    public void saldarDeuda(Double importe) throws ClienteException {
        if(this.deuda < importe){
            // rompe
            throw new ClienteException("estas intentanto pagar mas que tu deuda");
        }
        this.deuda -= importe;
    }

    public void comprar(Double importe) throws ClienteException {
        if(importe <= this.limite){
            this.saldoCuenta -= importe;
        }else{
            throw new ClienteException(" qures comprar algo de " + importe + " y tu limite es de " +this.limite);
        }
    }

}
