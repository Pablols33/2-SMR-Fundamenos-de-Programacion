package Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Horas Trabajadas: ");
        int Horas = sc.nextInt();

        System.out.print("Precio por hora: ");
        int Precio = sc.nextInt();

        System.out.println("Cual es el salario semanal: " + (Horas*Precio));
    }
}
