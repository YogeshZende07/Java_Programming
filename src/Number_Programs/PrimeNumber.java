package Number_Programs;
import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int Num= sc.nextInt();
		int count =0;
		for(int i=1;i<=Num;i++) {
			if(Num%i==0) {
				count++;
				
			}
		}
		if(count==2) {
			System.out.println(Num+" is prime number");
		}
		else
			System.out.println(Num+" is not prime number");
		
	}

}
