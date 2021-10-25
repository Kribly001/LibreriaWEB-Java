
package proyectopoo2.ejercicioo6;

import java.util.Scanner;


public class Cafetera_Servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cafetera datos = new Cafetera();

    public void MAX() {
        datos.setCantidad_max(20.0);
    }

    public void llenar_cafetera() {
        datos.setCantidad_actual(20.0);
        System.out.println(datos.getCantidad_actual());
    }

    public void Servir_Taza() {
        double cantidad_max = datos.getCantidad_max();
        double cantidad_actual = datos.getCantidad_actual();
        double vaso = datos.getVaso();
        do {
            System.out.println("Elija el tamaño del vaso (120cc,220cc,330cc,430cc)");
            datos.setVaso((leer.nextDouble()) / 1000);
            System.out.println(datos.getVaso());
        } while (vaso == 0.12 || vaso==220 || vaso==0.33 || vaso==0.43);
        vaso = datos.getVaso();
        if (cantidad_actual != 0) {    
            if(vaso<=cantidad_actual)
            {
                datos.setCantidad_actual(cantidad_actual - vaso);
            }else{
                System.out.println("No hay suficiente cafe para llenar el vaso");
                datos.setCantidad_actual(0);
            }
        } else {
            System.out.println("No hay Cafe");
        }
    }

    public void Vaciar_Cafetera() {
        datos.setCantidad_actual(0);
    }

    public void Agregar_Cafe() {
        double cantidad_max = datos.getCantidad_max();
        double cantidad_actual = datos.getCantidad_actual();
        System.out.println("Ingrese la cantidad de cafe a cargar:");
        datos.setAgregar_cafe(leer.nextDouble());
        double agregar_cafe = datos.getAgregar_cafe();
        if (agregar_cafe > cantidad_max) {
            System.out.println("Cantidad ingresada sobrepasa la cantidad_max");
        } else {
            if ((agregar_cafe + cantidad_actual) > cantidad_max) {
                System.out.println("Cantidad ingresada sobrepasa la cantidad_max");
            } else {
                datos.setCantidad_actual(cantidad_actual + agregar_cafe);
                System.out.println("Se Agrego el cafe correctamente");
            }
        }
    }

    public void menu() {
        System.out.println("BIENVENIDO A CAFE EGG");
        System.out.println("1-Llenar Cafetera");
        System.out.println("2-Servir Taza");
        System.out.println("3-Vacian Cafetera");
        System.out.println("4-Agregar Cafe");
        System.out.println("5-Apagar");
    }

    public void datos_cafetera() {
        System.out.println("Cafetera{Cantidad_max:" + datos.getCantidad_max() + " lt Cantidad_actual:" + datos.getCantidad_actual() + " lt Vaso:" + datos.getVaso() + " lt Agregar_cafe:" + datos.getAgregar_cafe() + " lt");
    }
}


