package proyectoherencia.ejercicioo1;

public abstract class Animal {

    protected String nombre;
    protected String alimento;
    protected byte edad;
    protected String raza;

    public Animal() {

    }

    public Animal(String nombre, String alimento, byte edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public abstract void alimentarse();

    public void tambienhago() {

    }
}
