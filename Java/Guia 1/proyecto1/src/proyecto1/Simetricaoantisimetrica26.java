
package proyecto1;

import java.util.Random;
import java.util.Scanner;


public class Simetricaoantisimetrica26 {

    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        System.out.print("Ingrese el tamaño de la matriz:");
        int tam=leer.nextInt();
        System.out.println("Ingrese los elementos de la Matriz");
        int[][] matriz = new int[tam][tam];
        int[][] traspuesta = new int[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print("M["+i+"]["+j+"]:");
                matriz[i][j]=leer.nextInt();
            }
        }

        System.out.println("Matriz Generado");

        for (int[] fila : matriz) {
            String aux = "";
            for (int elemento : fila) {
                aux = aux + " " + elemento;
            }
            System.out.println(aux);
        }
       
        System.out.println("Matriz Traspuesta");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
               traspuesta[i][j]=matriz[j][i];
            }
        }
        
        for (int[] fila :traspuesta ) {
            String aux = "";
            for (int elemento : fila) {
                aux = aux + " " + elemento;
            }
            System.out.println(aux);
        }
       int b=0;
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
               if((-1*matriz[i][j])!=(traspuesta[i][j]))
               {
                   b=1;
                   break;}
            }
        }
        
        if(b==0)
        {
            System.out.println("Es Antisimetrica");
        }
        else
        {
            System.out.println("No es Antiimtrica");
        }
        
        
        
        
    }
    
}  
    
    

