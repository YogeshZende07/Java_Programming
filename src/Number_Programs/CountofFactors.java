package Number_Programs;
import java.util.*;
public class CountofFactors {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in) ;
		System.out.println("Enter a Number");
		int Num= sc.nextInt();
		int Count=0;
		for(int i=1;i<=Num;i++) {
			if(Num%i==0) {
				Count++;
			}
		}
		System.out.println("Total count of Factorial of "+Num+" is "+Count);
    }
}
