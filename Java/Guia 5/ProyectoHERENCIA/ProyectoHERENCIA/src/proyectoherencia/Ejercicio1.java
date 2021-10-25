package proyectoherencia;

import proyectoherencia.ejercicioo1.Animal;
import proyectoherencia.ejercicioo1.Caballo;
import proyectoherencia.ejercicioo1.Gato;
import proyectoherencia.ejercicioo1.Perro;

public class Ejercicio1 {

    public static void main(String[] args) {
        Animal Perro = new Perro("Rocky", "Huesos", (byte) 3, "Pitbull");
        Perro.alimentarse();
        System.out.println("Otras curiosidades de mi");
        Perro.tambienhago();
        System.out.println("------------------------");
        Animal Gato = new Gato("Blanquita", "Croquetas", (byte) 4, "Mestizo");
        Gato.alimentarse();
        System.out.println("Otras curiosidades de mi");
        Gato.tambienhago();
        System.out.println("-------------------------");
        Animal Caballo = new Caballo("Grandote", "Pastizales", (byte) 7, "Criollo");
        Caballo.alimentarse();
        System.out.println("Otras curiosidades de mi");
        Caballo.tambienhago();
        System.out.println("-------------------------");

    }

}
