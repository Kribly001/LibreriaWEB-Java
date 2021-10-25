package proyectopoo2.ejercicioo8;

public class Cadena {

    private String fraseopalabra;
    private int long_frase;
    private String aux;

    public Cadena(String fraseopalabra, int long_frase, String aux) {
        this.fraseopalabra = fraseopalabra;
        this.long_frase = long_frase;
        this.aux = aux;
    }

    Cadena() {

    }

    public String getFraseopalabra() {
        return fraseopalabra;
    }

    public void setFraseopalabra(String fraseopalabra) {
        this.fraseopalabra = fraseopalabra;
    }

    public int getLong_frase() {
        return long_frase;
    }

    public void setLong_frase(int long_frase) {
        this.long_frase = long_frase;
    }

    public String getAuxiliar() {
        return aux;
    }

    public void setAuxiliar(String auxiliar) {
        this.aux = auxiliar;
    }

}
