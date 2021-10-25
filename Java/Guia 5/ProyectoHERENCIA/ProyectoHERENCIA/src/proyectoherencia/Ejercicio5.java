package proyectoherencia;

import java.util.Scanner;
import proyectoherencia.ejercicioo5.BarcoServicio;
import proyectoherencia.ejercicioo5.Barcotipo1;
import proyectoherencia.ejercicioo5.Persona;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona pp = new Persona();
        System.out.println("♦♦Bienvenido cliente♦♦");
        System.out.println("Para alquilar un amarre de barco porfavor ingrese sus datos↓↓");
        pp.datoss();
        pp.alquiler();
        System.out.println("Fecha de devolucion→");
        pp.devolucion();
        System.out.println("Posicion del amarre (derecho o izquierdo)→");
        pp.posicionamarre(leer.next());
        System.out.println("¿Que tipos es su barco?");
         BarcoServicio Barcotipo1 = new Barcotipo1(1,8000,null,2);
        Barcotipo1.mostrar();
        System.out.println("Barco elegido→");
        System.out.println(pp.getFechaalq());
    }

}
