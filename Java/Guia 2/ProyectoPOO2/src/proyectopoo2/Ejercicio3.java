package proyectopoo2;

import proyectopoo2.ejercicioo3.Operacion;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Operacion mm = new Operacion(0, 0);
        System.out.println("Ingresa numeros");
        mm.setnumero1(leer.nextInt());
        mm.setnumero2(leer.nextInt());
        mm.suma();
        mm.resta();
        mm.multi();
        mm.dividir();
        System.out.println("SUMA:\t" + mm.suma());
        System.out.println("RESTA:\t" + mm.resta());
        if (mm.multi() != 0 || mm.dividir() != 0) {
            System.out.println("MULTIPLICACION:\t" + mm.multi());
        } else {
            System.out.println("MULTIPLICACION:\t" + mm.multi() + " Error usted ingreso [" + "0" + "] (cero)");
        }
        if (mm.dividir() != 0 || mm.multi() != 0) {
            System.out.println("DIVISION:\t" + mm.dividir());
        } else {
            System.out.println("DIVISION:\t" + mm.dividir() + " Error usted ingreso [" + "0" + "] (cero)");
        }
    }

}
