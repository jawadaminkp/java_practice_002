
package java_practice_002;
import java.util.Scanner;

public class Java_practice_002 {

  
    public static void main(String[] args) {
      
        
        Scanner askme= new Scanner(System.in);
        
        System.out.print("Enter 1st number:");
        int num1 = askme.nextInt();
        
        
        System.out.print("Enter 2nd number:");
        int num2= askme.nextInt();
        
        int sum = num1 + num2;
        System.out.print("Sum is: "+sum );
        
        System.out.println("@javadaminkp");
        
        int mul = num1 * num2;
        
        System.out.print("Product is: " + mul);
        
        
        int sub = num2- num1;
        
        System.out.print("Subtractino is: " + sub);
    }
    
}
