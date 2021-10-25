package proyecto1;

import java.util.Scanner;

public class Fraseigual9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar la palabra secreta");
        String frase;
        String cadena1 = "eureka";
        frase = leer.next();
        if (frase.equals(cadena1)) {
            System.out.println("La palabra secreta [" + frase + "] es correcta");
        } else {
            System.out.println("La palabra secreta [" + frase + "] es incorrecta");
        }
    }
}
