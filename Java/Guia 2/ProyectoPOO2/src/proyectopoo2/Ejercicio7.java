
package proyectopoo2;

import java.util.Scanner;
import proyectopoo2.ejercicioo7.Persona;
import proyectopoo2.ejercicioo7.PersonaServicio;


public class Ejercicio7 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio servicio = new PersonaServicio();
        Persona p1=servicio.crearPersona();
        
        Persona[] listaPersonas= servicio.crearPersonas(4);
        servicio.porcentajesPeso(listaPersonas);
        servicio.porcentajeEdad(listaPersonas);
    }
    
}
