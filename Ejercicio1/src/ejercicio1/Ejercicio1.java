
package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        
        double fahrenheit=scan.nextDouble();
        double celsius=((fahrenheit-32)*5)/9;
        if(fahrenheit>=0&&fahrenheit<=100){
            System.out.println("En celsius es:"+ celsius);
        }else{
            System.out.println("Mal ingresado en Fahrenheit");
            
    }
    
}
