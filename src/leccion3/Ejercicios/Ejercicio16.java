package leccion3.Ejercicios;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        long start2 = System.currentTimeMillis();
        // Números Capicúa

        int caso = 2;
        switch (caso) {
            case 1:
                modo_manual();
                break;
            case 2:
                modo_peor_caso();
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Tiempo en mili segundos: " + (end2 - start2));
    }

    private static void modo_manual() {

        Scanner lector = new Scanner(System.in);
        Deque<Integer> numeros1 = new LinkedList<Integer>();
        Deque<Integer> numeros2 = new LinkedList<Integer>();
        int N = lector.nextInt();
        for (int i = 0; i < N; i++) {

            int cantidad = lector.nextInt();
            while (cantidad != -1) {
                numeros1.add(cantidad);
                numeros2.addFirst(cantidad);
                cantidad = lector.nextInt();
            }
            int longitud = numeros1.size();
            int contador = 0;
            for (int j = 0; j < longitud; j++) {
                if (numeros1.poll() != numeros2.pollFirst()) {
                    System.out.println("no es capicua");
                    numeros1.clear();
                    numeros2.clear();
                    break;
                } else {
                    contador++;
                }
            }
            if (contador == longitud) {
                System.out.println("es capicua");
                numeros1.clear();
                numeros2.clear();
            }
        }
        lector.close();
    }
    private static void modo_peor_caso(){
        Deque<Integer> numeros1 = new LinkedList<Integer>();
        Deque<Integer> numeros2 = new LinkedList<Integer>();
        int N = 1000;
        Random random = new Random();
        for (int i = 0; i < N; i++) {

            int cantidad = random.nextInt(1000) -1;
            while (cantidad != -1) {
                numeros1.add(cantidad);
                numeros2.addFirst(cantidad);
                cantidad = random.nextInt(1000) -1;
            }
            int longitud = numeros1.size();
            int contador = 0;
            for (int j = 0; j < longitud; j++) {
                if (numeros1.poll() != numeros2.pollFirst()) {
                    numeros1.clear();
                    numeros2.clear();
                    break;
                } else {
                    contador++;
                }
            }
            if (contador == longitud) {
                numeros1.clear();
                numeros2.clear();
            }
        }
    }
}
