package Tema7.Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.next();

        switch (color) {
            case "rojo":
                System.out.println("Parar");
                break;
            case "amarillo":
                System.out.println("Precsucion");
                break;
            case "verde":
                System.out.println("Pasa");
                break;
            default:System.out.println("Color no valido");
                break;
        }
    }
}
