package proyectopoo2;

import java.util.Scanner;
import proyectopoo2.ejercicioo1.Libro;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar datos del libro -->ISBN-->TITULO-->AUTOR-->PAGINAS|");
        Libro bb = new Libro();
        bb.ISBN = leer.nextLong();
        bb.titulo = leer.next();
        bb.autor = leer.next();
        bb.paginas = leer.nextInt();

        System.out.println(bb.ISBN + "| |" + bb.titulo + "| |" + bb.autor + "| |" + bb.paginas + "| |");
    }

}
