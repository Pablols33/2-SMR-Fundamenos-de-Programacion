package Ejercicios;

import java.util.Scanner;

public class Ejercicio4V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eres socio? (s/n): ");
        char socio = sc.next().charAt(0);
        System.out.println("Tienes efectivo? (s/n): ");
        char efectivo = sc.next().charAt(0);
        int descuento = 0;

        if(socio == 's'){
            if (efectivo == 's')
            descuento = 7;
            else {
                descuento = 5;
            }
        }
        else{
            if (efectivo == 's')
                descuento = 7;
            else {
                descuento = 0;
            }
        }

        System.out.println("El descusento es " + descuento);
    }
}
