
package egg;

import java.util.Locale;
import java.util.Scanner;
/**
 * @author dark_
 */
public class Ejercicio8 {
    
//////////////////////////////////Codigo Principal/////////////////////////////////
     public static void main(String[] args) {
         Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         System.out.println("Ingrese la palabra 'eureka' ");
         String f = read.next();
         comparar(f);
    }
     
      
 ////////////////////////////////Funciones///////////////////////////////////
     
    public static void comparar(String f){
        
        if (f.equalsIgnoreCase("eureka")){
            System.out.println("Correcto!");
    }else{
            System.out.println("Incorrecto");
        }
    }
    //////////////////////////////////////////////////////////////////////////////
}
