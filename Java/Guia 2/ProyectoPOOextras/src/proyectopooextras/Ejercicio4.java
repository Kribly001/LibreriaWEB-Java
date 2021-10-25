package proyectopooextras;

import java.util.Scanner;
import proyectopooextras.ejercicioo4.NifServicios;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        NifServicios mm = new NifServicios();
        System.out.println("------El programa detectara su NIF------");
        mm.crearNif();
        mm.mostrarNif();
        System.out.println("------Programa finalizado------");
    }

}
