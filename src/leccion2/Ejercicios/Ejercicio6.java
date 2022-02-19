package leccion2.Ejercicios;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Ejercicio6 {
    public static void main(String[] args) {
        long start2 = System.currentTimeMillis();
        // Dime quien eres y te diré en que índice estas
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
        int x = 0;
        int y = 0;
        Vector<Integer> numeros = new Vector<Integer>();
        Vector<Integer> A = new Vector<Integer>();
        boolean fin = true;
        int dato = 0;

        while (fin) {
            //Eficiencia O(N^2 + M)

            String accion = lector.next();

            if (accion.equals("entra")) {
                dato = lector.nextInt();
                numeros.add(dato);
            } else if (accion.equals("sale")) {
                dato = lector.nextInt();
                y = numeros.indexOf(dato);
                if (y >= 0) {
                    numeros.removeElementAt(y);
                }
            } else if (accion.equals("donde")) {
                dato = lector.nextInt();
                x = numeros.lastIndexOf(dato);
                if (x > 0) {
                    A.add(x);
                } else {
                    A.add(-1);
                }
            } else if (accion.equals("fin")) {
                fin = false;
            }
        }
        lector.close();
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == -1) {
                System.out.println("No esta");
            } else {
                System.out.println(A.get(i));
            }
        }
    }

    private static void modo_peor_caso() {

        int x = 0;
        int y = 0;
        Vector<Integer> numeros = new Vector<Integer>();
        Vector<Integer> A = new Vector<Integer>();
        int tamano = 2000;
        Random random = new Random();

        for (int i = 0; i < tamano; i++) {

            int accion = random.nextInt(3 + 1) + 1;

            if (accion == 1) {
                numeros.add(random.nextInt(1000 + 1) + 1);
            } else if (accion == 2) {
                y = numeros.indexOf(random.nextInt(1000 + 1) + 1);
                if (y >= 0) {
                    numeros.removeElementAt(y);
                } 
            }else if (accion == 3) {
                x = numeros.lastIndexOf(random.nextInt(1000 + 1) + 1);
                if (x > 0) {
                    A.add(x);
                } else {
                    A.add(-1);
                }
            }
        }

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == -1) {
                System.out.println("No encontrado.");
            } else {
                System.out.println(A.get(i));
            }
        }
    }
}
