package leccion1.Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        // encontrar las potencias enteras positivas del número A que sean menores o
        // iguales a B.

        System.out.println("Ingrese el numero y y el limite: ");
        Scanner lector = new Scanner(System.in);
        int base = lector.nextInt();
        int expo = lector.nextInt();
        int resultado = 0;
        for (int i = 1; i < expo; i++) {
            resultado = base*i;
            if (resultado <= expo){
                System.out.println(resultado);
            }
        }
    }
}
