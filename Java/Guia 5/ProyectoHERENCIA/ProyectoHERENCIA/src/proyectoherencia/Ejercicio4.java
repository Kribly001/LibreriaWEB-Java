
package proyectoherencia;

import proyectoherencia.ejercicioo4.Circulo;
import proyectoherencia.ejercicioo4.Rectangulo;


public class Ejercicio4 {

    
    public static void main(String[] args) {
       //CIRCULO CON EL CONSTRUCTOR QUE RECIBE PARAMETROS --> DEL RADIO
        Circulo nuevoCirculo = new Circulo (5);  
       // System.out.println("El area de su circulo es:" + nuevoCirculo.calcularArea());
       //USAMOS PRINTF PARA REGULAR CUANTOS DECIMALES APARECEN
        System.out.printf("El area de su circulo es: " + "%.2f %n", nuevoCirculo.calcularArea());
        System.out.printf("El perimetro de su circulo es: " + "%.2f %n",nuevoCirculo.calcularPerimetro());
        
        Rectangulo nuevoRectangulo = new Rectangulo(4.6,5);
        System.out.printf("El area de su rectangulo  es: " + "%.2f %n", nuevoRectangulo.calcularArea());
        System.out.printf("El perimetro de su rectangulo es: " + "%.2f %n",nuevoRectangulo.calcularPerimetro());  
    }
    
}
