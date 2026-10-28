package Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre");
        String Nombre1 = sc.nextLine();
        
        System.out.println( "edad");
        int edad = sc.nextInt();

        System.out.println(Nombre1 + "tiene " + edad + "años ");
        sc.close();
        
    }
}
