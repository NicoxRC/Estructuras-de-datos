package leccion1.Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        /*
         * Pero ¿qué tal si lo que queremos no es el cubo de un número
         * sino la suma de todos los cubos desde el cubo de 1
         * hasta el cubo de ese número?
         */

        System.out.println("\nIngrese un numero: \n");
        Scanner lector = new Scanner(System.in);
        int num = lector.nextInt();
        int numero1 = 0;
        lector.close();

        for (int i = 0; i <= num; i++) {
            numero1 += (i * i * i);
        }
        System.out.println(numero1);
    }
}
