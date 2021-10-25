package proyectorelaciones;

import java.util.Scanner;
import proyectorelaciones.ejercicioo4.Perros;

import proyectorelaciones.ejercicioo4.Servicio;

public class Ejercicio4proc {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio p = new Servicio();
        System.out.println("|--Adopta tu perro--|");
        System.out.println("Ingrese 1 para ver perros en adopcion disponibles");
        int menu = leer.nextInt();
        while (menu != 1) {
            System.out.println("Usted no ingreso 1 reintentelo nuevamente");
            menu = leer.nextInt();
        }
        switch (menu) {
            case 1:
                System.out.println("Perros disponibles :D");
                System.out.println(Perros.CANICHE.getRaza());
                System.out.println("Su nombre:\t" + Perros.CANICHE.getNombre());
                System.out.println("Sus años:\t" + Perros.CANICHE.getEdad());
                System.out.println("Su tamaño:\t" + Perros.CANICHE.getTamaño() + "CM");
                System.out.println("<-------------------------------------->");
                System.out.println(Perros.PITBULL.getRaza());
                System.out.println("Su nombre es:\t" + Perros.PITBULL.getNombre());
                System.out.println("Sus años:\t" + Perros.PITBULL.getEdad());
                System.out.println("Su tamaño:\t" + Perros.PITBULL.getTamaño() + "CM");
                break;

        }
        System.out.println("Ingresa tu nombre");
        String menu1=leer.next();
        menu1=menu1.toUpperCase();
        if(menu1.equals("JUAN") || menu1.equals("AGUSTIN")){
        if (menu == 1) {
            System.out.println("Reingresa tu nombre para verificar que estes incluido en la lista de adopcion");
            p.nombre1(leer.next());
            System.out.println("Ingresar raza para adoptar");
            String adopcion = leer.next();
            adopcion = adopcion.toUpperCase();
            if (adopcion.equals("CANICHE") || adopcion.equals("PITBULL")) {
                System.out.println("Usted adopto a un " + adopcion);

            } else {
                System.out.println("La raza ingresada no existe o no esta entre las opciones disponibles");
            }
        }
    }else{
            System.out.println("Usted no se encuentra en la lista de personas permitidas para adopcion");
        }
    }

}
