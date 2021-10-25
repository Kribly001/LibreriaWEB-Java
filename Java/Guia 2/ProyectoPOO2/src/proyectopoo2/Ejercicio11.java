package proyectopoo2;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Detectar cuantos años hay entre fechas");

        Date actual = new Date();
        String fechaactual = actual.toString();

        System.out.println("Ingresar año--> mes--> dia");
        int año = leer.nextInt();
        año -= 1900;
        int mes = leer.nextInt();
        mes -= 1;
        int dia = leer.nextInt();
        Date fecha = new Date(año, mes, dia);
        String fechaingresada = fecha.toString();

        System.out.println("---La fecha actual es---");
        System.out.println(fechaactual);
        System.out.println("");
        System.out.println("---Fecha ingresada por usuario---");
        System.out.println(fechaingresada);
        System.out.println("");
        System.out.println("<------------------------->");
        System.out.println("Ingrese 1 para ver la la diferencia de años ");
        int menu = leer.nextInt();
        if (menu == 1) {
            int diferencia_años = actual.getYear() - fecha.getYear();
            System.out.println("Hay " + diferencia_años + " de diferencia de la fecha actual");
        }
    }

}
