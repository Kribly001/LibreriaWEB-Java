package proyectopooextras.ejercicioo3;

import java.util.Scanner;

public class RaicesServicio {

    Raices datos = new Raices();

    public Raices crearnumeros() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar valores a-->b-->c");
        System.out.println("Valor a");
        datos.setA(leer.nextDouble());
        double a = datos.getA();
        System.out.println("Valor b");
        datos.setB(leer.nextDouble());
        double b = datos.getB();
        System.out.println("Valor c");
        datos.setC(leer.nextDouble());
        double c = datos.getC();
        return new Raices(a, b, c);
    }

    public double discriminante() {
        Double discriminante = Math.pow(datos.getB(), 2) - 4 * datos.getA() * datos.getC();
        datos.setAux(discriminante);
        return discriminante;
    }

    public boolean tieneraices() {
        if (datos.getAux() >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneraiz() {
        if (datos.getAux() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerraices() {
        double a = datos.getA();
        double b = datos.getB();
        double c = datos.getC();
        double b2 = Math.pow(b, 2);
        if (tieneraices()) {
            double Raiz1 = (-b - Math.sqrt(b2 - 4 * a * c)) / (2 * a);
            double Raiz2 = (-b + Math.sqrt(b2 - 4 * a * c)) / (2 * a);
            System.out.println("Raiz 1: " + Raiz1);
            System.out.println("Raiz 2: " + Raiz2);
        } else {
            System.out.println("No tiene raices o solo tiene una raiz");
        }
    }

    public void obtenerraiz() {
        double a = datos.getA();
        double b = datos.getB();
        double c = datos.getC();
        double b2 = Math.pow(b, 2);
        if (tieneraiz()) {
            double Raiz = (-b) / (2 * a);
            System.out.println("Raiz: " + Raiz);
        } else {
            System.out.println("No tiene raices o tiene 2 raiz");
        }
    }

    public void Calcular() {
        if (tieneraices()) {
            obtenerraices();
        } else {
            if (tieneraiz()) {
                obtenerraiz();
            } else {
                System.out.println("No tiene solucion de raices");
            }
        }
    }
}
