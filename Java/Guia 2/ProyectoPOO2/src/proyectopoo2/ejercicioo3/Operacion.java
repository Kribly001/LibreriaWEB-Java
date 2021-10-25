package proyectopoo2.ejercicioo3;

public class Operacion {

    private int numero1;
    private int numero2;
    public int suma;
    public int resta;
    public int dividir;
    public int multi;
    public int respuesta;
    public int A;
    public int B;
    public int C;
    public int D;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;

    }

    public Operacion() {
    }

    public void setnumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setnumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getnumero1() {
        return numero1;
    }

    public int getnumero2() {
        return numero2;
    }

    public int suma() {
        A = numero1 + numero2;
        return A;
    }

    public int resta() {
        B = numero1 - numero2;
        return B;
    }

    public int dividir() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            return 0;
        }
        return this.numero1 / this.numero2;

    }

    public int multi() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            return 0;
        }
        return this.numero1 * this.numero2;

    }
}
