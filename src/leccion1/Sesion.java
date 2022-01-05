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
        System.out.println("\nDeclaracion de variables\n");
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
        System.out.println("\ncondicionales if\n");
        if (a == c) {
            System.out.println("je");
        } else if (a != c) {
            System.out.println("ji");
        } else {
            System.out.println("ja");
        }
        // and = && \ or = || \ modulo = %
        byte i = 0;
        System.out.println("\ncondicionales switch\n");
        switch (i) {
            case 1:
                System.out.println("i es 3");
                break;
            case 4:
                System.out.println("i es 4");
                break;

            default:
                System.out.println("es otra cosa");
                break;
        }

        // ciclos
        System.out.println("\nciclos for\n");
        for (i = 0; i <= 5; i = (byte) (i + 1)) {
            System.out.println("5" + i);
        }

        byte j = 0;
        for (i = 0; i <= 5; i++) {
            System.out.println("imprimiendo con ++: " + (j++));
            System.out.println("imprimiendo sin ++: " + (j = (byte) (j + 1)));
        }

        // Otros operadores atajo: --, +=, -=, *=, /=.
        System.out.println("\nciclos while\n");
        int x = 2;
        while (i < 10) {
            System.out.println("Imprimiendo con +=: " + (x += 3));
            System.out.println("Imprimiendo con *=: " + (x *= 2));
            i++;
        }
        x = 0;
        while (true) {
            if (x > 4)
                break;
            else
                x++;
            System.out.println(x);
        }
        // vectores/arreglos estaticos
        System.out.println("\nVectores\n");
        float vector[] = new float[5];
        // For(range) = python
        for (int k = 0; k < vector.length; k++) {
            vector[k] = (float) (k + 0.5);
        }
        for (int k = 0; k < vector.length; k++) {
            System.out.println(vector[k]);
        }
        int vector1[] = {1, 2, 3, 4, 5, 6};
        //for normal python
        for (int k : vector1) {
            System.out.println(k);
        }
    }
}