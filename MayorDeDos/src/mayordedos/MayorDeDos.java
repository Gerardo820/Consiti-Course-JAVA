package mayordedos;

import java.util.Scanner;


public class MayorDeDos {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        
        int numeroMayor;
        
        Scanner Consola = new Scanner(System.in);
        
        System.out.println("Proporciona el numero 1: ");
        numero1 = Consola.nextInt();
        
        System.out.println("Proporciona el numero 2: ");
        numero2 = Consola.nextInt();
        
        numeroMayor = (numero1 > numero2) ? numero1 : numero2;
        
        System.out.println("El numero mayor es: " + numeroMayor);
        
    }
    
}
