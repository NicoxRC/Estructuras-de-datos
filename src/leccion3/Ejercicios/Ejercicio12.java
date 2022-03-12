package leccion3.Ejercicios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        // Despidos masivos

        int caso = 1;
        switch (caso) {
            case 1:
                //O(n^2)
                modo_manual();
                break;
        }
    }

    private static void modo_manual() {

        Scanner lector = new Scanner(System.in);
        LinkedList<Integer> C = new LinkedList<Integer>();
        Iterator<Integer> iterador;
        int N = lector.nextInt();

        for (int i = 0; i < N; i++) {
            C.add(lector.nextInt());
        }

        int cedula = lector.nextInt();
        int K = lector.nextInt();
        int indice = C.indexOf(cedula);
        lector.close();

        while (C.size() != K && cedula != C.getFirst() && cedula != C.getLast()) {
            if (cedula % 2 == 0) {
                cedula = C.get(indice + 1);
                C.remove(indice);
            } else {
                cedula = C.get(indice - 1);
                C.remove(indice);
                indice --;
            }
        }
        iterador = C.listIterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
            }
            
    }
}
