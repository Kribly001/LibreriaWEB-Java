package proyectopoo2;

import java.util.Scanner;

import proyectopoo2.ejercicioo12.PersonaServicio;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio datos = new PersonaServicio();
        datos.crearPersona();
        datos.calcularedad();
        System.out.print("<<<<< USUARIO 2 >>>>>\n" + "*Edad:");
        datos.Menor_Que(leer.nextInt());
        datos.Mostrar_Personal();

    }

}
