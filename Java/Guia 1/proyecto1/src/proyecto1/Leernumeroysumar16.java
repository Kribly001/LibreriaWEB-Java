package proyecto1;

import java.util.Scanner;

public class Leernumeroysumar16 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int contador = 0;
        int suma = 0;
        int numero;
        while (contador < 20) {
            contador += 1;
            System.out.println(" Ingrese un numero ");
            numero = leer.nextInt();
            if (numero == 0) {
                System.out.println(" Se capto el numero 0 ");
                break;
            }
            {
                if (numero > 0) {
                    suma += numero;
                }
            }
        }
        System.out.println(" La suma total es: " + suma);
    }
}
