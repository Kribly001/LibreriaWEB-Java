package proyectopoo2.ejercicioo4;

public class Rectangulo {

    private int base;
    private int altura;
    public double superficie;
    public double perimetro;
    public double rrectangulo;

    public Rectangulo(int base, int altura, double superficie, double perimetro, double rrectangulo) {
        this.base = base;
        this.altura = altura;
        this.superficie = superficie;
        this.perimetro = perimetro;
        this.rrectangulo = rrectangulo;
    }

    public Rectangulo() {

    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double superficie() {
        superficie = base * altura;
        return superficie;
    }

    public double perimetro() {
        perimetro = (base + altura) * 2;
        return perimetro;
    }

    public void rrectangulo() {
    for (int i=0;i<base;i++){
     System.out.print(" *");   
    }
    System.out.println("");
    for (int i=0;i<altura-1;i++){
        System.out.print(" *");
        for(int j=0;j<altura-1;j++){
            System.out.print("  ");
        }
        System.out.println(" *");
    }
    for (int i=0;i<base;i++){
        System.out.print(" *");
    }
    System.out.println(" ");
    }
}
