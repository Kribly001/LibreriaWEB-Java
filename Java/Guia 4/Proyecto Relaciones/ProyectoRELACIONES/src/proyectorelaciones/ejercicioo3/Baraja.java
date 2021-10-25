package proyectorelaciones.ejercicioo3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Baraja {

    private ArrayList<Cartas> carta;
    private Integer Siguiente;
    private ArrayList<Cartas> monton;

    public Baraja() {
        this.carta = new ArrayList();
        this.Siguiente = 0;
        this.monton = new ArrayList();
    }

    public Baraja(ArrayList<Cartas> carta) {
        this.carta = carta;
    }

    public ArrayList<Cartas> getCarta() {
        return carta;
    }

    public void setCarta(ArrayList<Cartas> carta) {
        this.carta = carta;
    }

    public void Crear_Baraja() {
        String palo = "";
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 12; j++) {
                if (j == 8 || j == 9) {
                } else {
                    switch (i) {
                        case 1:
                            palo = "ESPADA";
                            break;
                        case 2:
                            palo = "ORO";
                            break;
                        case 3:
                            palo = "BASTO";
                            break;
                        case 4:
                            palo = "COPA";
                            break;
                    }
                    Cartas name = new Cartas(j, palo);
                    carta.add(name);
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(carta);
    }

    public void siguienteCarta() {
        if (carta.isEmpty()) {
            System.out.println("No hay mas cartas en la baraja.");
        } else {
            System.out.println(carta.get(Siguiente));
        }
        Siguiente++;
    }

    public void cartasDisponibles() {
        System.out.println("Cartas disponibles: " + carta.size());
    }

    public void darCartas() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Cuantas cartas quieres? : ");
        Integer cantidad_de_cartas = leer.nextInt();
        for (int i = 0; i < cantidad_de_cartas; i++) {
            monton.add(carta.get(i));
            carta.remove(i);
        }
    }

    public void cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("No ha repartido ninguna carta");
        } else {
            monton.forEach(aux -> System.out.println(aux));
        }
    }

    public void mostrarBaraja() {
        carta.forEach(aux -> System.out.println(aux));
    }

    public void menu() {
        System.out.println("<<<<< Menu >>>>>");
        System.out.println("1- Barajar");
        System.out.println("2- Mostrar Siguiente Carta en la Baraja");
        System.out.println("3- Nº de cartas diponibles");
        System.out.println("4- Dar Cartas");
        System.out.println("5- Mostrar las cartas repartidas");
        System.out.println("6- Mostrar Baraja");
        System.out.println("7- Salir ");
    }

    public void Unificacion_Metodos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String verificacion = "";
        do {
            menu();
            Integer opc = leer.nextInt();
            switch (opc) {
                case 1:
                    barajar();
                    System.out.println("Barajar,Listo!!!");
                    break;
                case 2:
                    siguienteCarta();
                    break;
                case 3:
                    cartasDisponibles();
                    break;
                case 4:
                    darCartas();
                    System.out.println("Carta repartida!!!");
                    break;
                case 5:
                    cartasMonton();
                    break;
                case 6:
                    mostrarBaraja();
                    break;
                case 7:
                    System.out.println("Estas seguro que desea salir?(S/N)");
                    verificacion = leer.next();
                    break;
            }
        } while (!verificacion.equals("S"));
    }

    @Override
    public String toString() {
        return "Baraja{" + "carta=" + carta + '}';
    }

}
