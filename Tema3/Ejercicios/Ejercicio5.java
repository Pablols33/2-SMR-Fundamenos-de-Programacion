package Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime la base de tu rectangulo: ");
        int base = sc.nextInt();

        System.out.print("Dime la altura de tu rectangulo: ");
        int altura = sc.nextInt();

        System.out.println("El area es: " + (base*altura));
    }
    
}
