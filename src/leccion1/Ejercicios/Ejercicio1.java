package leccion1.Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
         * dado un número entero N en el rango [-100,
         * 100], mostrar su cuadrado.
         */
        System.out.println("\nEscriba un numero: \n");
        Scanner lector = new Scanner(System.in);
        byte numero = lector.nextByte();
        System.out.println(numero * numero);
        lector.close();

    }
}