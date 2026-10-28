package Tema4.Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int a = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce el segundo numero");
        int b = Integer.parseInt(sc.nextLine());

        double media = (double) (a + b) /2;
        System.out.println(media);
    }
    
}
