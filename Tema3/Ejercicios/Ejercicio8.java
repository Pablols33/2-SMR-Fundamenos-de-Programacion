package Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad en euros: ");
        double euros = sc.nextDouble();

        final double Cambio = 166.386;
        
        double pesetas = euros * Cambio;
        System.out.println(euros + "euros son " + pesetas + ("pesetas"));

        sc.close();
    }
    
}
