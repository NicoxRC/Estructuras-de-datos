package leccion2.Ejercicios;

import java.util.Scanner;
import java.util.Vector;

public class Ejercicio8 {
    public static void main(String[] args) {

        long start2 = System.currentTimeMillis();
        // Serpientes y escaleras
        int caso = 1;
        switch (caso) {
            case 1:
                modo_manual();
                break;
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Tiempo en mili segundos: " + (end2 - start2));
    }

    private static void modo_manual() {
        Scanner lector = new Scanner(System.in);
        //int c = lector.nextInt();
        int x = 0;
        int z = 0;
        int contador = 0;
        boolean end = true;
        boolean end2 = true;
        //Vector<String> respuesta = new Vector<String>();
        while (end2) {
            while (end) {
                contador = 0;
                int n = lector.nextInt();
                Vector<Integer> saltos = new Vector<Integer>();
                for (int i = 0; i < n; i++) {
                    saltos.add(lector.nextInt());
                }
                x = saltos.get(0);
                z = 0;
                while (z != x && z == saltos.size()) {
                        x = saltos.get(x);
                        contador++;

                    if (contador == saltos.size()){
                        break;
                    }
                }
            }
        }
    }
}
