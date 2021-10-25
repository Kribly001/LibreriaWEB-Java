package proyectopoo2.ejercicioo10;

import java.util.Arrays;

public class ArregloServicio {

    public void crearnumeros() {
        System.out.println("<<< Arreglo A >>>");
        double arregloA[] = new double[50];
        crear_Arreglo(arregloA);
        System.out.println(Arrays.toString(arregloA));
        System.out.println("\n<<< Arreglo A (menor a mayor)>>>");
        Arrays.sort(arregloA);
        System.out.println(Arrays.toString(arregloA));

        System.out.println("\n<<< Arreglo B >>>");
        double arregloB[] = new double[20];
        arregloB = Arrays.copyOf(arregloA, 20);
        Arrays.fill(arregloB, 10, 20, 0.5);
        System.out.println(Arrays.toString(arregloB));
    }

    public static void crear_Arreglo(double arregloA[]) {
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (double) Math.random() * (9 - 0 + 1) + 0;
            double truncar = Math.pow(10, 1);
            arregloA[i] = Math.round(arregloA[i] * truncar) / truncar;
        }
    }
}
