package proyecto1;

import java.util.Random;
import java.util.Scanner;

public class VectortamañoENPROCESO23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingresar tamaño del vector");
        int tamaño;
        tamaño = leer.nextInt();
        int[] vector = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            vector[i] = random.nextInt((100 - 0) + 0);
        }
        System.out.println();
        String aux="";
        for (int elemento : vector)
        {
            aux=aux+"["+ elemento +"]";
        }
    System.out.println(aux);

    }


}


