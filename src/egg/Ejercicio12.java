package egg;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Ejercicio12 {
private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
   //////////////////////////////////Codigo Principal/////////////////////////////////
    public static void main(String[] args) {
        verificar();
    }
    /////////////////////////////////Metodos//////////////////////////////////////////
    public static void verificar(){
         System.out.println("Ingrese una nota entre 0 y 10: ");
       int n = read.nextInt();
       
      while (n < 0 || n > 10) {

            System.out.println("Nota incorrecta, ingrese la nota de nuevo");
            n = read.nextInt();

        }
        
        System.out.println("Nota correcta");
        }
    
    //////////////////////////////////Fin/////////////////////////////////////////////
}
