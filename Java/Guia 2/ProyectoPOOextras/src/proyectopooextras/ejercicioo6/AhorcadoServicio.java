package proyectopooextras.ejercicioo6;

import java.util.Scanner;

public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado datos = new Ahorcado();

    public void crearjuego() {
        System.out.println("--MODO CREADOR--");
        System.out.println("Ingresar palabra");
        String palabra = leer.next();

        String aux[] = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            aux[i] = palabra.substring(i, i + 1);

        }
        datos.setPalabraabuscar(aux);
        System.out.print("➤Ingrese la cantidad de intentos:");
        datos.setCantidad(leer.nextInt());
        datos.setLetrasencontradas(0);
        datos.setLongitud(datos.getPalabraabuscar().length);
        System.out.println("➤Longitud de la palabra: " + datos.getLongitud());

    }

    public void longitudd() {
        datos.setLongitud(datos.getPalabraabuscar().length);
        System.out.println("La longitud de la palabra es " + datos.getLongitud());
    }

    public void buscarletra() {
        System.out.println("--COMIENZO AHORCADO--");
        System.out.println("Ingresar letra");
       datos.setLetra(leer.next());
        
    }
}
