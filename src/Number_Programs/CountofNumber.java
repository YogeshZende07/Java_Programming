package Number_Programs;

import java.util.Scanner;

public class CountofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int Num = sc.nextInt();
        int Count = 0;
    
        // FIX: Enclose all repetitive steps inside the do-while block
        do {
            Count++;
            Num /= 10; // Moves to the next digit
        } while (Num != 0); // Removed the infinite loop issue and structured it right
        
        System.out.println("Total digits: " + Count);
        sc.close();
    }
}
