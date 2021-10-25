package proyectopooextras.ejercicioo6;

public class Ahorcado {

    private String palabraabuscar[],letra;
    private int letrasencontradas;
    private int cantidad;
    private int longitud;

    public Ahorcado() {

    }

    public Ahorcado(String[] palabraabuscar, String letra, int letrasencontradas, int cantidad, int longitud) {
        this.palabraabuscar = palabraabuscar;
        this.letra = letra;
        this.letrasencontradas = letrasencontradas;
        this.cantidad = cantidad;
        this.longitud = longitud;
    }

    public String[] getPalabraabuscar() {
        return palabraabuscar;
    }

    public void setPalabraabuscar(String[] palabraabuscar) {
        this.palabraabuscar = palabraabuscar;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getLetrasencontradas() {
        return letrasencontradas;
    }

    public void setLetrasencontradas(int letrasencontradas) {
        this.letrasencontradas = letrasencontradas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

   
    

}
