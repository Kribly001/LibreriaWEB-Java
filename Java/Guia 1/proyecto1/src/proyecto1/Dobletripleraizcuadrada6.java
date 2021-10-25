package proyecto1;

import java.util.Scanner;

public class Dobletripleraizcuadrada6 {

    public static void main(String[] args) {
        System.out.println("Ingresa un numero entero y te dara el doble el triple y la raiz");
        Scanner leer = new Scanner(System.in);
        int numero = leer.nextInt();
        int numero2;
        int numero3;
        int raizcuadrada;
        numero2 = numero + numero;
        System.out.println("El doble de (" + numero + ") es (" + numero2 + ")");
        System.out.println("------------------------------------------------------");

        numero3 = numero + numero + numero;
        System.out.println("El triple de (" + numero + ") es (" + numero3 + ")");
        System.out.println("------------------------------------------------------");

        raizcuadrada = numero;
        System.out.println("La raiz cuadrada de (" + numero +  ") es (" + Math.sqrt(raizcuadrada) + ")");

    }

}
