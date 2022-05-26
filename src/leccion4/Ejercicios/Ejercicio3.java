package leccion4.Ejercicios;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Soporte de facturas

        int caso = 1;
        switch (caso) {
            case 1:
            //O(nlogn)
                modo_manual();
                break;
        }
    }
    private static void modo_manual(){
        Scanner lector = new Scanner(System.in);
        TreeSet<Integer> facturas = new TreeSet<Integer>();
        String ordenes = "";
        int factura_si = 0;
        int llamadas = 0;
        

        while(!ordenes.equals("fin")){

            ordenes = lector.next();

            if (ordenes.equals("ingresa")){
                facturas.add(lector.nextInt());
            }else if(ordenes.equals("borra")){
                facturas.remove(lector.nextInt());
            }else if(ordenes.equals("soporte")){
                boolean soporte = facturas.contains(lector.nextInt());
                llamadas++;
                if(soporte){
                    factura_si++;
                }
            }
        }
        lector.close();
        System.out.println(factura_si + "/" + llamadas);
    }
}
