
package egg;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {

   
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         System.out.print("Ingrese una temperatura a convertir: ");
         double g = read.nextDouble();
         double f = 32 + (9 * g / 5);
         System.out.println("La temperatura en Fº es de: "+ f);
    }
    
}
