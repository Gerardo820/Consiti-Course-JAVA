package calificaciones;

import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {
        double calificacion;
        
        Scanner Consola = new Scanner(System.in);
        
        System.out.println("Proporciona un valor entre 0 y 10: ");
        
        calificacion = Consola.nextDouble();
        
        
         if (calificacion >= 9 && calificacion <= 10) {
                System.out.println("A");
            } else if (calificacion >= 8 && calificacion < 9) {
                System.out.println("B");
            } else if (calificacion >= 7 && calificacion < 8) {
                System.out.println("C");
            } else if (calificacion >= 6 && calificacion < 7) {
                System.out.println("D");
            } else if (calificacion >= 0 && calificacion < 6) {
                System.out.println("F");
            } else {
                System.out.println("Valor desconocido");
            }
    }
    
}
