package leccion1.Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
         * Dado un número entero N en el rango [1, 10000],
         * se debe mostrar 2*N si N es par, o
         * 3*N en caso contrario.
         */
        System.out.println("\nIngrese un numero: \n");
        Scanner lector = new Scanner(System.in);
        int a = lector.nextInt();

        if (a % 2 == 0){
            System.out.println(a*2);
        }
        else{
            System.out.println(a*3);
        }
    }

}
