public class Main {
    public static void main(String[] args) {
        // Crear reparación
        Reparacion reparacion = new Reparacion("batidora", 0.0, "una dirección");
        reparacion.mostrarInfo();

        // Asigna presupuesto (se podría hacer en el constructor)
        reparacion.darValorPresupuesto(100.0);

        // Pasar a reparación
        reparacion.pasarAlSiguientePaso();

        // Agregar importe de repuesto
        reparacion.agregarRepuesto(50.0);

        // Da valor al presupuesto. Debería mostrar mensaje de error
        reparacion.darValorPresupuesto(100.0);

        // Pasar a envío
        reparacion.pasarAlSiguientePaso();

        // Cambiar dirección
        reparacion.cambiarDireccion("otra dirección");

        // Pasar a finalizar
        reparacion.pasarAlSiguientePaso();
    }
}
