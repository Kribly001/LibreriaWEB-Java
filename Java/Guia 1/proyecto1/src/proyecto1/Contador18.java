package proyecto1;

import java.util.Scanner;

public class Contador18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Este progrmam dara numeros y cuando salga un 3 lo transformara en E");
        System.out.println("Ingresar primer digito del contador X-X-X");
        int num;
        num = leer.nextInt();
        int contador1;
        String conversor;
        for (contador1 = 0; contador1 <= num; contador1++) {
            conversor = String.valueOf(contador1);
            if (contador1 < 10) {
                System.out.println("Contador: 00" + conversor.replace('3', 'E'));
            } else {
                if (contador1 < 100) {
                    System.out.println("Contador: 0" + conversor.replace('3', 'E'));
                } else {
                    if (contador1 < 99){
                        System.out.println("Contador:" +conversor.replace('3', 'E'));
                    }
                }
            }
        }

    }
}
