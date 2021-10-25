package proyectocolecciones.ejercicioo1y2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Razass {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<String> razas;

    public Razass() {
        this.razas = new ArrayList();
    }

    public void guardarraza() {
        int respuesta;
        do {
            System.out.println("Ingresar raza");
            String raza = leer.next();
            String mostrar = raza;
            razas.add(mostrar);
            System.out.println("Desea ingresar otra raza? 1=SI 2=NO");
            respuesta = leer.nextInt();
        } while (respuesta == 1);
    }

    public void mostrarrazas() {
        System.out.println("--Las razas guardadas son--");
        for (String aux : razas) {
            System.out.println(aux);
        }
        System.out.println("Cantidad: " + razas.size());
    }

    public void eliminarraza(String raza) {

        Iterator<String> it = razas.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(raza)) {
                it.remove();
                System.out.println("-----Razas restante-----");
                razas.forEach((e) -> System.out.println(e));
            }
        }

    }
}
