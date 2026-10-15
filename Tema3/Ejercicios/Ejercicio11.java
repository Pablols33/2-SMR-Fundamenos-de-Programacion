package Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radio: ");
        double Radio = sc.nextDouble();

        final double PI = 3.14159;
        
        double Area = Radio*Radio*PI;
        System.out.println("El area del circulo es: " + Area);

        sc.close();
    }
    
}
