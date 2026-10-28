package Tema4.Ejercicios;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        int edad = 17;
        boolean aprobadoteorico = true;

        boolean puedeScarCarnet = (edad>=18) && aprobadoteorico;
        System.out.println(" Se puede sacar el carnet " + puedeScarCarnet);
    }
    
}
