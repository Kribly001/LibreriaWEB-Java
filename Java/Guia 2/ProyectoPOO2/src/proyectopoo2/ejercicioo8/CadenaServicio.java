package proyectopoo2.ejercicioo8;

import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena datos = new Cadena();

    public void cargar(String Fr_o_Pal) {
        datos.setFraseopalabra(Fr_o_Pal);
        datos.setLong_frase(Fr_o_Pal.length());
        System.out.print("La longitud de la Frase es: " + datos.getLong_frase() + "\n");
    }

    public void quedeseahacer() {
        System.out.println("Que desea hacer?");
        System.out.println("1_Contabilizar cantidad de vocales");
        System.out.println("2_Invertir frase");
        System.out.println("3_Ingresar letra y ver cuanto se repitio");
        System.out.println("4_Comparar longitudes de frases");
        System.out.println("5_Unir diferentes frases");
        System.out.println("6_Reemplazar letras (a)");
        System.out.println("7_Comprobar si contiene letra ingresada");
    }

    public int Mostrar_Vocales() {
        int vocales = 0;
        String fraseopalabra = datos.getFraseopalabra().toUpperCase();
        for (int i = 0; i < datos.getLong_frase(); i++) {
            switch (fraseopalabra.substring(i, i + 1)) {
                case "A":
                    vocales++;
                    break;
                case "E":
                    vocales++;
                    break;
                case "I":
                    vocales++;
                    break;
                case "O":
                    vocales++;
                    break;
                case "U":
                    vocales++;
                    break;
            }
        }
        return vocales;

    }

    public void invertirfrase() {

        String invertido = "";
        for (int i = datos.getLong_frase(); i > 0; i--) {
            invertido = invertido.concat(datos.getFraseopalabra().substring(i - 1, i));
        }
        System.out.println("La frase invertida:" + invertido);
    }

    public int vecesrepetido(String letra) {
        int repetidos = 0;
        String fraseopalabra = datos.getFraseopalabra().toUpperCase();
        for (int i = 0; i < datos.getLong_frase(); i++) {
            if (fraseopalabra.substring(i, i + 1).equals(letra.toUpperCase())) {
                repetidos++;
            }
        }
        return repetidos;
    }

    public void compararlongitud(String newfrase) {
        int frase1 = datos.getFraseopalabra().length();
        int frase2 = newfrase.length();
        if (frase1 == frase2) {
            System.out.println("Las 2 frases tienen la misma longitud");
        } else {
            System.out.println("Las frases tienen diferente longitud");

        }
    }

    public void unirfrases(String unir) {
        String frase1 = datos.getFraseopalabra();
        String frase2 = unir;
        System.out.println(frase1 + " " + " " + frase2);

    }

    public void cambiarletra(String simbolo) {
        String fraseopalabra = datos.getFraseopalabra().toUpperCase().replace("A", simbolo);
        System.out.println("La frase resultante: " + fraseopalabra);

    }
   public void Contiene(String Letra){
       int verificador=0;
       String fraseopalabra=datos.getFraseopalabra().toUpperCase();
       System.out.println(datos.getFraseopalabra());
       for (int i = 0; i < datos.getLong_frase(); i++) {
           if(fraseopalabra.substring(i, i+1).equals(Letra.toUpperCase())){
               System.out.println("La frase contiene la letra?: "+true);
               verificador=1;
               break;
             }   
       }
       if(verificador==0){
           System.out.println("La frase contiene la letra?: "+false);
       }
   }
}


        
    

