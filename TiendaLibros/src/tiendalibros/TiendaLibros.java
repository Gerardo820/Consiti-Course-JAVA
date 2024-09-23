package tiendalibros;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class TiendaLibros {

    public static void main(String[] args) {
        String Nombre;
        int id;
        double precio;
        boolean envio;
        
        Scanner Consola = new Scanner(System.in);
        
        System.out.println("Proporciona el nombre: ");
        Nombre = Consola.nextLine();
        
        System.out.println("Proporciona el id: ");
        id = Consola.nextInt();
        
        System.out.println("Proporciona el precio: ");
        precio = Consola.nextDouble();

        System.out.println("Proporciona el envio gratuito (True/False): ");
        envio = Consola.nextBoolean();
        
        System.out.println(Nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envio);
    }
    
}
