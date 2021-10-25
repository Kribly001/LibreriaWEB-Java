package project1extras;

import java.util.Scanner;

public class Equivalentehorasminutos1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar minutos");
        int minutos, dia, horas;
        dia = 0;
        horas = 0;
        minutos = leer.nextInt();
        if (minutos == 1440) {
            dia = minutos / 1440;
            System.out.println("Es [" + dia + "] dia y [" + horas + "] horas");
        } else {
            if (minutos > 1440) {
                dia = minutos / 1440;
                minutos = minutos - (dia * 1440);
                horas = minutos / 60;
                System.out.println("Es [" + dia + "] dia y [" + horas + "] horas");
            } else{
                horas=minutos/60;
                   System.out.println("Es "+dia+" y "+horas+" hora");
            }
        }
    }

}
