
package egg;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

    
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese un numero: ");
        double n = read.nextDouble();
        double nx2 = n * 2;
        double nx3 = n *3;
        double n2 = Math.sqrt(n);
        System.out.println("El doble es: "+ nx2);
        System.out.println("El triple es: "+ nx3);
        System.out.println("La raiz es: "+ n2);
    }
    
}
