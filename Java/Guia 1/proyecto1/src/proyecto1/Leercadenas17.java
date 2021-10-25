
package proyecto1;

import java.util.Scanner;
public class Leercadenas17 {

   
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra, X, O;
        int i = 0, c = 0, longitud,band=0,g=0;
        do {
            g=g+1;
            System.out.println("Ingrese palabra "+(g)+":");
            palabra = leer.next();
            longitud = palabra.length();
            if (longitud == 5) 
            {
                if(palabra.equals("&&&&&"))
                {band=1;
                    break;
                }
                else
                {
                    if (palabra.substring(0, 1).equals("X") && palabra.substring(4, 5).equals("O")) 
                {
                    c=c+1;
                } 
                else
                {
                    i=i+1;
                }
                }
                
            }
            else
            {
                i=i+1;
            }
                
        } while (band!=1);
        
        System.out.println("Palabra Incorrecta Ingresada: "+i);
        System.out.println("Palabra Correcta Ingresada: "+c);
    }

}
    

