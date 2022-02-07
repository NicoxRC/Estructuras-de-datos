package leccion1.Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        long start2 = System.currentTimeMillis();
        // encontrar las potencias enteras positivas del número A que sean menores o
        // iguales a B.

        System.out.println("Ingrese el numero y y el limite: ");
        Scanner lector = new Scanner(System.in);
        int base = 5;
        int expo = 5000;
        /*int base = lector.nextInt();
        int expo = lector.nextInt();
        */
        int resultado = 0;
        for (int i = 1; i < expo; i++) {
            resultado = (int) Math.pow(base, i);
            if (resultado <= expo) {
                System.out.println(resultado);
            }
            else{
                break;
            }
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Tiempo en mili segundos: "+ (end2-start2));
    }
}
