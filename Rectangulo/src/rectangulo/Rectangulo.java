package rectangulo;

import java.util.Scanner;


public class Rectangulo {

    public static void main(String[] args) {
        int alto;
        int ancho;
        
        Scanner Consola = new Scanner(System.in);
        
        System.out.println("Proporciona el alto: ");
        alto = Consola.nextInt();
        System.out.println("Proporciona el ancho:");
        ancho = Consola.nextInt();
        
        System.out.println("Área: " + (alto * ancho));
        System.out.println("Perímetro: " + ((alto + ancho)* 2));
    }
        
}
