package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introude la edad: ");
        int edad1 = sc.nextInt();

        if(edad1 >=11 && edad1 <=11){
            System.out.println(edad1 + "Niño");
        }
        else if(edad1 >=12 && edad1 <=17){
            System.out.println(edad1 + "Adolescente");
        }
        else if(edad1 >=18 && edad1 <=64){
            System.out.println(edad1 + "Adulto");
        }
        else if(edad1 >=64 && edad1 <=65){
            System.out.println(edad1 + "Mayor");
        }
    }
}
