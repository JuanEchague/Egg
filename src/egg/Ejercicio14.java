package egg;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Ejercicio14{ 
private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
   //////////////////////////////////Codigo Principal/////////////////////////////////
    public static void main(String[] args) {
        char o = 'N';
        System.out.println("Ingrese el valor de A: ");
        double a=read.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        double b= read.nextDouble();
        menu(a,b,o);
    }
    /////////////////////////////////Metodos//////////////////////////////////////////
    public static void menu(double a, double b,char o){
        
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        System.out.println("5) Salir");
        
        int op= read.nextInt();
        do {
       
        
        switch (op) {
            case 1:
                sumar(a,b);
              
                break;
            case 2:
                restar(a,b);
               
                break;
            case 3:
                multiplicar(a,b);
                
                break;
            case 4:
                dividir(a,b);
                
                break;
            case 5:
                
                System.out.println("Esta seguro? (S/N)");
                o = Character.toUpperCase(read.next().charAt(0));
                while (o!='N' && o!='S'){
                    System.out.println("Ingrese una opcion valida: ");
                    o = Character.toUpperCase(read.next().charAt(0));
                }
                break;
            default:
                System.out.println("Opcion invalida");
        
        }    
        } while (o == 'N');
    }
        
        
    ////////////////////////////////////////////////////////////////////////////////////
    public static void sumar(double a, double b){
        System.out.printf("La suma de %.2f mas %.2f es igual a %.2f \n",a,b,a+b);
    }
    ////////////////////////////////////////////////////////////////////////////////////
     public static void restar(double a, double b){
         System.out.printf("La resta de %.2f menos %.2f es %.2f \n",a,b,a-b);
    }
     ///////////////////////////////////////////////////////////////////////////////////
    public static void multiplicar(double a, double b){
        System.out.printf("La multiplicacion de %.2f por %.2f es %.2f \n",a,b,a*b);
    }
      //////////////////////////////////////////////////////////////////////////////////
    public static void dividir(double a, double b){
        if (b!=0) {
            System.out.printf("La division de %.2f por %.2f es %.2f \n",a,b,a/b);
        }else{
            System.out.println("No se puede dividir por 0 ");
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////
    
   
    //////////////////////////////////Fin///////////////////////////////////////////////
}
