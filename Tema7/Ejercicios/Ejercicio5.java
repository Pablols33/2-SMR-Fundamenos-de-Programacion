package Tema7.Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime el idiona (es, en, fr): ");
        String idioma = scanner.nextLine();

        switch (idioma) {
            case "es":
                System.out.println("Hola");
                break;
            case "en":
                System.out.println("Hello");
                break;
            case "fr":
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Idioma no reconocido");
        }
    }
}
