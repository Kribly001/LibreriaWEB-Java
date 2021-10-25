
package proyecto1;

import java.util.Scanner;


public class PrimeraletraA11 {


    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("El programa validara si la primer letra es A");
    System.out.println("Ingresar frase");
    String cadena1="Auto";
    String palabra;
    String auxiliar=cadena1.substring(0, 1);
    palabra=leer.next();
    String palabra2=palabra.substring(0, 1);
    if (palabra2.equals(auxiliar))
    System.out.println("La primer letra de [" + palabra + "] es correcta");
    else {
        System.out.println("La primer letra de [" + palabra + "] es incorrecta");
        
    }
    
  }
}   
