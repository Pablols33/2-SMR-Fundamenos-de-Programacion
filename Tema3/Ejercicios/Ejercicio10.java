package Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base Imponible: ");
        double baseImp = sc.nextDouble();

        final double IVA = 0.21;
        double cantidadIVA = baseImp * IVA;
        double totalfactura = baseImp + cantidadIVA;

        System.out.println("IVA: " + cantidadIVA);
        System.out.println("Total: " + totalfactura);
        sc.close();
    }
    
}
