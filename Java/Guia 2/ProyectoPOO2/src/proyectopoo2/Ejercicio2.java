

package ejercicio2;

import proyectopoo2.ejercicioo2.Circunferencia;
import java.util.Scanner;


public class Ejercicio2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Circunferencia c1 = new Circunferencia(0,0,0); 
        System.out.print("Ingrese radio:");
        c1.setRadio(leer.nextDouble());
        c1.area(); 
        c1.perimetro();
        System.out.println("AREA:\t"+c1.getA());
        System.out.println("PERIMETRO:\t"+c1.P);
        
    }

    }
    

