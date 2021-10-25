package proyectopooextras;

import java.util.Scanner;
import proyectopooextras.ejercicioo3.Raices;
import proyectopooextras.ejercicioo3.RaicesServicio;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        RaicesServicio datos = new RaicesServicio();
        Raices R = datos.crearnumeros();
        System.out.println(R);
        System.out.println("Valor Descriminante: " + datos.discriminante());
        System.out.println("Tiene Raices?: " + datos.tieneraices());
        System.out.println("Tiene Raiz?: " + datos.tieneraiz());
        datos.obtenerraices();
        datos.obtenerraiz();
        datos.Calcular();

    }

}
