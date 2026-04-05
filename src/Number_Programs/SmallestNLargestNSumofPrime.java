package Number_Programs;

import java.util.Scanner;

public class SmallestNLargestNSumofPrime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a lower Range");
		int LowerRange=sc.nextInt();
		System.out.println("Enter a Higher Range");
		int HigherRange=sc.nextInt();
		int Smallest=0;
		int Largest=0;
		int Sum=0;
		for(int i=LowerRange;i<=HigherRange;i++) {
			if(isPrime(i)) {
				Smallest=i;
				System.out.println("Smallest Prime number is: "+i);
				break;
			}
			
		}
		for(int j=HigherRange;j>=LowerRange;j--) {
			if(isPrime(j)) {
				Largest=j;
				System.out.println("Largest prime number is: "+j);
				break;
			}
		}
		 Sum=Smallest+ Largest;
		System.out.println("Sum is: "+Sum);
		
		
	}
	public static boolean isPrime(int Num) {
		int Count=0;
		for(int i=1;i<=Num;i++) {
		   if(Num%i==0) {
			   Count++;
		   }	
		    
		}
		return Count==2;
	}

}
