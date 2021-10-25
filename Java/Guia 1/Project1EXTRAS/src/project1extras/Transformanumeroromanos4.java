package project1extras;

import java.util.Scanner;

public class Transformanumeroromanos4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa numeros del 1 al 10 y se tranformaran a romanos");
        System.out.println("Ingresar numero");
        int numero;
        String numero1, numero2, numero3, numero4, numero5, numero6, numero7, numero8, numero9, numero10;
        numero1 = "I";
        numero2 = "II";
        numero3 = "III";
        numero4 = "IV";
        numero5 = "V";
        numero6 = "VI";
        numero7 = "VII";
        numero8 = "VIII";
        numero9 = "IX";
        numero10 = "X";
        numero = leer.nextInt();
        if (numero >= 1 || numero <= 10) {
            switch (numero) {
                case 1:
                    System.out.println("Usted ingreso 1");
                    System.out.println(" [" + numero1 + "] " + "<------");
                    break;
                case 2:
                    System.out.println("Usted ingreso 2");
                    System.out.println(" [" + numero2 + "] " + "<------");
                    break;
                case 3:
                    System.out.println("Usted ingreso 3");
                    System.out.println(" [" + numero3 + "] " + "<------");
                    break;
                case 4:
                    System.out.println("Usted ingreso 4");
                    System.out.println(" [" + numero4 + "] " + "<------");
                    break;
                case 5:
                    System.out.println("Usted ingreso 5");
                    System.out.println(" [" + numero5 + "] " + "<------");
                    break;
                case 6:
                    System.out.println("Usted ingreso 6");
                    System.out.println(" [" + numero6 + "] " + "<------");
                    break;
                case 7:
                    System.out.println("Usted ingreso 7");
                    System.out.println(" [" + numero7 + "] " + "<------");
                    break;
                case 8:
                    System.out.println("Usted ingreso 8");
                    System.out.println(" [" + numero8 + "] " + "<------");
                    break;
                case 9:
                    System.out.println("Usted ingreso 9");
                    System.out.println(" [" + numero9 + "] " + "<------");
                    break;
                case 10:
                    System.out.println("Usted ingreso 10");
                    System.out.println(" [" + numero10 + "] " + "<------");
                    break;
            } if(numero <=0||numero >= 11){
            System.out.println("Usted no ingreso un numero del 1 al 10 :(");
            }
        }
    }

}
