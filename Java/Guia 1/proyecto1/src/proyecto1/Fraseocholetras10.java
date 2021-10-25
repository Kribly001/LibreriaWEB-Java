
package proyecto1;

import java.util.Scanner;


public class Fraseocholetras10 {

    
    public static void main(String[] args) {
     System.out.println("Ingresar frase de 8 letras maximo");
     Scanner leer=new Scanner(System.in);
     String frase="amiguito";
     int longitud=frase.length();
     String palabra2;
     palabra2= leer.next();
     int palabra=palabra2.length();
     if (longitud==palabra)
     System.out.println("La longitud es correcta");
    else{
         System.out.println("La longitud es incorrecta");
     }         
    }

    
}

