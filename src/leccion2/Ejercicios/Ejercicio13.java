package leccion2.Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        // Definir si un numero P es primiconjunto de C.
        int caso = 1;
        switch (caso) {
            case 1:
                modo_manual();
                break;
        }
    }

    private static void modo_manual() {
        Scanner lector = new Scanner(System.in);
        int k = lector.nextInt();
        int x = 1;
        int contador = 0;
        boolean end = true;
        boolean end2 = true;
        while (end2) {
            while (end) {
                contador = 0;
                int n = lector.nextInt();
                int p = lector.nextInt();
                int C[] = new int[n];
                int divisores[] = new int[p];
                int divisores1[] = new int[n];
                for (int i = 0; i < C.length; i++) {
                    C[i] = lector.nextInt();
                    if (p % C[i] == 0) {
                        for (int j = 0; j < divisores1.length; j++) {
                            divisores[j] = C[i];
                        }
                    }
                }
                for (int i = 0; i < divisores.length; i++) {
                    if (p % i == 0) {
                        divisores[i] = i;
                    }
                }
                for (int i = 0; i < p; i++) {
                    if (divisores[i] != divisores1[i]) {
                        contador++;
                    }
                }
                end = false;
            }
            if (contador > 0) {
                System.out.println("No es primiconjunto.");
            } else {
                System.out.println("Es primiconjunto.");
            }
            if (x < k) {
                end = true;
                x++;
            } else {
                end2 = false;
            }
        }
    }
}
