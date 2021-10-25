package proyectopoo2;

import java.util.Scanner;
import proyectopoo2.ejercicioo5.Cuenta;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int menu;
        Cuenta jj = new Cuenta(0, 0, 0, 0);
        System.out.println("Bienvenido");
        System.out.println("----------------------");
        jj.crearcuenta();
        System.out.println("---Que desea hacer---");
        jj.opciones();
        menu = leer.nextInt();
        switch (menu) {
            case 1:
                jj.ingresar();
                break;
            case 2:
                jj.retirar();
                break;
            case 3:
                System.out.println("Ingrese monto a retirar");
                jj.extraccionrapida(leer.nextDouble());
                break;
            case 4:
                jj.consultarsaldo();
                break;
            case 5:
                jj.consultardatos();
                break;
        }
        System.out.println("----------------------");
        System.out.println("$ Gracias por utilizar nuestro banco $");
    }

}
