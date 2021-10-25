package proyectopooextras.ejercicioo4;

import java.util.Scanner;

public class NifServicios {

    Nif datos = new Nif();

    public void crearNif() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar dni");
        datos.setDNI(leer.nextLong());
        datos.setAux(datos.getDNI() % 23);
    }

    public void mostrarNif() {
        String letra[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int posicion = (int) datos.getAux();
        System.out.println("<<< NIF >>>");
        System.out.println(datos.getDNI() + "-" + letra[posicion]);
    }

}
