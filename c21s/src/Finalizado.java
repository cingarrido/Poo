public class Finalizado implements Estado{
    @Override
    public Estado valorPresupuesto() {
        System.out.println("No se puede dar presupuesto a una reparación finalizada.");
        return this;
    }

    @Override
    public Estado sumaRepuesto() {
        System.out.println("No se puede sumar presupuesto a una reparación finalizada.");
        return this;
    }

    @Override
    public Estado cambiarDireccion() {
        System.out.println("No se puede cambiar la dirección de una reparación finalizada.");
        return this;
    }

    @Override
    public Estado siguientePaso() {
        return new EnPresupuesto();
    }

    public String mostrarEstado(){
        return "Finalizado";
    }
}
