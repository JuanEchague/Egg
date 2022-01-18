package egg;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio1 {

  public static void main(String[] args) {
  Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
      System.out.print("Ingrese un numero: ");
      int a = read.nextInt();
      System.out.print("ingrese otro numero: ");
      int b = read.nextInt();
      int c = a + b;
      System.out.println("La suma de ambos es: " + c);
    }
    
}
