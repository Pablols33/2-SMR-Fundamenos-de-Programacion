package Tema5.Ejercicioos;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce la nota: ");
       double nota = sc.nextDouble();
       if (nota >= 5) {
           System.out.println("Aprobado con un " + nota);
       } else {
           System.out.println("Suspensocon con un " + nota);
       }
    }
}
