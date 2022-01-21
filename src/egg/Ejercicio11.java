package egg;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Ejercicio11 {

   //////////////////////////////////Codigo Principal/////////////////////////////////
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el tipo de motor:");
        int tm = read.nextInt(); 
        opciones(tm);
        
    }
    /////////////////////////////////Metodos//////////////////////////////////////////
    public static void opciones(int tm){
        switch (tm) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido para el tipo de bomba");
        }
    }
    //////////////////////////////////Fin/////////////////////////////////////////////
}
