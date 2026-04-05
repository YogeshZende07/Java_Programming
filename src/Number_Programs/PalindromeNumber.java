package Number_Programs;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to check");
		int Num=sc.nextInt();
		int Temp=Num;
		int Sum=0;
		while(Num!=0) {
			int Rem=Num%10;
			Sum=Sum*10+Rem;
			Num/=10;
		}
		if(Sum==Temp) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not an Palindrome Number");
		}
	}

}
