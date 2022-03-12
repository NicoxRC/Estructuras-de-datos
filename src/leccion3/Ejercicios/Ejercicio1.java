package leccion3.Ejercicios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        long start2 = System.currentTimeMillis();
        // Sumatoria de múltiplos

        int caso = 1;
        switch (caso) {
            case 1:
                // eficiencia O(n^2)
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
        LinkedList<Integer> A = new LinkedList<Integer>();
        Iterator<Integer> iterador;
        int m = 0;
        int x = 0;
        int y = 0;
        String accion = "";

        while (!accion.equals("E")) {

            accion = lector.next();

            if (accion.equals("A")) {

                A.add(lector.nextInt());

            } else if (accion.equals("M")) {

                m = lector.nextInt();
                iterador = A.listIterator();
                x = 0;
                while (iterador.hasNext()) {
                    y = iterador.next();
                    if (y % m == 0) {
                        x += y;
                    }
                }
                System.out.println(x + "r");
            }
        }
        lector.close();
    }

    private static void modo_peor_caso() {

        LinkedList<Integer> A = new LinkedList<Integer>();
        Iterator<Integer> iterador;
        Random random = new Random();
        int m = 0;
        int x = 0;
        int y = 0;
        int tamano = 50000;

        for (int i = 0; i < tamano; i++) {

            int accion = random.nextInt(2) + 1;

            if (accion == 1) {
                A.add(random.nextInt(1000000000) + 1);
            } else if (accion == 2) {

                m = random.nextInt(1000000000) + 1;
                iterador = A.listIterator();
                x = 0;
                while (iterador.hasNext()) {
                    y = iterador.next();
                    if (y % m == 0) {
                        x += y;
                    }
                }
                System.out.println(x);
            }
        }
    }
}
