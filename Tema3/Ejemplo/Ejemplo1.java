package Tema3.Ejemplo;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {

     //Crea el objeto Scanner//

    Scanner sc = new Scanner(System.in);
    System.out.println("Dime tu nombre");
    String nombre = sc.nextLine();
    System.out.println("Hola " + nombre);
    }
}
