package proyecto1;

import java.util.Scanner;

public class Cuadradoasteriscos19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Determinar el numero de lados");
        int num, ladoA, ladoB;
        num = leer.nextInt();
        for (ladoA = 0; ladoA < num; ladoA++) {
            for (ladoB = 0; ladoB < num; ladoB++) {
                if ((ladoA == 0 || ladoA == num - 1) || ladoB ==0 || ladoB==num-1) {
                    System.out.print("*");
                }
                if(ladoB>0 && ladoB<num-1 & ladoA!=0 && ladoA!=num-1) 
                { System.out.print(" ");}   

                }
        System.out.println("");
            }
    }   
}

    


