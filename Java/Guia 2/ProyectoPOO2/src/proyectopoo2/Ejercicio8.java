package proyectopoo2;

import java.util.Scanner;

import proyectopoo2.ejercicioo8.CadenaServicio;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("---> Ingresar Frase <---");
        CadenaServicio datos = new CadenaServicio();
        datos.cargar(leer.next());
        datos.quedeseahacer();
        int menu = leer.nextInt();
        while (menu > 7 || menu < 1) {
            System.out.println("Ingrese un numero valido porfavor");
            menu = leer.nextInt();
        }
        if (menu >= 1 & menu <= 7) {
            switch (menu) {
                case 1:
                    System.out.println("La cantidad de vocales es : " + datos.Mostrar_Vocales());
                    break;
                case 2:
                    datos.invertirfrase();
                    break;
                case 3:
                    System.out.println("Ingresar caracter a buscar");
                    System.out.println("El caracter se repite " + datos.vecesrepetido(leer.next().toUpperCase()));
                    break;
                case 4:
                    System.out.println("Ingresa frase a comparar");
                    datos.compararlongitud(leer.next());
                    break;
                case 5:
                    System.out.println("Frase a unir --->");
                    datos.unirfrases(leer.next());
                    break;
                case 6:
                    System.out.println("Ingresar Simbolo a cambiar");
                    datos.cambiarletra(leer.next());
                    break;
                case 7:
                    System.out.println("Ingresar letra");
                    datos.Contiene(leer.next());
                    break;
            }
        }
System.out.println("[----Gracias por utilizar mi programa----]");
    }
}
