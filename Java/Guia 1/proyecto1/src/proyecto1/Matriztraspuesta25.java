package proyecto1;

import java.util.Scanner;
import java.util.Random;

public class Matriztraspuesta25 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Este programa creara una matriz aleatoria y la pasara a traspuesta");
        System.out.println("Ingrese [S] para comenzar");
        String confirma="";
        confirma=leer.next();
        confirma = confirma.toUpperCase();
        if ("S".equals(confirma)){    
        System.out.println("Matriz original");
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt((100 - 0) + 0);
            }

        }
        String respuesta = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                respuesta = respuesta + "[" + matriz[i][j] + "]";
            }
            respuesta = respuesta + "\n";
        }
        System.out.println(respuesta);
        System.out.println("");
        System.out.println("Matriz traspuesta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
            }

        }
        String respuesta2 = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                respuesta2 = respuesta2 + "[" + matriz[j][i] + "]";
            }
            respuesta2 = respuesta2 + "\n";
        }
        System.out.println(respuesta2);
    
   }
    else if (!"S".equals(confirma)){
    System.out.println("No introdujo [S]");
    }  
    }
}