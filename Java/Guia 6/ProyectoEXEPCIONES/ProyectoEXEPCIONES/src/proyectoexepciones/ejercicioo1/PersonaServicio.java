package proyectoexepciones.ejercicioo1;

import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final int IMC_BAJO = -1;
    private final int IMC_IDEAL = 0;
    private final int IMC_ALTO = 1;

    public Persona crearPersona() {
        System.out.println("Ingresar nombre");
        String nombre = leer.next();
        System.out.println("Ingresar edad");
        int edad = leer.nextInt();
        System.out.println("Ingresar sexo--->Hombre('H'), Mujer('M'), Otro('O')");
        char sexo = Character.toUpperCase(leer.next().charAt(0));
        System.out.println("Ingresar peso en (kg)");
        double peso = leer.nextDouble();
        System.out.println("Ingresar Altura");
        double altura = leer.nextDouble();

        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Ingrese un sexo valido");
            sexo = Character.toUpperCase(leer.next().charAt(0));
        }
        while (peso < 1) {
            System.out.println("Ingrese un peso superior a cero");
            peso = leer.nextDouble();
        }
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona p) {
        double altura = p.getAltura();
        double peso = p.getPeso();
        double imc = peso / (Math.pow(altura, 2));
        if (imc < 20) {
            return IMC_BAJO;
        } else if (imc > 25) {
            return IMC_ALTO;
        } else {
            return IMC_IDEAL;
        }
    }

    public boolean esMayordeEdad(Persona p) {

        return p.getEdad() >= 18;
    }

    public Persona[] crearPersonas(int cant) {
        Persona[] personas = new Persona[cant];

        for (int i = 0; i < personas.length; i++) {
            personas[i] = crearPersona();
        }
        return personas;
    }

    public void porcentajesPeso(Persona[] personas) {
        int contadorAlto = 0;
        int contadorBajo = 0;
        int contadorIdeal = 0;
        int cantidadPersonas = personas.length;

        for (Persona persona : personas) {
            switch (calcularIMC(persona)) {
                case -1:
                    System.out.println(persona.getNombre() + " esta por debajo del peso ideal");
                    contadorBajo++;
                    break;
                case 0:
                    System.out.println(persona.getNombre() + " esta en el peso ideal");
                    contadorIdeal++;
                    break;
                case 1:
                    System.out.println(persona.getNombre() + " esta por encima del peso ideal");
                    contadorAlto++;
                    break;
            }
        }
        System.out.println("Hay " + (contadorBajo * 100 / 4) / cantidadPersonas + " % de personas estan por debajo de su peso ideal");
        System.out.println("Hay " + (contadorIdeal * 100 / 4) / cantidadPersonas + " % de personas estan en su peso ideal");
        System.out.println("Hay " + (contadorAlto * 100 / 4) / cantidadPersonas + " % de personas estan por encima de su peso ideal");
    }

    public void porcentajeEdad(Persona[] personas) {
        int cantidadPersonas = personas.length;
        int contadorMayor = 0;

        for (Persona persona : personas) {
            if (esMayordeEdad(persona)) {
                contadorMayor++;
                System.out.println(persona.getNombre() + " es mayor de edad!");
            }
        }
        System.out.println("Hay " + ((contadorMayor * 100) / cantidadPersonas) + " % de mayores de edad");
        System.out.println("Hay " + (((cantidadPersonas - contadorMayor) * 100) / cantidadPersonas) + " % menores de edad");
    }

}
