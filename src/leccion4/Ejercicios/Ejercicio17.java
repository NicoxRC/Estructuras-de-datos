package leccion4.Ejercicios;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        // Turnos en la EPS

        int caso = 1;
        switch (caso) {
            case 1:
                //O(nlogn)
                modo_manual();
                break;
        }
    }

    private static void modo_manual() {
        Scanner lector = new Scanner(System.in);
        PriorityQueue<Integer> turnos = new PriorityQueue<Integer>();
        String ordenes = "";
        int ultimo_turno = 0;

        while (!ordenes.equals("fin_atencion")) {

            ordenes = lector.next();

            if (ordenes.equals("turno")) {
                turnos.add(lector.nextInt());
            } else if (ordenes.equals("siguiente")) {
                if (!turnos.isEmpty()) {
                    ultimo_turno = turnos.poll();
                }
            }
        }
        lector.close();
        System.out.println(ultimo_turno);
    }
}
