package project1extras;

import java.util.Scanner;

import java.util.Scanner;

public class Intercambiarvariables2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar valores");
        System.out.println("Variable A");
        int a = leer.nextInt();
        System.out.println("Variable B");
        int b = leer.nextInt();
        System.out.println("Variable C");
        int c = leer.nextInt();
        System.out.println("Variable D");
        int d = leer.nextInt();
        System.out.println("Valores ingresados");
        System.out.println("A=" + a + "                  B=" + b);
        System.out.println("C=" + c + "                  D=" + d);
        int aux=b;
        b = (a + b + c + d) - a - b - d;
        c = (a + aux + b + d)- aux - b - d;
        a = (c + aux + b + d)-c - aux - b;
        d =aux;
       System.out.println("Cambiamos Valores");
        System.out.println("A="+a+"         B="+b);
        System.out.println("C="+c+"         D="+d);
    }

}
