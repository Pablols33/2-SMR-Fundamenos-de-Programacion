package Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon aqui el precio del producto: ");
        double precio = sc.nextDouble();

        final double descuento = 0.1;

        double finalprecio = precio * (1 - descuento);
        System.out.println("El precio final es: " + finalprecio);

        sc.close();
    }
    
}
