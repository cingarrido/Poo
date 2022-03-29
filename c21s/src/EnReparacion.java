public class EnReparacion implements Estado{

    @Override
    public Estado valorPresupuesto() {
        System.out.println("No se puede dar valor al presupuesto del artículo en reparacion");
        return this;
    }

    @Override
    public Estado sumaRepuesto() {
        return this;
    }

    @Override
    public Estado cambiarDireccion() {
        System.out.println("No se puede cambiar la direccion de artículo en reparacion");
        return this;
    }

    @Override
    public Estado siguientePaso() {
        return new ParaEnvio();
    }

    public String mostrarEstado(){
        return "En reparacion";
    }
}
