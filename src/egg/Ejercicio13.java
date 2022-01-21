package egg;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Ejercicio13 { 
private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
   //////////////////////////////////Codigo Principal/////////////////////////////////
    public static void main(String[] args) {
        System.out.println("Ingrese el numero limite positivo: ");
        int n = read.nextInt();
        comparar(n);
    }
    /////////////////////////////////Metodos//////////////////////////////////////////
    public static void comparar(int n){
         int s= 0;
        
     
       while ( n > s) {
            System.out.println("Ingrese un numero");
            s = s + read.nextInt(); 
           
            

        }
        System.out.println("Se exedio el limite");
        System.out.println("valor limite: "+ n);
        System.out.println("suma: "+s);
        }
    
    //////////////////////////////////Fin/////////////////////////////////////////////
}
