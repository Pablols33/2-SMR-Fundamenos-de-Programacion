package Ejemplos;

public class Ejemplo {
    public static void main(String[] args) {
        double baseImponible = 150.0;
        double iva = baseImponible * 0.21;
        double total = baseImponible + iva;

        System.out.println("Base imponible: " + baseImponible);
        System.out.println("IVA (21%): " + iva);
        System.out.println("Total: " + total);
     }
}
