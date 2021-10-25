package proyecto1;

import static java.time.Clock.system;
import java.util.Scanner;

public class Fraseminusculamayuscula4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase;
        System.out.println("Ingresa una frase y se escribira en mayucula y minuscula");
        frase = leer.next();
        System.out.println("------------------------------------------------------");
        System.out.println("La frase (" + frase + ") en mayuscula es ");
        System.out.println(frase.toUpperCase());
        System.out.println("------------------------------------------------------");
        System.out.println("La frase (" + frase + ") en minuscula es ");
        System.out.println(frase.toLowerCase());
    }

}
