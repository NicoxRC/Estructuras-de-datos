package leccion1.Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        //La conjetura de Collatz
        
        System.out.println("\nIngrese el numero: \n");
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();
        int resultado = 0;

        while (resultado != 1){
            if (numero % 2 == 0){
                resultado = numero / 2;
            }
            else{
                resultado = 3 * numero + 1;
            }
            numero = resultado;
            System.out.println(resultado);
        }
  
    }
}
