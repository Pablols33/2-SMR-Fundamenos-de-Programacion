package Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Edad"); 
        int edad2 = sc.nextInt();
        double cantidad2 = edad2+5;
        System.out.println("Mi edad en 5 años: " + cantidad2);
        sc.close();
    }
    
}
