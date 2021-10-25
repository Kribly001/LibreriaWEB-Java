package proyectocolecciones.ejercicioo5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import java.util.Scanner;
import java.util.TreeSet;

public class Paises {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private TreeSet<String> pais;

    public Paises() {
        this.pais = new TreeSet();

    }

    public void guardarpais() {
        int respuesta;
        do {
            System.out.println("Ingresar pais");
            String aux = leer.next();
            String mostrar = aux;
            pais.add(mostrar);
            System.out.println("Desea ingresar otro pais? 1=SI 2=NO");
            respuesta = leer.nextInt();
        } while (respuesta == 1);
    }

    public void mostrar() {
        System.out.println("--Los paises agregados son--");
        System.out.println(pais);
        System.out.println("\n<<<<< PAISES ORDENADO ALFABETICAMENTE >>>>>");
        ArrayList<String> orden = new ArrayList(pais);
        Collections.sort(orden);
        System.out.println(orden);

    }

    public void borrar() {
        System.out.println("\n<<<<< BORRAR PAISES >>>>>");
        String borrar = leer.next();

        Iterator<String> it = pais.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(borrar)) {
                it.remove();
            }
        }

        if (pais.contains(borrar)) {
            System.out.println("El Pais ingresado no se encuentra");
        } else {
            System.out.println("Pais Borrado");
        }

        System.out.println(pais);
        System.out.println("");

    }
}
