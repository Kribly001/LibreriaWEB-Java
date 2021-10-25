package proyecto1;

import java.util.Scanner;

public class Validarnota13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int notas;
        System.out.println("Ingresar notas del 1 al 10");
        notas = leer.nextInt();
        while (notas <= 0 || notas > 10) {
            System.out.print("La nota es incorrecta porfavor ingrese otra");
            notas = leer.nextInt();
        }
    }
}
