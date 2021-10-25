package proyectoherencia.ejercicioo5;

import java.util.Date;
import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private Integer dni;
    private Date fechaalq;
    private Date fechadev;
    private Integer amarre;
    private String barcoocup;

    public Persona() {
    }

    public Persona(String nombre, Integer dni, Date fechaalq, Date fechadev, Integer amarre, String barcoocup) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaalq = fechaalq;
        this.fechadev = fechadev;
        this.amarre = amarre;
        this.barcoocup = barcoocup;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Date getFechaalq() {
        return fechaalq;
    }

    public void setFechaalq(Date fechaalq) {
        this.fechaalq = fechaalq;
    }

    public Date getFechadev() {
        return fechadev;
    }

    public void setFechadev(Date fechadev) {
        this.fechadev = fechadev;
    }

    public Integer getAmarre() {
        return amarre;
    }

    public void setAmarre(Integer amarre) {
        this.amarre = amarre;
    }

    public String getBarcoocup() {
        return barcoocup;
    }

    public void setBarcoocup(String barcoocup) {
        this.barcoocup = barcoocup;
    }

    public void datoss() {
        System.out.println("Nombre→");
        nombre = leer.next();
        System.out.println("Dni→");
        dni = leer.nextInt();
    }

    public void alquiler() {
        int año, mes, dia;
        System.out.println("Fecha de alquiler→");
        System.out.println("Año");
        año = leer.nextInt();
        año -= 1900;
        System.out.println("Mes:");
        mes = leer.nextInt();
        mes -= 1;
        System.out.println("Dia:");
        dia = leer.nextInt();
        fechaalq = (new Date(año, mes, dia));
    }

    public void devolucion() {
        int año, mes, dia;
        System.out.println("Fecha de devolucion→");
        System.out.println("Año");
        año = leer.nextInt();
        año -= 1900;
        System.out.println("Mes:");
        mes = leer.nextInt();
        mes -= 1;
        System.out.println("Dia:");
        dia = leer.nextInt();
        fechaalq = (new Date(año, mes, dia));
    }

    public void posicionamarre(String posicion) {
        posicion = posicion.toUpperCase();
        if (posicion.equals("IZQUIERDA") || posicion.equals("DERECHA")) {
            System.out.println("La posicion de amarre elegida es:\t" + posicion);
        } else {
            System.out.println("Usted ingreso una posicion no valida :(");
        }

    }
}
