package leccion3.Ejercicios;

import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        // Torres de Hanoi
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
        int c = lector.nextInt();

        for (int i = 0; i < c; i++) {

            LinkedList<Integer> A = new LinkedList<Integer>();
            LinkedList<Integer> B = new LinkedList<Integer>();
            LinkedList<Integer> C = new LinkedList<Integer>();
            int total = lector.nextInt();
            int error = 0;

            for (int j = 0; j < total; j++) {
                A.add(j);
            }
            while (true) {

                String P = lector.next();
                String Q = lector.next();

                if (P.equals("A") && Q.equals("B")) {
                    if (B.isEmpty()) {
                        B.addFirst(A.getFirst());
                        A.removeFirst();
                    } else if (B.getFirst() > A.getFirst()) {
                        B.addFirst(A.getFirst());
                        A.removeFirst();
                    } else {
                        B.addFirst(A.getFirst());
                        A.removeFirst();
                        error = 1;
                    }
                } else if (P.equals("A") && Q.equals("C")) {
                    if (C.isEmpty()) {
                        C.addFirst(A.getFirst());
                        A.removeFirst();
                    } else if (C.getFirst() > A.getFirst()) {
                        C.addFirst(A.getFirst());
                        A.removeFirst();
                    } else {
                        C.addFirst(A.getFirst());
                        A.removeFirst();
                        error = 1;
                    }
                } else if (P.equals("B") && Q.equals("A")) {
                    if (A.isEmpty()) {
                        A.addFirst(B.getFirst());
                        B.removeFirst();
                    } else if (A.getFirst() > B.getFirst()) {
                        A.addFirst(B.getFirst());
                        B.removeFirst();
                    } else {
                        A.addFirst(B.getFirst());
                        B.removeFirst();
                        error = 1;
                    }
                } else if (P.equals("B") && Q.equals("C")) {
                    if (C.isEmpty()) {
                        C.addFirst(B.getFirst());
                        B.removeFirst();
                    } else if (C.getFirst() > B.getFirst()) {
                        C.addFirst(B.getFirst());
                        B.removeFirst();
                    } else {
                        C.addFirst(B.getFirst());
                        B.removeFirst();
                        error = 1;
                    }
                } else if (P.equals("C") && Q.equals("A")) {
                    if (A.isEmpty()) {
                        A.addFirst(C.getFirst());
                        C.removeFirst();
                    } else if (A.getFirst() > C.getFirst()) {
                        A.addFirst(C.getFirst());
                        C.removeFirst();
                    } else {
                        C.addFirst(B.getFirst());
                        B.removeFirst();
                        error = 1;
                    }
                } else if (P.equals("C") && Q.equals("B")) {
                    if (B.isEmpty()) {
                        B.addFirst(C.getFirst());
                        C.removeFirst();
                    } else if (B.getFirst() > C.getFirst()) {
                        B.addFirst(C.getFirst());
                        C.removeFirst();
                    } else {
                        B.addFirst(C.getFirst());
                        C.removeFirst();
                        error = 1;
                    }
                } else if (P.equals("X") && Q.equals("X")) {
                    break;
                }
            }
            if (error > 0) {
                System.out.println("Secuencia invalida");
            } else {
                if (C.size() == total) {
                    System.out.println("soluciona la torre");
                } else {
                    System.out.println("no soluciona la torre");
                }
            }
        }
        lector.close();
    }
}
