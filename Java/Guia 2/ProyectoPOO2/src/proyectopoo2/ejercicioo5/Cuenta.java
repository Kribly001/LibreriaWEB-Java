package proyectopoo2.ejercicioo5;

import java.util.Scanner;

public class Cuenta {

    private int numerocuenta;
    public long DNI;
    private long saldo;
    private int interes;
    public String nombre;
    public long saldo2;
    public long saldo3;
    public double monto;

    public Cuenta(int numerocuenta, long DNI, long saldo, int interes) {
        this.numerocuenta = numerocuenta;
        this.DNI = DNI;
        this.saldo = saldo;
        this.interes = interes;
    }

    public void setnumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public void setsaldo(long saldo) {
        this.saldo = saldo;
    }

    public void setinteres(int interes) {
        this.interes = interes;
    }

    public long getnumerocuenta() {
        return numerocuenta;
    }

    public long getsaldo() {
        return saldo;
    }

    public int getinteres() {
        return interes;
    }

    public void opciones() {
        System.out.println("1_Ingresar dinero");
        System.out.println("2_Retirar dinero");
        System.out.println("3_Extraccion rapida");
        System.out.println("4_Consultar saldo");
        System.out.println("5_Consultar datos");

    }

    public void crearcuenta() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("***Ingresar datos***");
        System.out.println("Nombre");
        nombre = leer.next();
        System.out.println("Numero de identidad (DNI)");
        DNI = leer.nextInt();
        System.out.println("Numero de cuenta");
        numerocuenta = leer.nextInt();
        System.out.println("Saldo");
        saldo = leer.nextLong();
    }

    public void ingresar() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Saldo actual");
        System.out.println("$" + saldo);
        System.out.println("¿Cuanto dinero quieres ingresar?");
        saldo2 = leer.nextLong();
        System.out.println("Su saldo actual es");
        saldo3 = saldo + saldo2;
        System.out.println("$" + saldo3);

    }

    public void retirar() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Saldo actual");
        System.out.println("$" + saldo);
        System.out.println("¿Cuanto dinero desea retirar?");
        saldo2 = leer.nextInt();
        if (saldo > saldo2) {
            saldo3 = saldo - saldo2;
            System.out.println("¡Retiro completado con exito!");
            System.out.println("Saldo restante:$" + saldo3);
        } else {
            if (saldo < saldo2) {
                System.out.println("$0");
            }
            System.out.println("--Dinero en cuenta insuficiente para completar el retiro--");
        }
    }

    public double extraccionrapida(double monto) {
        if (monto <= (0.2 * this.saldo)) {
            this.saldo -= monto;
            return this.saldo;
        }
        System.out.println("No puede extraer mas del 20% del saldo");
        return 0;

    }

    public void consultarsaldo() {
        System.out.println("Su saldo es");
        System.out.println("$" + saldo);

    }

    public void consultardatos() {
        System.out.println("**Sus datos almacenados son**");
        System.out.println("Nombre:\t" + nombre);
        System.out.println("Dni:\t" + DNI);
        System.out.println("Numero de cuenta:\t" + numerocuenta);
        System.out.println("Saldo restante:\t" + saldo);
    }
}
