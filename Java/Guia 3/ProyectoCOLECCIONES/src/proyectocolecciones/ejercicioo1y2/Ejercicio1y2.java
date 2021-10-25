package proyectocolecciones.ejercicioo1y2;

import java.util.Scanner;
import proyectocolecciones.ejercicioo1y2.Razass;

public class Ejercicio1y2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Razass mm = new Razass();
        mm.guardarraza();
        mm.mostrarrazas();
        System.out.println("Presione [1] para eliminar una raza o cualquier numero para salir del programa");
        int menu = leer.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Ingresar raza a eliminar");
                mm.eliminarraza(leer.next());
            default:
                System.out.println("Finalizado");

        }
    }

}
