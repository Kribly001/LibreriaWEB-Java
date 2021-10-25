package proyectocolecciones.ejercicioo4;

import java.util.Scanner;
import proyectocolecciones.ejercicioo5.Paises;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Paises jj = new Paises();
        jj.guardarpais();
        jj.mostrar();
        jj.borrar();
    }

}
