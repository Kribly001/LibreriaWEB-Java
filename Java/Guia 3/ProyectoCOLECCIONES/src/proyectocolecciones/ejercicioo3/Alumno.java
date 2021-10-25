package proyectocolecciones.ejercicioo3;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {

    private Scanner leer;
    private String nombre;
    private ArrayList<Integer> notas;

    public Alumno() {
        this.notas = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public Alumno Crear() {
        ArrayList<Integer> notas = new ArrayList();
        System.out.print("ingrese nombre:");
        nombre = leer.next();
        for (int i = 0; i < 3; i++) {
            System.out.print("ingrese nota " + (i + 1) + ":");
            notas.add(leer.nextInt());
        }
        return new Alumno(nombre, notas);
    }

    public double notaFinal(String N) {
        double Resultado = ((notas.get(0) + notas.get(1) + notas.get(2)) / 3);
        return Resultado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }

}
