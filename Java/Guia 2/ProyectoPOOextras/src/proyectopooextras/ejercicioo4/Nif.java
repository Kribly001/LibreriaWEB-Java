package proyectopooextras.ejercicioo4;

public class Nif {

    private long DNI;
    private String letra;
    private long aux;

    public Nif() {

    }

    public Nif(long DNI, String letra, long aux) {
        this.DNI = DNI;
        this.letra = letra;
        this.aux = aux;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public long getAux() {
        return aux;
    }

    public void setAux(long aux) {
        this.aux = aux;
    }

  
}
