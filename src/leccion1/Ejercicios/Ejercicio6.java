package leccion1.Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        /*
         * ¿Sabes que los cuatro primeros números primos (sin contar al 1) son 2, 3, 5,
         * y 7
         * verdad? Bueno, pues la idea es que dado un número entero positivo se debe
         * decir si es
         * múltiplo de alguno de esos cuatro o si no es múltiplo de ninguno. En caso que
         * sea
         * múltiplo de más de uno de ellos solo se debe mencionar al menor (por ejemplo
         * el 210
         * es múltiplo de todos, entonces se debería mostrar “es múltiplo de 2”).
         */

        System.out.println("\nIngrese un numero: \n");
        Scanner lector = new Scanner(System.in);
        int num1 = lector.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("Es multiplo de 2.");
        }
        else if (num1 % 3 == 0) {
            System.out.println("Es multiplo de 3.");
        }
        else if (num1 % 5 == 0) {
            System.out.println("Es multiplo de 5.");
        }
        else if (num1 % 7 == 0) {
            System.out.println("Es multiplo de 7.");
        }
        else{
            System.out.println("No es multiplo de ningun.");
        }
    }
}
