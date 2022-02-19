package leccion2.Ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Ejercicio10 {
    public static void main(String[] args) {
        long start2 = System.currentTimeMillis();
        /*
         * Si A y B son arreglos, ambos de N números enteros, determinar si A y B son
         * idénticos,es decir, si tienen exactamente los mismos elementos.
         */

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

        //O(nlogn)

        Scanner lector = new Scanner(System.in);
        int c = lector.nextInt();
        int x = 1;
        boolean contador = false;
        boolean end = true;
        boolean end2 = true;
        Vector<String> respuesta = new Vector<String>();
        while (end2) {
            while (end) {
                contador = false;
                int n = lector.nextInt();
                int A[] = new int[n];
                int B[] = new int[n];

                for (int i = 0; i < A.length; i++) {
                    A[i] = lector.nextInt();
                }
                for (int i = 0; i < B.length; i++) {
                    B[i] = lector.nextInt();
                }

                Arrays.sort(A);
                Arrays.sort(B);

                for (int i = 0; i < n; i++) {
                    if (A[i] != B[i]) {
                        contador = true;
                        break;
                    }
                }
                if (contador) {
                    respuesta.add("A y B no son identicos.");
                } else {
                    respuesta.add("A y B son identicos.");
                }
                end = false;
            }
            if (x < c) {
                end = true;
                x++;
            } else {
                end2 = false;
            }
        }
        lector.close();
        for (int i = 0; i < c; i++) {
            System.out.println(respuesta.get(i));
        }
    }

    private static void modo_peor_caso() {

        int c = 100;
        int x = 1;
        boolean contador = false;
        boolean end = true;
        boolean end2 = true;
        Vector<String> respuesta = new Vector<String>();
        Random random = new Random();
        while (end2) {
            while (end) {
                contador = false;
                int n = 5000;
                int A[] = new int[n];
                int B[] = new int[n];

                for (int i = 0; i < A.length; i++) {
                    A[i] = random.nextInt(999999) - 999999;
                }
                for (int i = 0; i < B.length; i++) {
                    B[i] = random.nextInt(999999) - 999999;
                }

                Arrays.sort(A);
                Arrays.sort(B);

                for (int i = 0; i < n; i++) {
                    if (A[i] != B[i]) {
                        contador = true;
                        break;
                    }
                }
                if (contador) {
                    respuesta.add("A y B no son identicos.");
                } else {
                    respuesta.add("A y B son identicos.");
                }
                end = false;
            }
            if (x < c) {
                end = true;
                x++;
            } else {
                end2 = false;
            }
        }
        for (int i = 0; i < c; i++) {
            System.out.println(respuesta.get(i));
        }
    }
}
