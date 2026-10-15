package Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad en Euros: ");
        double cantidad1 = sc.nextDouble();

        final double cambio1 = 1.10;
        double dolares = cantidad1*cambio1;

        System.out.println("El precio en dolares es: " + dolares);
        sc.close();
    }
    
}
