package leccion3.Ejercicios;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        // El juego de las escaleras
        int caso = 1;

        switch (caso) {
            case 1:
                //O(n)
                modo_manual();
                break;
        }
    }

    private static void modo_manual() {

        Scanner lector = new Scanner(System.in);
        Deque<Integer> posiciones = new LinkedList<Integer>();
        String accion = "";

        while (!accion.equals("terminamos")) {

            accion = lector.next();

            if (accion.equals("sube")) {

                posiciones.addFirst(lector.nextInt());

            } else if (accion.equals("baja")) {
                posiciones.pollFirst();
            }
        }
        lector.close();

        while (true) {
            if (posiciones.isEmpty()) {
                break;
            } else {
                System.out.println(posiciones.pollLast());
            }
        }
    }
}
