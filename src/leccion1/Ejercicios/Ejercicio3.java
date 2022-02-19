package leccion1.Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner lector6 = new Scanner(System.in);
        int caso = lector6.nextInt();
        /*
         * Dado un número entero de cuatro dígitos, es decir en el rango [1000, 9999],
         * se debe mostrar la suma de sus cuatro dígitos.
         */
        switch (caso) {
            case 1:
                // version inicial
                System.out.println("\nIngrese un numero de 4 digitos: \n");
                Scanner lector = new Scanner(System.in);
                int numero = lector.nextInt();

                int resta1 = numero % 1000;
                int a = numero - resta1;
                a = a / 1000;

                int resta2 = numero % 100;
                int b = numero - resta2;
                b = b % 1000;
                b = b / 100;

                int d = numero % 10;
                int c = numero - d;
                c = c % 100;
                c = c / 10;

                System.out.println(a + b + c + d);
                break;
            case 2:
                // version inicial mejorada
                System.out.println("\nIngrese un numero de 4 digitos: \n");
                Scanner lector2 = new Scanner(System.in);
                int numero2 = lector2.nextInt();

                int resta_1 = numero2 % 1000;
                int a1 = numero2 - resta_1;
                a1 = a1 / 1000;

                int resta_2 = resta_1 % 100;
                int b1 = resta_1 - resta_2;
                b1 = b1 / 100;

                int d1 = resta_2 % 10;
                int c1 = resta_2 - d1;
                c1 = c1 / 10;

                System.out.println(a1 + b1 + c1 + d1);

                break;
            case 3:
                // Version con string
                System.out.println("\nIngrese un numero de 4 digitos: \n");
                Scanner lector3 = new Scanner(System.in);
                int numero3 = lector3.nextInt();

                String numero_convertido = Integer.toString(numero3);
                int w = Character.getNumericValue(numero_convertido.charAt(0));
                int x = Character.getNumericValue(numero_convertido.charAt(1));
                int y = Character.getNumericValue(numero_convertido.charAt(2));
                int z = Character.getNumericValue(numero_convertido.charAt(3));
                System.out.println(w + x + y + z);

                break;
        }
        lector6.close();
    }
}
