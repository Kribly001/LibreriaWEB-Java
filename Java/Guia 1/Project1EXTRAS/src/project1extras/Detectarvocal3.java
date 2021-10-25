package project1extras;

import java.util.Scanner;

public class Detectarvocal3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar letra y se detectara si es vocal");
        String letras;
        letras = leer.next();
        letras = letras.toUpperCase();
        String letraA, letraB, letraC, letraD, letraE;
        letraA = "A";
        letraB = "E";
        letraC = "I";
        letraD = "O";
        letraE = "U";
        {
            if ((letras.equals(letraA)) || (letras.equals(letraB)) || (letras.equals(letraC)) || (letras.equals(letraD)) || (letras.equals(letraE))) {
                System.out.println("La letra [" + letras + "] es vocal");
            } else {

                System.out.println("La letra [" + letras + "] no es vocal");
            }
        }
    }

}
