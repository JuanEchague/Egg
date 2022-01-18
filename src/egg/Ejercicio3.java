
package egg;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

    
    public static void main(String[] args) {
      Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese una frase a convertir: ");
        String f = read.next();
        String fmay = f.toUpperCase();
        String fmin = f.toLowerCase();
        System.out.println("La frase en mayusculas es: "+ fmay);
        System.out.println("La frase en minusculas es: "+ fmin);
    }
    
}
