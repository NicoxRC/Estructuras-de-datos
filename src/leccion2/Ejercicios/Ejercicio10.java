package leccion2.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
         * Si A y B son arreglos, ambos de N números enteros, determinar si A y B son
         * idénticos,es decir, si tienen exactamente los mismos elementos
         */

        int caso = 1;

        switch (caso) {
            case 1:
                modo_manual();
                break;
        }
    }

    private static void modo_manual() {
        Scanner lector = new Scanner(System.in);
        int c = lector.nextInt();
        int x = 1;
        int contador = 0;
        boolean end = true;
        boolean end2 = true;
        while (end2) {
            while (end) {
                contador = 0;
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
                        contador++;
                    }
                }
                end = false;
            }
            if (contador > 0) {
                System.out.println("A y B no son identicos.");
            } else {
                System.out.println("A y B son identicos.");
            }
            if (x < c) {
                end = true;
                x++;
            } else {
                end2 = false;
            }
        }
    }
}
