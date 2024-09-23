package mundopc;
import com.gm.mundopc.*;


public class MundoPC {


    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 22);
        Teclado tecladoMecanico = new Teclado("USB", "Generico");
        Raton ratonErgonomico = new Raton("USB", "Logitech");

        Computadora computadora1 = new Computadora("Computadora 1", monitorHP, tecladoMecanico, ratonErgonomico);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);

        orden1.mostrarOrden();
    }
    
}
