package proyectopooextras.ejercicioo5;

import java.util.Scanner;

public class MesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Mes datos = new Mes();

    public void adivinarmes() {
        String aux[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
      datos.setMeses(aux);
       String meses[] = datos.getMeses();
        String mes_secreto = meses[1];
        String adivinar="";
        do {
            System.out.print("Introduzca el nombre del mes en minúsculas:");
            adivinar = leer.next();
            if (adivinar.equals(mes_secreto)) {
                System.out.print("¡Ha acertado! ");
            } else {
                System.out.print("No ha acertado ");
            }
        } while (!adivinar.equals(mes_secreto));
    }
}

    
