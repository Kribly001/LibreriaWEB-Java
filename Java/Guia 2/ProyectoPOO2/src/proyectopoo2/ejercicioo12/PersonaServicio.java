package proyectopoo2.ejercicioo12;

import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    Persona datos = new Persona();

    public void crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar nombre");
        datos.setNombre(leer.next());
        System.out.println("Ingresar fecha de nacimiento año--> mes--> dia");
        int año = leer.nextInt();
        año -= 1900;
        int mes = leer.nextInt();
        mes -= 1;
        int dia = leer.nextInt();
        datos.setFecha(new Date(año, mes, dia));
        
    }

    public void calcularedad() {
        datos.setFechaactual(new Date());
        Date fechaactual = datos.getFechaactual();
        Date fecha = datos.getFecha();
        datos.setEdad(fechaactual.getYear() - fecha.getYear());
    }

    public void Menor_Que(int edad2) {
        if (datos.getEdad() > edad2) {
            System.out.println("La edad del Usuario 1 es Mayor de la edad del Usuario 2");
        } else {
            System.out.println("La edad del Usuario 2 es Mayor de la edad del Usuario 1");
        }
    }

    public void Mostrar_Personal() {
        System.out.println("\n<<<<< DATOS USUARIO 1>>>>>");
        System.out.println("-Nombre: " + datos.getNombre());
        System.out.println("-Nacimiento: " + datos.getFecha());
        System.out.println("-Edad: " + datos.getEdad());
    }

}
