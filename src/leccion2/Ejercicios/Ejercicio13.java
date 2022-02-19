package leccion2.Ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Ejercicio13 {
    public static void main(String[] args) {
        long start2 = System.currentTimeMillis();
        // Definir si un numero P es primiconjunto de C.
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

    private static void modo_manual() {
        Scanner lector = new Scanner(System.in);
        int k = lector.nextInt();
        int contador = 0;

        for (int j = 0; j < k; j++) {

            int n = lector.nextInt();
            int p = lector.nextInt();
            int C[] = new int[n];
            Vector<Integer> divisores = new Vector<Integer>();

            for (int i = 0; i < C.length; i++) {
                C[i] = lector.nextInt();
            }
            
            for (int i = 1; i <= C.length; i++) {
                if (p % i == 0) {
                    contador++;
                    if (Arrays.binarySearch(C, i) < 0) {
                        break;
                    } else {
                        divisores.add(C[i - 1]);
                    }
                }
            }
            if (divisores.size() != contador) {
                System.out.println("No es primiconjunto");
            } else {
                System.out.println("Es primiconjunto");
            }
        }
        lector.close();
    }

    private static void modo_peor_caso() {

        int k = 500;
        int contador = 0;

        for (int j = 0; j < k; j++) {

            int n = 10000;
            int p = 500000;
            int C[] = new int[n];
            Vector<Integer> divisores = new Vector<Integer>();
            Random random = new Random();

            for (int i = 0; i < C.length; i++) {
                C[i] = random.nextInt(100000) + 1;
            }

            Arrays.sort(C);
            for (int i = 1; i <= C.length; i++) {
                if (p % i == 0) {
                    contador++;
                    if (Arrays.binarySearch(C, i) < 0) {
                        break;
                    } else {
                        divisores.add(C[i - 1]);
                    }
                }
            }
            if (divisores.size() != contador) {
                System.out.println("No es primiconjunto");
            } else {
                System.out.println("Es primiconjunto");
            }
        }
    }
}
