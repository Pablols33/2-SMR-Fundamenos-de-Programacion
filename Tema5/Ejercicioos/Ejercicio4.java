package Tema5.Ejercicioos;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        final double DESCUENTO = 0.10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu importe:");
        double importe = sc.nextDouble();
        //double total = importe - (importe*DESCUENTO);
        double total = importe*(1-DESCUENTO);

        if(importe>100){
            System.out.println("El precio con descuento");
        }

        System.out.println("El preico total es " + total);
    }
}
