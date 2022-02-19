package leccion2.Ejercicios;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Ejercicio5 {
    public static void main(String[] args) {
        long start2 = System.currentTimeMillis();
        /*
         * Dado un conjunto creciente de enteros negativos, se debe determinar si uno en
         * particular hace o no parte de dicho conjunto
         */
        int caso = 4;
        switch (caso) {
            case 1:
                modo_manual_algoritmo1();
                break;
            case 2:
                modo_peor_caso_algoritmo1();
                // 3577ms(30000 elementos)
                break;
            case 3:
                modo_manual_algoritmo2();
                break;
            case 4:
                modo_peor_caso_algoritmo2();
                // 967ms(30000 elementos)
                break;
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Tiempo en mili segundos: " + (end2 - start2));
    }

    private static void modo_manual_algoritmo1() {

        Scanner lector = new Scanner(System.in);
        boolean contador = false;
        Vector<Integer> numeros = new Vector<Integer>();
        Vector<Integer> A = new Vector<Integer>();
        boolean fin = true;

        while (fin) {

            String accion = lector.next();

            if (accion.equals("incluir")) {
                int dato = lector.nextInt();
                numeros.add(dato);
            } else if (accion.equals("buscar")) {
                int dato = lector.nextInt();
                A.add(dato);
            } else if (accion.equals("fin")) {
                fin = false;
            }
        }
        lector.close();
        for (int i = 0; i < A.size(); i++) {
            contador = false;
            for (int j = 0; j < numeros.size(); j++) {
                if (A.get(i) == numeros.get(j)) {
                    contador = true;
                    break;
                }
            }
            if (contador) {
                System.out.println("Encontrado.");
            } else {
                System.out.println("No encontrado");
            }
        }
    }

    private static void modo_peor_caso_algoritmo1() {

        boolean contador = false;
        Vector<Integer> numeros = new Vector<Integer>();
        Vector<Integer> A = new Vector<Integer>();
        int tamano = 30000;
        Random random = new Random();

        for (int i = 0; i < tamano; i++) {

            int accion = random.nextInt(2 + 1) + 1;

            if (accion == 1) {
                numeros.add(random.nextInt(-1 + 30000 + 1) - 30000);
            } else if (accion == 2) {
                A.add((random.nextInt(-1 + 30000 + 1) - 30000));
            }
        }
        for (int i = 0; i < A.size(); i++) {
            contador = false;
            for (int j = 0; j < numeros.size(); j++) {
                if (A.get(i) == numeros.get(j)) {
                    contador = true;
                    break;
                }
            }
            if (contador) {
                System.out.println("Encontrado.");
            } else {
                System.out.println("No encontrado");
            }
        }
    }

    private static void modo_manual_algoritmo2() {

        Scanner lector = new Scanner(System.in);
        Vector<Integer> numeros = new Vector<Integer>();
        Vector<Integer> A = new Vector<Integer>();
        boolean fin = true;

        while (fin) {

            String accion = lector.next();

            if (accion.equals("incluir")) {
                int dato = lector.nextInt();
                numeros.add(dato);
            } else if (accion.equals("buscar")) {
                int dato = lector.nextInt();
                A.add(dato);
            } else if (accion.equals("fin")) {
                fin = false;
            }
        }
        lector.close();
        Collections.sort(numeros);
        for (int i = 0; i < A.size(); i++) {
            if (Collections.binarySearch(numeros, A.get(i)) >= 0) {
                System.out.println("Encontrado.");
            } else {
                System.out.println("No encontrado");
            }
        }
    }

    private static void modo_peor_caso_algoritmo2() {

        Vector<Integer> numeros = new Vector<Integer>();
        Vector<Integer> A = new Vector<Integer>();
        int tamano = 500000;
        Random random = new Random();

        for (int i = 0; i < tamano; i++) {

            int accion = random.nextInt(2 + 1) + 1;
            ;

            if (accion == 1) {
                numeros.add(random.nextInt(-1 + 30000 + 1) - 30000);
            } else if (accion == 2) {
                A.add((random.nextInt(-1 + 30000 + 1) - 30000));
            }
        }
        Collections.sort(numeros);
        for (int i = 0; i < A.size(); i++) {
            if (Collections.binarySearch(numeros, A.get(i)) >= 0) {
                System.out.println("Encontrado.");
            } else {
                System.out.println("No encontrado");
            }
        }
    }
}
