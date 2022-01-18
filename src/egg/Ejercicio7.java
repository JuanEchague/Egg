
package egg;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese un numero: ");
        int n = read.nextInt();
        esPar(n);
    }
    public static void esPar(int n){
       
        if (n == 0) {

            System.out.println("Es cero");

        } else if(n % 2 == 0) {

            System.out.println("Es par");

        }else{
            
            System.out.println("Es impar");
            
        }
        
        

}
}