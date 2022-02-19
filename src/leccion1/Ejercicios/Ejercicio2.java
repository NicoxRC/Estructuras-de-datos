package leccion1.Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
         * Si tengo las edades de cuatro personas (todos
         * números enteros positivos menores o iguales a 100),
         * ¿Cuál es la edad promedio?
         */
        System.out.println("\nEscriba la edad de 4 personas: \n");
        Scanner lector = new Scanner(System.in);

        byte edad1 = lector.nextByte();
        byte edad2 = lector.nextByte();
        byte edad3 = lector.nextByte();
        byte edad4 = lector.nextByte();

        lector.close();

        System.out.println("promedio de edad es: " + (((float) (edad1 + edad2 + edad3 + edad4) / 4)));
    }
}
