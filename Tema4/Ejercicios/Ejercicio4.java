package Tema4.Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra = 'A';
        int codigo = letra;
        char siguiente = (char) (letra + 1);

        System.out.println(codigo);              
        System.out.println(siguiente);           
        System.out.println((int) 'A');
    }
    
}
