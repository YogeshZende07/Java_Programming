package Number_Programs;

import java.util.Scanner;

public class PrimeNumberUsingMethod {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number to check");
		int num=sc.nextInt();
		if(isPrime(num)) {
			System.out.println(num+" is a prime Number");
		}
		else
			System.out.println(num+" is not a prime number");

	}
	public static boolean isPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count==2;
	}

}
