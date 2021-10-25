package proyectocolecciones.ejercicioo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import proyectocolecciones.ejercicioo4.Peliculas;
import proyectocolecciones.ejercicioo4.PeliculaServicio;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Peliculas datos = new Peliculas();
        ArrayList<Peliculas> unificar = new ArrayList();
        String verif;
        do {
            Peliculas Datos_Creados = datos.Crear();
            unificar.add(Datos_Creados);
            System.out.println("¿Desea guardar otra Pelicula?(S/N)");
            verif = leer.next();
            verif = verif.toUpperCase();
        } while (verif.equals("S"));
        unificar.forEach((e) -> System.out.println(e));

        System.out.println("\n<<<<< DATOS PELICULAS >>>>>");
        unificar.forEach((a) -> System.out.println(a));
        System.out.println("\n<<<<< PELICULAS MAYOR 1HORAS >>>>>");
        for (Peliculas aux : unificar) {
            if (aux.getDuracion() > 1) {
                System.out.println("Titulo: " + aux.getTitulos() + " Director: " + aux.getDirector() + " Duración: " + aux.getDuracion() + " horas");
            }
        }
        System.out.println("\n<<<<< DURACION MAYOR A MENOR >>>>>");
        Collections.sort(unificar, PeliculaServicio.OrdDurDesc);
        unificar.forEach((a) -> System.out.println(a));

        System.out.println("\n<<<<< DURACION MENOR A MAYOR >>>>>");
        Collections.sort(unificar, PeliculaServicio.OrdDurAsc);
        unificar.forEach((a) -> System.out.println(a));

        System.out.println("\n<<<<< ORDEN ALFABETICO TITULOS >>>>>");
        Collections.sort(unificar, PeliculaServicio.Ord_Tit);
        unificar.forEach((a) -> System.out.println(a));

        System.out.println("\n<<<<< ORDEN ALFABETICO DIRECTORES >>>>>");
        Collections.sort(unificar, PeliculaServicio.Ord_Direct);
        unificar.forEach((a) -> System.out.println(a));
    }

}
