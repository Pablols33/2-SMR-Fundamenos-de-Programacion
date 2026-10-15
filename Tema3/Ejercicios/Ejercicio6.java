package Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime la base de tu triangulo: ");
        int base = sc.nextInt();

        System.out.print("Dime la altura de tu triangulo: ");
        int altura = sc.nextInt();

        int area = base * altura;

        System.out.println("El area es: " + (double)area/2);
        sc.close();
    }
}
