package proyectopoo2.ejercicioo6;

import java.util.Scanner;

public class Cafetera {

   private double cantidad_max,cantidad_actual,vaso,agregar_cafe;
    
    public Cafetera() {
        
    }

    public Cafetera(double cantidad_max, double cantidad_actual, double vaso, double agregar_cafe) {
        this.cantidad_max = cantidad_max;
        this.cantidad_actual = cantidad_actual;
        this.vaso = vaso;
        this.agregar_cafe = agregar_cafe;
    }
    
    public Cafetera(double cantidad_max, double cantidad_actual) {
        this.cantidad_max = cantidad_max;
        this.cantidad_actual = cantidad_actual;
    }
    
    public void setCantidad_max(double cantidad_max) {
        this.cantidad_max = cantidad_max;
    }

    public void setCantidad_actual(double cantidad_actual) {
        this.cantidad_actual = cantidad_actual;
    }

    public void setVaso(double vaso) {
        this.vaso = vaso;
    }

    public double getCantidad_max() {
        return cantidad_max;
    }

    public double getCantidad_actual() {
        return cantidad_actual;
    }

    public double getVaso() {
        return vaso;
    }

    public void setAgregar_cafe(double agregar_cafe) {
        this.agregar_cafe = agregar_cafe;
    }

    public double getAgregar_cafe() {
        return agregar_cafe;
    }   
}
