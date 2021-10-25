package proyectopoo2.ejercicioo9;

public class matematica_servicio {

    Matematicas datos = new Matematicas();

    public void Crear_Numero() {
        datos.setNumero1((double) Math.random() * (9 - 0 + 1) + 0);
        System.out.print("Numero1: " + datos.getNumero1() + "\n");

        datos.setNumero2((double) Math.random() * (9 - 0 + 1) + 0);
        System.out.print("Numero2: " + datos.getNumero2() + "\n");
    }

    public void Mayor_Valor() {
        datos.setAux(Math.max(datos.getNumero1(), datos.getNumero2()));
        System.out.println("El Mayor es: " + datos.getAux());
    }

    public void Potencia() {
        datos.setNumero1(Math.max(datos.getNumero1(), datos.getNumero2()));
        datos.setNumero2(Math.min(datos.getNumero1(), datos.getNumero2()));
        System.out.println("Potencia: " + Math.pow(datos.getNumero1(), datos.getNumero2()));
    }

    public void Calcular_Raiz() {
        datos.setAux(Math.min(datos.getNumero1(), datos.getNumero2()));
        datos.setAux(Math.abs(datos.getAux()));
        System.out.println("Raiz Cuadrada: " + Math.sqrt(datos.getAux()));
    }
}
