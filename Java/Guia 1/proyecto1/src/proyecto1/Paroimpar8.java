package proyecto1;


import java.util.Scanner;

public class Paroimpar8 {

    public static void main(String[] args) {
        System.out.println("Ingresar un numero y se detectara si es par o impar");
        Scanner leer = new Scanner(System.in);
     int numero;
       
        System.out.print("Por favor ingrese el número a evaluar: ");
        numero = leer.nextInt();
       
        if(numero % 2 == 0) {
            System.out.println(numero+" es un número par.");
        }else {
            System.out.println(numero+" no es un número par.");
        }
    }
}
