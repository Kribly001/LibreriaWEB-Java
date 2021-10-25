
package proyecto1;

import java.util.Scanner;

public class Sumaenteros2 {

    public static void main(String[] args) {
        System.out.println("Ingresa dos numero y se sumaran");
        Scanner leer = new Scanner(System.in);
        int numero = leer.nextInt();
        int numero2 = leer.nextInt();
        int resultado = numero + numero2;
        System.out.println("La suma de los numeros es " + resultado);
    }

    private static class scanner {

        public scanner() {
        }
    }

}
