
package egg;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {
      Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingresse un nombre: ");
        String n = read.next();
        System.out.println("El nombre ingresado es: "+ n);
    }
    
}
