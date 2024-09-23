package proyectocaja;

/**
 *
 * @author Gerardo
 */
public class Caja {

    private int ancho;
    private int alto;
    private int profundo;


    public Caja() {
        this.ancho = 0;
        this.alto = 0;
        this.profundo = 0;
    }


    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }


    public int calcularVolumen() {
        return ancho * alto * profundo;
    }

}

