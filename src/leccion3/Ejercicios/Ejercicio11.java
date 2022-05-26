package leccion3.Ejercicios;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        long start2 = System.currentTimeMillis();
        // Promoción en el supermercado

        int caso = 2;
        switch (caso) {
            case 1:
                modo_manual();
                break;
            case 2:
                modo_pero_caso();
                break;
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Tiempo en mili segundos: " + (end2 - start2));
    }

    private static void modo_manual() {
        Scanner lector = new Scanner(System.in);
        int k = lector.nextInt();
        for (int i = 0; i < k; i++) {
            Deque<Integer> personas = new LinkedList<Integer>();
            int n = lector.nextInt();
            int u = lector.nextInt();
            int posicion = 0;
            int boletas = 10;

            for (int j = 1; j < n + 1; j++) {
                personas.add(j);
            }

            while (boletas > 0) {
                for (int j = 0; j < n; j++) {
                    posicion = personas.poll();
                    u -= boletas;
                    personas.add(posicion);
                    if (u <= 0) {
                        boletas = 0;
                        break;
                    }
                }
                boletas--;
            }
            if (boletas == 0) {
                System.out.println("Quedaron unidades disponibles");
            } else {
                System.out.println(posicion + "R");
            }
        }
        lector.close();
    }

    private static void modo_pero_caso() {

        int posicion = 0;
        int boletas = 10;
        int k = 1000;
        for (int i = 0; i < k; i++) {
            Deque<Integer> personas = new LinkedList<Integer>();
            int n = 100000;
            int u = 100000000;

            for (int j = 1; j < n + 1; j++) {
                personas.add(j);
            }

            while (boletas > 0) {
                for (int j = 0; j < n; j++) {
                    posicion = personas.poll();
                    u -= boletas;
                    personas.add(posicion);
                    if (u <= 0) {
                        boletas = 0;
                        break;
                    }
                }
                boletas--;
            }
        }
        if (boletas == 0) {
            System.out.println("Quedaron unidades disponibles");
        } else {
            System.out.println(posicion + "R");
        }
    }
}
