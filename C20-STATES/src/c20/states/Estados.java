package c20.states;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis-1995
 */
public interface Estados {
    public Estados pagar();
    public Estados cerrar();
    public Estados cargar();
    public Estados vaciar();
    public void estadoSiguiente();
    public void estadoAnterior();
}
