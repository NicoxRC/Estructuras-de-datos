package leccion4.Ejercicios;

import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Comparador alfabético

        int caso = 1;
        switch (caso) {
            case 1:
                modo_manual();
                break;
        }
    }
    private static void modo_manual(){
        Scanner lector = new Scanner(System.in);
        LinkedList<String> x = new LinkedList<String>();
        LinkedList<String> y = new LinkedList<String>();
        int c = 0;

        for (int i = 0; i < c; i++) {

            String accion1 = "";

            while(!accion1.equals("#")){
                accion1 = lector.next();
                x.add(accion1);
            }

            String accion2 = "";

            while(!accion2.equals("#")){
                accion2 = lector.next();
                x.add(accion2);
            }

            if (x.size() < y.size()){
                System.out.println("-1");
            }else if(x.size() > y.size()){
                System.out.println("1");
            }else if(x.size() == y.size()){
                for (int j = 0; j < x.size(); j++) {
                    if(x.get(j) == y.get(j)){

                    }
                }
            }
            lector.close();
        }
    }
}
