
package proyecto1;

import java.util.Scanner;


public class Gradosafareheint5 {

  
    public static void main(String[] args) {
       System.out.println("Ingresa grados centigrados y se pasaran a Fahrenheit");
       Scanner leer = new Scanner(System.in);
       Short c;
       System.out.println("------------------------------------------------------");
       System.out.println("Ingresar grados centigrados");
       c=leer.nextShort();
       long f;
       f = 32 + (9 * c / 5);
       System.out.println(c + " Grados Centigrados " );
       System.out.println ("Son (" + f + ") Grados Fahrenheit");
    }
    
}
