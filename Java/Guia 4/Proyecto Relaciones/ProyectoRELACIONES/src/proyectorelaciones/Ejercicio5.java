package proyectorelaciones;
//private String nombre;
//    private Integer duracion;
//    private Integer edadmin;
//    private String director;

import java.util.Scanner;
import proyectorelaciones.ejercicioo5.Pelicula;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("<-^Bienvenido a nuestro cine^->");
        System.out.println("Nuestras peliculas disponibles son");
        System.out.println("1:");
        System.out.println(Pelicula.PELICULA1.getNombre());
        System.out.println("2:");
        System.out.println(Pelicula.PELICULA2.getNombre());
        System.out.println("3:");
        System.out.println(Pelicula.PELICULA3.getNombre());
        System.out.println("Numero para ver informacion de pelicula");
        int menu = leer.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Nombre:\t" + Pelicula.PELICULA1.getNombre());
                System.out.println("Duracion:\t" + Pelicula.PELICULA1.getDuracion() + " minutos");
                System.out.println("Minimo de edad:\t" + Pelicula.PELICULA1.getEdadmin());
                System.out.println("Director:\t" + Pelicula.PELICULA1.getDirector());
                break;
            case 2:
                System.out.println("Nombre:\t" + Pelicula.PELICULA2.getNombre());
                System.out.println("Duracion:\t" + Pelicula.PELICULA2.getDuracion() + " minutos");
                System.out.println("Minimo de edad:\t" + Pelicula.PELICULA2.getEdadmin());
                System.out.println("Director:\t" + Pelicula.PELICULA2.getDirector());
                break;
            case 3:
                System.out.println("Nombre:\t" + Pelicula.PELICULA3.getNombre());
                System.out.println("Duracion:\t" + Pelicula.PELICULA3.getDuracion() + " minutos");
                System.out.println("Minimo de edad:\t" + Pelicula.PELICULA3.getEdadmin());
                System.out.println("Director:\t" + Pelicula.PELICULA3.getDirector());
                break;
            default:
                System.out.println("Usted ingreso un numero incorrecto");
        }
    }

}
