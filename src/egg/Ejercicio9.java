package egg;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Ejercicio9 {

   //////////////////////////////////Codigo Principal/////////////////////////////////
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese una frase o palabra de 8 letras: ");
        String f = read.next();
        verificar_tamaño(f);
        
    }
    /////////////////////////////////Metodos//////////////////////////////////////////
    public static void verificar_tamaño(String f){
        if (f.length()!=8 ){
            System.out.println("Incorrecto");
        }else{
            System.out.println("Correcto");
        }
        
    }
    //////////////////////////////////Fin/////////////////////////////////////////////
}
