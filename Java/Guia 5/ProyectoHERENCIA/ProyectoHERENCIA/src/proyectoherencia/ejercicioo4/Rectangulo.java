
package proyectoherencia.ejercicioo4;

public class Rectangulo implements calcularFormas {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
      @Override
    public double calcularArea() {
        double aux = this.base * this.altura;
        return aux;
    }
     @Override
    public double calcularPerimetro() {
        double aux = (this.base + this.altura)*2; 
        return aux;
    }
}
