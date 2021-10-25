package proyectoexepciones;

import java.util.Scanner;
import proyectoexepciones.ejercicioo1.Persona;
import proyectoexepciones.ejercicioo1.PersonaServicio;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio servicio = new PersonaServicio();
        Persona p1 = servicio.crearPersona();
        Persona[] listaPersonas = servicio.crearPersonas(4);
        servicio.porcentajesPeso(listaPersonas);
        servicio.porcentajeEdad(listaPersonas);
    }
}
