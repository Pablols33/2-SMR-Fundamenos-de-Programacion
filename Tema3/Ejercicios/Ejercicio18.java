package Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        System.out.println("Minuto"); 
        int minuto1 = sc.nextInt();

        int tiempo = 60; 
        int minuto = minuto1*60;

        System.out.println("Son: " + minuto + "segundos");
    }
    
}
