package Tema5.Ejercicioos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu edad");
        int edad = sc.nextInt();

        if (edad >=18 && edad<=64) {
            System.out.println("Edad de trabajar");
        }
        else{
            System.out.println("no tiene edad para trabajar");
        }
    }
}