package Tema4.Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tu edad: ");
        String edadTexto = sc.nextLine();
        
        int edad = Integer.parseInt(edadTexto);
        System.out.println("¿Eres mayor de edad?" + (edad >= 18));
    }
    
}

//Ejercicio de examen pero que habra que ponerle la edad por teclado uasando el comando Scanner//
