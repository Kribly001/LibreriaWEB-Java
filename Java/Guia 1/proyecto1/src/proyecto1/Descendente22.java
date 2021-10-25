
package proyecto1;

import java.util.Scanner;
public class Descendente22 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int[] numeros=new int[101];
    int i,j=0;
     for(i=(numeros.length)-1;i>=0;i--)
        {
            numeros[j]=i;
            j++;
        }
        
        String aux="";
        for(int elemento : numeros)
        {
            aux=aux+"["+elemento+"]";
        }
        System.out.print(aux);
    }
    
}
    
    

