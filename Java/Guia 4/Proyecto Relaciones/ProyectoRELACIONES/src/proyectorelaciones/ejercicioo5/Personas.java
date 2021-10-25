package proyectorelaciones.ejercicioo5;

public class Personas {

    private int dinero;
    private int edad;
    private String nombre;
    private String sala;

    public Personas() {

    }

    public Personas(int dinero, int edad, String nombre, String sala) {
        this.dinero = dinero;
        this.edad = edad;
        this.nombre = nombre;
        this.sala = sala;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

}
