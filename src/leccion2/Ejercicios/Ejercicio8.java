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
        int c = lector.nextInt();
        int x = 0;
        int k = 0;
        boolean fin = true;
        int contador_de_saltos = 0;

        // Vector<String> respuesta = new Vector<String>();

        for (int j = 0; j < c; j++) {
            k = 0;
            contador_de_saltos = 0;
            int n = lector.nextInt();
            int saltos [] = new int [n];
            Vector<Integer> repeticion = new Vector<Integer>();

            for (int i = 0; i < n; i++) {
                saltos[i] = lector.nextInt();
            }

            x = saltos[0];
            repeticion.add(0);

            while (fin){
                if (k >= saltos.length || k < 0){
                    break;
                }else{
                    x = saltos [k];
                    contador_de_saltos++;
                    k += x;
                    if (repeticion.indexOf(k) < 0){
                        repeticion.add(k);
                    }else{
                        break;
                    }
                }
            }
            System.out.println(contador_de_saltos);
        }
    }
}
