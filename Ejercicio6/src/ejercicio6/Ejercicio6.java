
package ejercicio6;
import java.util.Scanner;
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        boolean estanevando=false;
        boolean estalloviendo= true;
        double temperatura=60.0;
        
        if(estanevando){
            System.out.println("Nos quedamos en casa");
        }else if(estalloviendo){
            System.out.println("Nos quedamos en casa");
        }else if(temperatura < 10){
            System.out.println("Nos quedamos en casa");
        }else {
            System.out.println("Vamos a fuera");
        }
                
    }
    
}
