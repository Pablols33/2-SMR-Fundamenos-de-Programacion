package Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad en pesetas: ");
        double euros = sc.nextDouble();

        final double Cambio = 166.386;

        double pesetas = euros * Cambio;
        System.out.println(pesetas + "pesetas son " + euros + ("euros"));
        sc.close();
    }
    
}
