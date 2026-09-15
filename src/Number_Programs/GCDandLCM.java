package Number_Programs;

import java.util.Scanner;

public class GCDandLCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1= sc.nextInt();
		System.out.println("enter second digit");
		int num2= sc.nextInt();
		System.out.println("gcd is "+ getGCD(num1, num2));
		System.out.println("LCM is "+ getLCM(num1, num2));
	}
	public static int getGCD(int a, int b) {
		while(b!=0) {
			int rem= a%b;
			a=b;
			b=rem;
			
		}
		return a;
	}
	public static int getLCM(int a,int b) {
		return (a*b)/getGCD(a, b);
		
	}
	
	
}

