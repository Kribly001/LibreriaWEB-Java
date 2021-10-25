
package proyectopoo2;

import proyectopoo2.ejercicioo4.Rectangulo;
import java.util.Scanner;



public class Ejercicio4 {

  
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     Rectangulo pp=new Rectangulo(0,0,0,0,0);
     System.out.println("Este programa creara un rectangulo y dara la Superficie y Perimetro");
     System.out.println("Ingresar (base) y (altura)");
     pp.setBase(leer.nextInt());
     pp.setAltura(leer.nextInt());
     pp.perimetro();
     pp.superficie();
     System.out.println("PERIMETRO:\t" + pp.perimetro);
     System.out.println("SUPERFICIE:\t" + pp.superficie);
     System.out.println("");
     pp.rrectangulo();
            
    }
    
}
