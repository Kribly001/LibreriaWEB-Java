package proyecto1;

import java.util.Scanner;

public class Ingresatunombre3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombre;
        System.out.println("Ingresa tu nombre y se mostrara debajo");
        nombre = leer.next();
        System.out.println("Su nombre es " + nombre);
    }

}
