package leccion2.Ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Ejercicio17 {
    public static void main(String[] args) {
        long start2 = System.currentTimeMillis();
        /*
         * Si A es un conjunto de N números enteros no repetidos, B es un arreglo de M
         * números enteros no repetidos, y M < N, determinar si B es subconjunto de A.
         */

        int caso = 2;
        switch (caso) {
            case 1:
                //Eficiencia O(n^2)
                modo_manual_algoritmo1();
                break;
            case 2:
                //2296ms
                modo_peor_caso_algoritmo1();
                break;
            case 3:
                //Eficiencia O(nlogn)
                modo_manual_algoritmo2();
                break;
            case 4:
                //610ms
                modo_peor_caso_algoritmo2();
                break;
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Tiempo en mili segundos: " + (end2 - start2));
    }

    private static void modo_manual_algoritmo1() {
        Scanner lector = new Scanner(System.in);
        int c = lector.nextInt();
        int contador = 0;
        Vector<String> respuesta = new Vector<String>();

        for (int x = 0; x < c; x++) {
            int n = lector.nextInt();
            int A[] = new int[n];
            for (int i = 0; i < A.length; i++) {
                A[i] = lector.nextInt();
            }
            int m = lector.nextInt();
            int B[] = new int[m];
            for (int i = 0; i < B.length; i++) {
                B[i] = lector.nextInt();
            }
            for (int i = 0; i < B.length; i++) {
                for (int j = 0; j < A.length; j++) {
                    if (B[i] == A[j]) {
                        contador++;
                        break;
                    }
                }
            }
            if (contador == m) {
                respuesta.add("B es subconjunto de A.");
            } else {
                respuesta.add("B no es subconjunto de A.");
            }
        }
        lector.close();
        for (int i = 0; i < c; i++) {
            System.out.println(respuesta.get(i));
        }
    }

    private static void modo_peor_caso_algoritmo1() {

        int c = 1000;
        int contador = 0;
        Vector<String> respuesta = new Vector<String>();
        Random random = new Random();

        for (int x = 0; x < c; x++) {
            int n = 10000;
            int A[] = new int[n];
            for (int i = 0; i < A.length; i++) {
                A[i] = random.nextInt(999999) + 1;
            }

            Arrays.sort(A);

            int m = 100;
            int B[] = new int[m];
            for (int i = 0; i < B.length; i++) {
                B[i] = random.nextInt(999999) + 1;
            }
            for (int i = 0; i < B.length; i++) {
                for (int j = 0; j < A.length; j++) {
                    if (B[i] == A[j]) {
                        contador++;
                        break;
                    }
                }
            }
            if (contador == m) {
                respuesta.add("B es subconjunto de A.");
            } else {
                respuesta.add("B no es subconjunto de A.");
            }
        }
        for (int i = 0; i < c; i++) {
            System.out.println(respuesta.get(i));
        }
    }

    private static void modo_manual_algoritmo2() {

        Scanner lector = new Scanner(System.in);
        int c = lector.nextInt();
        int contador = 0;
        Vector<String> respuesta = new Vector<String>();

        for (int j = 0; j < c; j++) {
            int n = lector.nextInt();
            int A[] = new int[n];
            for (int i = 0; i < A.length; i++) {
                A[i] = lector.nextInt();
            }

            Arrays.sort(A);

            int m = lector.nextInt();
            int B[] = new int[m];
            for (int i = 0; i < B.length; i++) {
                B[i] = lector.nextInt();
            }

            Arrays.sort(B);

            for (int i = 0; i < B.length; i++) {
                if (Arrays.binarySearch(A, B[i]) >= 0) {
                    contador++;
                }
            }
            if (contador == m) {
                respuesta.add("B es subconjunto de A.");
            } else {
                respuesta.add("B no es subconjunto de A.");
            }
        }
        lector.close();
        for (int i = 0; i < c; i++) {
            System.out.println(respuesta.get(i));
        }
    }

    private static void modo_peor_caso_algoritmo2() {

        int c = 1000;
        int contador = 0;
        Vector<String> respuesta = new Vector<String>();
        Random random = new Random();

        for (int j = 0; j < c; j++) {
            int n = 10000;
            int A[] = new int[n];
            for (int i = 0; i < A.length; i++) {
                A[i] = random.nextInt(999999) + 1;
            }

            Arrays.sort(A);

            int m = 100;
            int B[] = new int[m];
            for (int i = 0; i < B.length; i++) {
                B[i] = random.nextInt(999999) + 1;
            }
            for (int i = 0; i < B.length; i++) {
                if (Arrays.binarySearch(A, B[i]) >= 0) {
                    contador++;
                }
            }
            if (contador == m) {
                respuesta.add("B es subconjunto de A.");
            } else {
                respuesta.add("B no es subconjunto de A.");
            }
        }
        for (int i = 0; i < c; i++) {
            System.out.println(respuesta.get(i));
        }
    }
}
