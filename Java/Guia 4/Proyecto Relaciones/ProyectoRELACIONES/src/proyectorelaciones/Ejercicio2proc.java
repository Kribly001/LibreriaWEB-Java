package proyectorelaciones;

import proyectorelaciones.ejercicioo2.RevolverService;

public class Ejercicio2proc {

    public static void main(String[] args) {
        RevolverService r = new RevolverService();

        r.llenarRevolver();
        r.mostrarPosiciones();

        while (!r.mojar()) {
            r.siguienteChorro();
            r.mostrarPosiciones();
        }
        System.out.println(r.mojar());
    }

}
