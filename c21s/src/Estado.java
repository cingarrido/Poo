// Interface de estados. Reparacion tiene un atributo de este tipo que indica el estado
// Cada estado (EnPresupuesto, EnReparacion, ParaEnvío, Finalizado) es una clase distinta que implementa esta interface
public interface Estado {
    // Estos métodos se usan únicamente para navegar entre estados. No modifican los atributos de Reparación.
    // Son las acciones que se le puede dar a Reparacion. Cada acción podría provocar un cambio de estado, que se
    // se define en la clase correspondiente al estado. La clase Reparación tiene otros métodos que llaman a éstos.
    public Estado valorPresupuesto();
    public Estado sumaRepuesto();
    public Estado cambiarDireccion();
    public Estado siguientePaso();
    public String mostrarEstado();
}
