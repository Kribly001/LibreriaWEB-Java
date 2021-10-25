package proyectocolecciones.ejercicioo3;

import java.util.ArrayList;
import java.util.Scanner;
import proyectocolecciones.ejercicioo3.Alumno;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Alumno datos = new Alumno();
        ArrayList<Alumno> unificar = new ArrayList();
        String verif;
        do {
            Alumno Datos_Creados = datos.Crear();
            unificar.add(Datos_Creados);
            System.out.println("¿Desea guardar otro alumno?(S/N)");
            verif = leer.next();
        } while (verif.equals("S"));
        unificar.forEach((a) -> System.out.println(a));

        System.out.println("<<<<< PROMEDIOS >>>>>");
        System.out.println("Ingrese el Nombre:");
        String Name = leer.next();
        double Promedio = 0;
        for (Alumno aux : unificar) {
            if (Name.equals(aux.getNombre())) {
                Promedio = aux.notaFinal(Name);
            }
        }
        System.out.println("Promedio:" + Promedio);
    }

}
