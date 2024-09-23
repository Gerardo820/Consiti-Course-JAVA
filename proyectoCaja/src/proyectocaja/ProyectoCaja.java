package proyectocaja;

/**
 *
 * @author Gerardo
 */


public class ProyectoCaja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caja miCaja = new Caja(3, 2, 6);

        System.out.println("El volumen de la caja es: " + miCaja.calcularVolumen());
    }
    
}
