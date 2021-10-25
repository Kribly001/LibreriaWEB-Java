package proyecto1;

import java.util.Scanner;

public class Numerosyasteriscos20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar numero del 1 al 20 y se rellenara con asteriscos");
        int num1, num2, num3, num4;
        System.out.println("Ingresar 4 numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();
        num4 = leer.nextInt();
        int i, j, cambio;
        cambio = num1;
        System.out.println("Representacion:");
        for (i = 0; i < 4; i++) {
            System.out.print("" + cambio);
            for (j = 0; j < cambio; j++) {
                System.out.print("*");
            }
            System.out.println("");
            switch (i) {
                case 0:
                    cambio = num2;
                    break;
                case 1:
                    cambio = num3;
                    break;
                case 2:
                    cambio = num4;
                    break;

            }
        }

    }
}
