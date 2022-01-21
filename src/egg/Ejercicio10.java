package egg;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Ejercicio10 {

   //////////////////////////////////Codigo Principal/////////////////////////////////
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese una palabra que comience con 'A': ");
        String f = read.next();
        verificar(f);
    }
    /////////////////////////////////Metodos//////////////////////////////////////////
    public static void verificar(String f){
        if(f.substring(0,1).equalsIgnoreCase("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    //////////////////////////////////Fin/////////////////////////////////////////////
}
