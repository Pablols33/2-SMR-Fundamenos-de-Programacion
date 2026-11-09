package Tema5.Ejercicioos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una contraseña: ");
        String contraseña = sc.nextLine();

        if (contraseña.equals("1234")) {
            System.out.println("Acceso Concedido" + contraseña);
        }
        else {
            System.out.println("Acceso Denegado" + contraseña);
        }
        sc.close();
    }
}
