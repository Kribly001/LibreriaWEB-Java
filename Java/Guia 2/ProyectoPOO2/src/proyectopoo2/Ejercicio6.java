package proyectopoo2;

import java.util.Scanner;
import proyectopoo2.ejercicioo6.Cafetera_Servicio;

public class Ejercicio6 {
    public static void main(String[] args) {
        Cafetera_Servicio datos = new Cafetera_Servicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String apagar = "";
        datos.menu();   
        datos.MAX(); 
        int opc;
        do {
            datos.datos_cafetera();
            System.out.print("opc ➤");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    datos.llenar_cafetera();
                    break;
                case 2:
                    datos.Servir_Taza();
                    break;
                case 3:
                    datos.Vaciar_Cafetera();
                    break;
                case 4:
                    datos.Agregar_Cafe();
                    break;
                case 5:
                    apagar = "OFF";
                    break;
                default:
                    System.out.println("Error");
            }     
        } while (opc < 5 || !apagar.equals("OFF"));       
    }
}

   

    


