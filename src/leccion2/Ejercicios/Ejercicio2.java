package leccion2.Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        long start2 = System.currentTimeMillis();

        byte caso = 1;

        switch (caso) {
            case 1:
                modo_manual();
                break;
            case 2:
                modo_peor_caso();
                break;
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Tiempo en mili segundos: " + (end2 - start2));
    }

    private static void modo_manual() {
        /*
         * Siguiendo con cosas sencillas, supongamos que tenemos un conjunto de números
         * reales y que queremos saber cuántos de ellos se encuentran en el intervalo
         * cerrado [A,B] … ya!
         */
        Scanner lector = new Scanner(System.in);
        int largo = lector.nextInt();
        float vector[] = new float[largo];
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = lector.nextFloat();
        }
        float a = lector.nextFloat();
        float b = lector.nextFloat();
        lector.close();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] >= a && vector[i] <= b) {
                contador++;
            }
        }
        System.out.println(contador);
    }

    private static void modo_peor_caso() {

        float vector[] = new float[20000];
        int contador = 0;
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextFloat() * (999999999999f + 999999999999f) - 999999999999f;
        }
        float a = -999999999999f;
        float b = 999999999999f;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] >= a && vector[i] <= b) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
