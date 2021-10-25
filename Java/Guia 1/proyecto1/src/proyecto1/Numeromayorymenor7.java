package proyecto1;

import java.util.Scanner;

public class Numeromayorymenor7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa dos numeros enteros y se detectara cual es mayor");
        int numero = leer.nextInt();
        int numero2 = leer.nextInt();
        if (numero > numero2) {
            System.out.println("El numero mayor es [" + numero + "]");
        } else if (numero2 > numero) {
            System.out.println("El numero mayor es [" + numero2 + "]");
        }
    }

}
