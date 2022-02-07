package leccion2.Ejercicios;

import java.util.Scanner;
import java.util.Vector;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*
         * Si A y B son arreglos, ambos de N números enteros, determinar si A y B son
         * idénticos,es decir, si tienen exactamente los mismos elementos
         */
    }

    private static void modo_manual() {
        Scanner lector = new Scanner(System.in);
        int c = lector.nextInt();
        int x = 1;
        while (x <= c) {
            int contador = 0;
            Vector<Integer> A = new Vector<Integer>();
            Vector<Integer> B = new Vector<Integer>();
            int n = lector.nextInt();
            for (int i = 0; i < n; i++) {
                int nA = lector.nextInt();
                int nB = lector.nextInt();
                A.add(nA);
                B.add(nB);
            }
            for (int i = 0; i < n; i++) {
                if (A.get(i) == B.get(i));{
                    contador++;
                }else if (A.get(i) == B.get(i + 1)){
                    contador++;
                }else if (A.get(i + 1) == B.get(i)){
                    contador++;
                }
            }
        }

    }
}
