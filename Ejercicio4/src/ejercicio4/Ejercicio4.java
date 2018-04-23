
package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int pariedad=scan.nextInt();
        if(pariedad%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
    
}
