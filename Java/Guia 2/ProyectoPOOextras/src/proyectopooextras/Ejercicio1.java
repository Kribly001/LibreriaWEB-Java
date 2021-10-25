package proyectopooextras;

import java.util.Scanner;
import proyectopooextras.ejercicioo1.Cancion;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("--||Bienvenidos cantante||--");
        Cancion mm = new Cancion();
        mm.Cargar();
        System.out.println(mm);
    }

}
