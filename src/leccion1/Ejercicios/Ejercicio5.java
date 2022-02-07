package leccion1.Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
         * Dados tres números enteros, cada uno en el rango [-10000, 10000],
         * se debe mostrar cuál es el mayor de todos.
         */
        System.out.println("\nIngrese 3 numeros: \n");
        Scanner lector = new Scanner(System.in);
        int num1 = lector.nextInt();
        int num2 = lector.nextInt();
        int num3 = lector.nextInt();

        /*
         * con funcion.
         * int d = Math.max(num1, Math.max(num2, num3));
         * System.out.println(d);
         */

        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println("El numero mayor es: " + num1);
            } else {
                System.out.println("El numero mayor es: " + num3);
            }
        } else {
            if (num2 >= num3) {
                System.out.println("El numero mayor es: " + num2);
            } else {
                System.out.println("El numero mayor es: " + num3);
            }
        }
    }

}
