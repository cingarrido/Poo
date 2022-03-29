package com.companyCliente;

import java.util.Date;

public class Paciente extends Exception {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private String dni;
    private String fechaIngreso;
    private String fechaAlta;
    private Date fechaHoy = new Date();

    public Paciente(String nombre, String apellido, String dni, String fechaIngreso) {
        if ( fechaIngreso.equals() > fechaHoy.eq() )
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.fechaAlta = null;


    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

}

    public void saldarDeuda (Doubleimporte)
}
