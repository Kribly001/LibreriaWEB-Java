package proyectopoo2.ejercicioo12;

import java.util.Date;

public class Persona {

    private String nombre;
    private Date fecha;
    private Date fechaactual;
    private int año;
    private int mes;
    private int dia;
    private int edad;

    public Persona() {

    }

    public Persona(String nombre, Date fecha, Date fechaactual, int año, int mes, int dia, int edad) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.fechaactual = fechaactual;
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.edad = edad;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaactual() {
        return fechaactual;
    }

    public void setFechaactual(Date fechaactual) {
        this.fechaactual = fechaactual;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

}
