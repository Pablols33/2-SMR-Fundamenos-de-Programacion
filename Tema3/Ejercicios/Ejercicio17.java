package Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero");
        int numero1 = sc.nextInt();

        double doble = numero1*2;
        double triple = numero1*3;
        System.out.println("El doble es: " + doble);
        System.out.println("El triple es: " + triple);
    }
    
}
