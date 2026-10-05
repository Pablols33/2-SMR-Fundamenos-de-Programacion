package Tema3;

import java.util.Scanner;

public class Ejemplo2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();//Creamos la variable edad pero como es un numero entero ponemos int=entero
        sc.nextLine();

        System.out.print("Dime tu inicial");
        char inicial = sc.nextLine().charAt(0);

        System.out.println("Hola " + nombre + " tienes " + edad + " años");//Finalizamos el texto q no esta escrito
        System.out.println("Tu inicial: " + inicial);
    }
}
