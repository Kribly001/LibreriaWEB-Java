package proyecto1;

import java.util.Scanner;

public class Crearmenu15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String confirma = "";
        do {
            System.out.println("Ingresar dos numeros enteros y decide que quieres hacer");
            System.out.println("Ingresar numeros");
            int numero1 = leer.nextInt();
            int numero2 = leer.nextInt();
            System.out.println(" Ingrese segun el numero lo que desea hacer");
            System.out.println("1_Sumar +");
            System.out.println("2_Restar -");
            System.out.println("3_Multiplicar *");
            System.out.println("4_Dividir /");
            System.out.println("5_Salir");
            int menu = leer.nextInt();
            int cases1 = numero1 + numero2;
            int cases2 = numero1 - numero2;
            int cases3 = numero1 * numero2;
            int cases4 = numero1 / numero2;
            switch (menu) {
                case 1:
                    System.out.println("La suma es [" + cases1 + "] ");
                    break;
                case 2:
                    System.out.println("La resta es [" + cases2 + "] ");
                    break;
                case 3:
                    System.out.println("La multiplicacion es [" + cases3 + "] ");
                    break;
                case 4:
                    System.out.println("La division es [" + cases4 + "] ");
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa S/N?");
                    confirma = leer.next();
                    break;
                default:
                    System.out.println("Numero incorrecto");
                    break;
            }
        } while (!"S".equals(confirma));

    }

}
