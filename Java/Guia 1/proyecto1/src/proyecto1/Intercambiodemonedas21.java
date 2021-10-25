package proyecto1;

import java.util.Scanner;

public class Intercambiodemonedas21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double libras, yanes, dolares;
        double euro = 1;
        double ayuda1 = 0.86;
        double ayuda2 = 129.852;
        double ayuda3 = 1.28611;
        System.out.println("Este programa tranformara valores en €");
        System.out.println("Ingresar cantidad de euros");
        euro = leer.nextInt();
        System.out.println("L:para euros a libras");
        System.out.println("$:para euros a dolares");
        System.out.println("Y:para euros a yanes");
        System.out.println("Ingresa que desea tranformar");
        String menu = leer.next();
        menu = menu.toUpperCase();
        libras = euro * ayuda1;
        yanes = euro * ayuda2;
        dolares = euro * ayuda3;
        switch (menu) {
            case "L":
                System.out.println("La cantidad de Libras es");
                System.out.println(libras);
                break;
            case "Y":
                System.out.println("La cantidad de Yanes es");
                System.out.println(yanes);
                break;
            case "$":
                System.out.println("La cantidad de Dolares es");
                System.out.println(dolares);
                break;
        }

    }
}
