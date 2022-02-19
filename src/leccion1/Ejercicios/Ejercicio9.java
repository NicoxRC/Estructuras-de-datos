package leccion1.Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /*
         * Dada una secuencia de números enteros, ¿cuál será la
         * suma de los positivos, y cuál la de los negativos
         */
        System.out.println("\nDigite la cantidad de numeros: \n");
        Scanner lector = new Scanner(System.in);
        int largo = lector.nextInt();
        int vector[] = new int[largo];
        int sumpos = 0;
        int sumneg = 0;
        System.out.println("\nIngrese los numeros: \n");
        for (int i = 0; i < vector.length; i++) {
            int numero = lector.nextInt();
            vector[i] = numero;
        }
        lector.close();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] >= 0) {
                sumpos += vector[i];
            } else {
                sumneg += vector[i];
            }
        }
        System.out.println("Positivos " + sumpos + "," + " Negativos " + sumneg);
    }
}
