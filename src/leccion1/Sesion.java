package leccion1;

import java.util.Scanner;

public class Sesion {
    public static void main(String[] args) {
        // declaracion de variables
        byte a = 7;
        byte c = 8;
        /*
         * comentarios
         * largos
         */
        // declaracion de strings
        String b = "hola";
        System.out.println(b);
        // casteo entre variables
        byte d = (byte) (a * c);
        System.out.println(d);

        System.out.println("a * c = " + a * c);
        System.out.println("a + c = " + (a + c));

        // scanner = input en python
        Scanner lector = new Scanner(System.in);
        byte lectura = lector.nextByte();
        System.out.println(lectura + " " + a + " " + c);

        // condicionales
        if (a == c) {
            System.out.println("je");
        } else if (a != c) {
            System.out.println("ji");
        } else {
            System.out.println("ja");
        }
        // and = && \ or = || \ modulo = %

    }
}
