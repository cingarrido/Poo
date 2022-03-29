// Clase representativa de las reparaciones. Los atributos tienen la información requerida.
// Se agregan métodos que permitan manejar las acciones definidas en la consigna. En estos métodos se cambia los
// la información de la reparación.

public class Reparacion {

    // ATRIBUTOS

    private Estado estadoActual;
    private String nombreArticulo;
    private Double costoPresupuesto;
    private String direccionEntrega;

    // CONSTRUCTORES

    public Reparacion(String nombreArticulo, Double costoPresupuesto, String direccionEntrega){
        this.nombreArticulo = nombreArticulo;
        this.costoPresupuesto = costoPresupuesto;
        this.direccionEntrega = direccionEntrega;
        this.estadoActual = new EnPresupuesto();
    }


    // METODOS

    // Tienen que estar los métodos correspondientes a las acciones para cambiar la información (atributos)
    // correspondiente. La clase del atributo Estado indica el estado en el que se encuentra.

    // mostrarInfo() Se usa para mostrar la información del presupuesto luego de cambiar de estado
    public void mostrarInfo(){
        System.out.println(
                "Nombre del producto: " + this.nombreArticulo +
                "\nEstado: " + this.estadoActual.mostrarEstado() +
                "\nValor de presupuesto: " + this.costoPresupuesto +
                "\nDirección de entrega: " + this.direccionEntrega + "\n"
        );
    }

    // Estos métodos actualizan la información según la acción a tomar. El estado actual se puede saber chequeando
    // la clase del atributo. Se debe llamar al método de Estado para que se actualice: cada método devuelve el estado
    // al que se pasará, a menos que sea una transición inválida (como sumar repuesto en presupuesto), en cuyo caso
    // se muestra un mensaje de error y permanece en el estado (ver implementación en las clases de estado)

    public void darValorPresupuesto(Double costo){
        if(this.estadoActual.getClass() == EnPresupuesto.class)
            // Se asigna el costo del presupuesto únicamente si está en estado de presupuesto
            this.costoPresupuesto = costo;
        this.estadoActual = this.estadoActual.valorPresupuesto();
        mostrarInfo();
    }

        public void agregarRepuesto(Double costoRepuesto){
        if(this.estadoActual.getClass() == EnReparacion.class)
            // Se suma el costo del repuesto únicamente si está en estado de reparación
            this.costoPresupuesto += costoRepuesto;
        this.estadoActual = this.estadoActual.sumaRepuesto();
        mostrarInfo();
    }

    public void cambiarDireccion(String direccion){
        if(this.estadoActual.getClass() == ParaEnvio.class)
            // Se cambia la dirección de envío únicamente cuando está EnEnvío
            this.direccionEntrega = direccion;
        this.estadoActual = this.estadoActual.cambiarDireccion();
        mostrarInfo();
    }

    public void pasarAlSiguientePaso(){
        if(this.estadoActual.getClass() == Finalizado.class)
            // Si se pasa al siguiete estado desde finalizar, se resetea la información (los valores on arbitrarios)
            resetearInfo();
        this.estadoActual = this.estadoActual.siguientePaso();
        mostrarInfo();
    }

    // Se usa cuando se pasa al siguiente paso estando en estado Finalizado
    public void resetearInfo(){
        this.costoPresupuesto = 0.0;
        this.nombreArticulo = "Sin artículos";
        this.direccionEntrega = "Sin dirección de entrega";
    }
}
