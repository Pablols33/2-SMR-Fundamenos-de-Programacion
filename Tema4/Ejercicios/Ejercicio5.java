package Tema4.Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        String n1 = sc.nextLine();
        
        System.out.println("Introduce el segundo numero");
        String n2 = sc.nextLine();

        int numero1 = Integer.parseInt(n1);
        int numero2 = Integer.parseInt(n2);

        System.out.println("Suma de los textos" + (numero1 + numero2));
    }
    
}
