package leccion1;

import java.util.Scanner;

public class Sesion2 {
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
        int numero = Lector.nextInt();
        // ejemplo
        // si la entrada es 5 la respuesta es 15
        for (int i = numero - 1; i >= 0; i--) {
            numero = numero + i;
            System.out.println("i" + (i));
        }
        System.out.println(numero);
        /*
         * numero = 9
         * numero = 12
         * numero = 14
         * numero = 15
         */

        // ejemplo 2
        /*
         * Habiendo comprendido el concepto de la notación Big O,
         * diseñe un algoritmo en java para leer n (entero y 1 ≤ n ≤
         * 1000) y luego leer n números enteros positivos no mayores a
         * un millon y mostrar cuál es el mayor de todos, luego
         * determine cuál es su eficiencia.
         */

        System.out.println("Ingrese la cantidad de numeros: ");
        int n = Lector.nextInt();
        int listaN[] = new int[n];
        int mayor = 0;
        System.out.println("Ingrese los numero: ");
        for (int i = 0; i < listaN.length; i++) {
            int n2 = Lector.nextInt();
            listaN[i] = n2;
        }
        for (int i = 0; i < listaN.length; i++) {
            if (listaN[i] > mayor) {
                mayor = listaN[i];
            }
        }
        System.out.println("El numero mayor es: " + mayor);

        //explicar ejercicios 9 y 10 
    }
}