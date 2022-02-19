package leccion1.Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*
         * Ya todos conocemos el ultra famoso “Hola mundo”, o su
         * versión en inglés “Hello world”. ¿Qué tal si hacemos una pequeña
         * variación y complicados el asunto? La idea es que dado un entero positivo N
         * en el rango [1, 10000] se alternen esos mensajes: una vez en español,
         * la siguiente en inglés, la siguiente en español, y así sucesivamente hasta
         * mostrar N mensajes
         */

        System.out.println("\nIngrese un numero: \n");
        Scanner lector = new Scanner(System.in);
        int num = lector.nextInt();
        lector.close();

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                System.out.println("Hola mundo");
            } else {
                System.out.println("Hello world");
            }
        }
    }
}
