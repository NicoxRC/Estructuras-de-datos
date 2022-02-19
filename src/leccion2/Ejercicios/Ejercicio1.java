package leccion2.Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        long start2 = System.currentTimeMillis();

        byte caso = 4;

        switch (caso) {
            case 1:
                modo_manual();
                break;
            case 2:
                modo_automatico(new int[] { 5, 1, 7, 8 }, 3);
                break;
            case 3:
                modo_peor_caso();
                break;
            case 4:
                modo_mejorado();
                break;
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Tiempo en mili segundos: " + (end2 - start2));
    }

    private static void modo_manual() {
        /*
         * Siendo este el primero de los ejercicios sobre arreglos debería ser fácil,
         * ¿no cierto? Bueno, la verdad es que así es, aunque no tanto.
         * Dado un arreglo de N números enteros, necesitamos saber cuál es el mayor
         * entre los primeros M (1 ≤ M ≤ N). Por ejemplo, si el arreglo es
         * {4, 7, 1, 3, 9, 6} y M es 3, el mayor que estamos buscando es 7.
         */
        Scanner lector = new Scanner(System.in);
        int largo = lector.nextInt();
        int vector[] = new int[largo];
        int mayor = 0;

        for (int i = 0; i < vector.length; i++) {
            int numeros = lector.nextInt();
            vector[i] = numeros;
        }
        int distancia = lector.nextInt();
        for (int j = 0; j < distancia; j++) {
            if (vector[j] > mayor) {
                mayor = vector[j];
            }
        }
        lector.close();
        System.out.println(mayor);
    }

    private static void modo_automatico(int vector[], int distancia) {

        int mayor = 0;
        for (int j = 0; j < distancia; j++) {
            if (vector[j] > mayor) {
                mayor = vector[j];
            }
        }
        System.out.println(mayor);
    }

    private static void modo_peor_caso() {
        /*
         * Siendo este el primero de los ejercicios sobre arreglos debería ser fácil,
         * ¿no cierto? Bueno, la verdad es que así es, aunque no tanto.
         * Dado un arreglo de N números enteros, necesitamos saber cuál es el mayor
         * entre los primeros M (1 ≤ M ≤ N). Por ejemplo, si el arreglo es
         * {4, 7, 1, 3, 9, 6} y M es 3, el mayor que estamos buscando es 7.
         */
        int vector[] = new int[50000];
        int mayor = 0;
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(1000000 + 1) + 1;
        }
        // int distancia = 50000;
        for (int j = 0; j < 50000; j++) {
            if (vector[j] > mayor) {
                mayor = vector[j];
            }
        }
        System.out.println(mayor);
    }

    private static void modo_mejorado() {

        Scanner lector = new Scanner(System.in);
        int mayor = 0;
        // suponiendo que den el valor de distancia antes de llenarlo
        int distancia = lector.nextInt();
        for (int i = 0; i < distancia; i++) {
            int numero = lector.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
        }
        lector.close();
        System.out.println(mayor);
    }
}
