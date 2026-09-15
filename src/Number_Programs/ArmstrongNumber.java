package Number_Programs;
import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        int temp = number;
        
        int exp = 0;
       
        while (temp != 0) {
            exp++;
            temp /= 10; // FIX 1: Added this to prevent the infinite loop
        }
         
        int sum = 0;
        temp = number; 
        while (temp != 0) {
            int digit = temp % 10; 
             
            int fact = 1;
            for (int i = 1; i <= exp; i++) {
                fact *= digit;
            }
             
            sum += fact;
            temp /= 10; 
        }
         
        // FIX 2 & 3: Replaced 'result' with 'sum' to match your calculation
        if (sum == number) { 
            System.out.println("no.is armstrong");
        }
        else {
            System.out.println("not a armstrong1");
        }
    }
}