package proyectoherencia.ejercicioo1;

public class Caballo extends Animal {

    public Caballo(String nombre, String alimento, byte edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Caballo() {
        super();
    }

    @Override
    public void alimentarse() {
        System.out.println("El caballo se alimenta de: " + this.alimento);
    }
    @Override
    public void tambienhago(){
        System.out.println("Mi nombre es:\t" + this.nombre);
        System.out.println("Mi edad:\t" + this.edad);
        System.out.println("Mi raza es:\t" + this.raza);
    }

}
