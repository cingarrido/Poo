public class ParaEnvio implements Estado{
    @Override
    public Estado valorPresupuesto() {
        System.out.println("No se puede dar presupuesto a una reparación para envío.");
        return this;
    }

    @Override
    public Estado sumaRepuesto() {
        System.out.println("No se sumar repuesto a una reparación para envío.");
        return this;
    }

    @Override
    public Estado cambiarDireccion() {
        return this;
    }

    @Override
    public Estado siguientePaso() {
        return new Finalizado();
    }

    public String mostrarEstado(){
        return "Para envío";
    }
}
