package proyectorelaciones.ejercicioo4;

public class Servicio {

    private String nombre;

    public Servicio() {

    }

    public Servicio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void nombre1(String nombre) {
        nombre = nombre.toUpperCase();
        if (nombre.equals("AGUSTIN") || (nombre.equals("JUAN"))) {
            if (nombre.equals("AGUSTIN")) {
                System.out.println("<--Sus datos son-->");
                System.out.println(Personas.AGUSTIN.getNombre());
                System.out.println("Edad");
                System.out.println(Personas.AGUSTIN.getEdad());
                System.out.println("Dni");
                System.out.println(Personas.AGUSTIN.getDni());
                System.out.println("");
                System.out.println("¿Que perro deseas adoptar?");
                System.out.println(Perros.CANICHE.getRaza());
                System.out.println("|O|");
                System.out.println(Perros.PITBULL.getRaza());
            }

            if (nombre.equals("JUAN")) {
                System.out.println("<--Sus datos son-->");
                System.out.println(Personas.JUAN.getNombre());
                System.out.println("Edad");
                System.out.println(Personas.JUAN.getEdad());
                System.out.println("Dni");
                System.out.println(Personas.JUAN.getDni());
                System.out.println("");
                System.out.println("¿Que perro deseas adoptar?");
                System.out.println(Perros.CANICHE.getRaza());
                System.out.println("|O|");
                System.out.println(Perros.PITBULL.getRaza());
            }
        } else {
            System.out.println("Usted no se encuentra en la lista :(");
        }

    }
}
