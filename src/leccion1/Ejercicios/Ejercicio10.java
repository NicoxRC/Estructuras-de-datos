package leccion1.Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        // determinado número entero positivo es primo o no
        System.out.println("\nIngrese el numero: \n");
        Scanner lector = new Scanner(System.in);
        int cantidad = lector.nextInt();
        int vector[] = new int[cantidad];
        int contador = 0;
        System.out.println("\nIngrese los numeros: \n");
        for (int i = 0; i < vector.length; i++) {
            int numeros = lector.nextInt();
            vector[i] = numeros;
        }
        for (int i = 0; i < vector.length; i++) {
            contador = 0;
            for (int j = 1; j <= vector[i] ; j++) {
                if (vector[i] % j == 0){
                    contador++;
                }
            }
            if (contador <= 2){
                System.out.println("Primo.");
            }
            else{
                System.out.println("No es primo.");
            }
        }
    }
}
