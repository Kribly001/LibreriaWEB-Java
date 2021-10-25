package proyectorelaciones.ejercicioo2;

public class RevolverService {

    RevolverDeAgua revolver = new RevolverDeAgua();

    public void llenarRevolver() {
        revolver.setPosicionActual((int) (Math.random() * 10));
        revolver.setPosicionAgua((int) (Math.random() * 10));

    }

    public boolean mojar() {
        return (revolver.getPosicionActual() == revolver.getPosicionAgua());
    }

    public void siguienteChorro() {
        int posActual = revolver.getPosicionActual();
        do {
            revolver.setPosicionActual((int) (Math.random() * 10));
        } while (posActual == revolver.getPosicionActual());

    }

    public void mostrarPosiciones() {
        System.out.println(revolver.toString());
    }
}
