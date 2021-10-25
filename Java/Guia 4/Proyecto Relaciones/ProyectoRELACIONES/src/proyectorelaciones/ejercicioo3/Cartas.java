package proyectorelaciones.ejercicioo3;

public class Cartas {

    private Integer numero;
    private String palo;

    public Cartas() {
    }

    public Cartas(Integer numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Cartas{" + "numero=" + numero + ", palo=" + palo + '}';
    }
}
