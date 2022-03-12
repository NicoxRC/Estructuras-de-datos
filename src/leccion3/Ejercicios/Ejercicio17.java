package leccion3.Ejercicios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        // Compilador

        int caso = 1;
        switch (caso) {
            case 1:
                modo_manual();
                break;
        }
    }

    private static void modo_manual() {

        Scanner lector = new Scanner(System.in);
        LinkedList<String> A = new LinkedList<String>();
        Iterator<String> iterador;
        String vector1[] = { "(", "[", "{" };
        String vector2[] = { ")", "]", "}" };
        String y = "";
        int n = lector.nextInt();
        int comprobador = 0;

        for (int i = 0; i < n; i++) {
            while (true) {

                String x = lector.next();

                if (x.equals("(")) {
                    A.add(x);
                } else if (x.equals(")")) {
                    A.add(x);
                } else if (x.equals("[")) {
                    A.add(x);
                } else if (x.equals("]")) {
                    A.add(x);
                } else if (x.equals("{")) {
                    A.add(x);
                } else if (x.equals("}")) {
                    A.add(x);
                } else if (x.equals(";")) {
                    break;
                }
            }
            iterador = A.listIterator();
            while (iterador.hasNext()) {
                y = iterador.next();
                for (int j = 0; j < vector1.length; j++) {
                    if (y.equals(vector1[j])) {
                        comprobador = j;
                        break;
                    } else if (y.equals(vector2[comprobador])) {
                        if (comprobador == 0) {
                            A.removeFirst();
                            A.remove(comprobador + 1);
                            iterador = A.listIterator();
                        }else{
                            A.remove(comprobador);
                            A.remove(comprobador + 1);
                            comprobador =- 1;
                            iterador = A.listIterator();
                        }
                    }
                }
            }
            if (A.isEmpty()) {
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
        }
        lector.close();
    }
}
