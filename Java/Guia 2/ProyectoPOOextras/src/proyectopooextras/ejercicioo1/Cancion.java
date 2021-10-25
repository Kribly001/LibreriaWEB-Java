package proyectopooextras.ejercicioo1;

import java.util.Scanner;

public class Cancion {

    private String titulo;
    private String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void Cargar() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar cancion");
        this.titulo = leer.next();
        System.out.println("Ingresar autor");
        this.autor = leer.next();

    }

    @Override
    public String toString() {
        return "Cancion " + "titulo=" + titulo + ", Autor=" + autor;
    }

}
