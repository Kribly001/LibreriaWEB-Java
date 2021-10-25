/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos
 */
package proyectoherencia.ejercicioo2.principal;

import entidades.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int repeticion = 0;
        int repeticion2 = 0;
        int suma1 = 0;
        Electrodomestico fe = new Electrodomestico();
        ArrayList fin = new ArrayList();
        Lavarropa l = new Lavarropa();
        Televisor t = new Televisor();
        while (repeticion < 2) {
            l.crearLavarropa();
            Lavarropa mostrar = l;
            fin.add(mostrar);
            l.precioFinal();
            System.out.println(l);
            repeticion++;
        }

        while (repeticion2 < 2) {
            t.crearTelevisor();
            Televisor mostrar = t;
            fin.add(mostrar);
            t.precioFinal();
            System.out.println(t);
            repeticion2++;
        }

        System.out.println("El precio total de los televisores es:");
       
    }

}
