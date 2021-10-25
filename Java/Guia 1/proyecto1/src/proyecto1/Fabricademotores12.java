
package proyecto1;

import java.util.Scanner;


public class Fabricademotores12 {

    
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     System.out.println("Igresar tipo de motor");
        int motor = leer.nextInt();
     if (motor >=1 & motor <=5){
     switch(motor){
         case 1:
             System.out.println("La bomba [" + motor + "] es una bomba de agua");
             break;
         case 2:
             System.out.println("La bomba [" + motor + "] es una bomba de gasolina");
             break;
         case 3:
             System.out.println("La bomba [" + motor + "] es una bomba de hormigon");
             break;
         case 4:
             System.out.println("La bomba [" + motor + "] es una bomba de pasta alimenticia");
             break;
             
    }
     }else if(motor<=0){
         System.out.println("No existe un valor válido para tipo de bomba [" + motor + "]");
     }else if(motor>5){
         System.out.println("No existe un valor válido para tipo de bomba [" + motor + "]");
}   

    }
}
