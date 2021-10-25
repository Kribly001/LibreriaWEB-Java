package proyecto1;

import java.util.Random;
import java.util.Scanner;

public class Contabilizador24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribir tamaño del vector");
        int numero = leer.nextInt();
        Random random = new Random();
        int[] vector = new int[numero];
        for (int i = 0; i < numero; i++) {
            vector[i] = random.nextInt((100000 - 0) + 0);
        }
        System.out.println();
        String aux = "";
        for (int elemento : vector) {
            aux = aux + "[" + elemento + "]";
        }
        System.out.println(aux);
        int digitoa = 0, digitob = 0, digitoc = 0, digitod = 0, digitoe = 0;
        for (int i = 0; i < numero; i++) {
            if (vector[i] < 10) {
                digitoa = digitoa + 1;
            }
            if (vector[i] < 100) {
                digitob = digitob + 1;
            }
            if (vector[i] < 1000) {
                digitoc = digitoc + 1;
            }
            if (vector[i] < 10000) {
                digitod = digitod + 1;
            }
            if (vector[i] < 100000) {
                if (vector[i] > 10000) {
                    digitoe = digitoe + 1;
                }
            }

        }
        System.out.println("La cantidad de numeros de un digito es [" + digitoa + "]");
        System.out.println("La cantidad de numeros de dos digito es [" + digitob + "]");
        System.out.println("La cantidad de numeros de tres digito es [" + digitoc + "]");
        System.out.println("La cantidad de numeros de cuatro digito es [" + digitod + "]");
        System.out.println("La cantidad de numeros de cinco digito es [" + digitoe + "]");
    }
}
