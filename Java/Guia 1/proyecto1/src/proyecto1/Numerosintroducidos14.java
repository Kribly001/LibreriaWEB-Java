package proyecto1;

import java.util.Scanner;

public class Numerosintroducidos14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar numero luego se sumaran hasta llegar al indicado");
        int numero1 = leer.nextInt();
        System.out.println("Ingresa numeros a sumar");
        int numero2 = leer.nextInt();
    while (numero1>numero2){
        int numero3=leer.nextInt();
        numero2=numero2+numero3;
    }
    System.out.println("Se llego al limite del numero!");
    }
}
