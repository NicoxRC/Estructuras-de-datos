package leccion2.Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        long start2 = System.currentTimeMillis();

        int caso = 2;
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
    private static void modo_manual(){
        /*
         * Dada una secuencia de N números enteros, necesitamos saber cuál es el
         * acumulado (sumatoria) de los i últimos (con i desde 2 hasta N)
         */
        Scanner lector = new Scanner(System.in);
        int largo = lector.nextInt();
        int vector[] = new int[largo];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = lector.nextInt();;
        }
        lector.close();
        int contador = vector[largo-1];
        for (int i = vector.length - 2; i >=0; i--) {
            contador +=vector[i];
            System.out.println(contador);
        }
    }
    private static void modo_peor_caso(){

        int vector[] = new int[5000];
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100000);
        }
        int contador = vector[5000-1];
        for (int i = vector.length - 2; i >=0; i--) {
            contador +=vector[i];
            System.out.println(contador);
        }
    }
}
