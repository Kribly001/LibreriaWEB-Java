
package proyectopoo2.ejercicioo2;


public class Circunferencia {  
    private double radio;  /* variable  para usarse en main*/
    private double A;         /* variable  para usarse en main*/
    public double P;          /* variable  para usarse en main*/


    public Circunferencia(double radio, double A, double P) {   /* constructor */
        this.radio = radio;
        this.A = A;
        this.P = P;
    }

    public void setRadio(double radio) {  /*seteo: cambia variable desde main por ser privado radio*/
        this.radio = radio;
    }

    public void setA(double A) { /*seteo: cambia variable desde main por ser privado A*/
        this.A = A;
    }

    public double getRadio() { /*get: logra mostrar desde main por ser privado radio*/
        return radio;
    }

    public double getA() { /*get: logra mostrar desde main por ser privado A*/
        return A;
    }
    
    public double area(){  /*metodo area*/
        A=3.1416*radio*radio;
        return A;
    }
    
    public double perimetro(){ /*metodo perimetro*/
        P=2*3.1416*radio;
        return P;
    } 
}
    

