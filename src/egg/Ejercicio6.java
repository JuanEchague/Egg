
package egg;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {

  
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese él primer numero a comparar: ");
        int a = read.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = read.nextInt();
        if (a < b) {
            System.out.println("El numero mayor es: "+ b);
        } else {
            System.out.println("El numero mayor es: "+ a);
        }   
    }
    
}
