public class EnPresupuesto implements Estado{
    // En este estado solo se puede setear el valor del presupuesto y continuar al siguiente paso (EnReparación)
    // Cualqui
    @Override
    public Estado valorPresupuesto() {
        return this;
    }

    @Override
    public Estado sumaRepuesto() {
        System.out.println("No se pueden sumar repuestos a artículo en presupuesto");
        return this;
    }

    @Override
    public Estado cambiarDireccion() {
        System.out.println("No se puede cambiar la respuesta de artículo en presupuesto");
        return this;
    }

    @Override
    public Estado siguientePaso() {
        return new EnReparacion();
    }

    public String mostrarEstado(){
        return "En presupuesto";
    }
}
