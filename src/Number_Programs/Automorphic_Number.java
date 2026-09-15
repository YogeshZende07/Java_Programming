package Number_Programs;

import java.util.Scanner;

public class Automorphic_Number {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to check its a Automorphic or not ");
		int num=sc.nextInt();
		int temp=num;
		int square= num*num;
		int digit=0;
		
		while(temp!=0) {
			digit++;
			temp/=10;
		}
		int divisor=1;
		for(int i=1;i<=digit;i++) {
			divisor*=10;
			
		}
		int lastdigit= square%divisor;
		System.out.println("square: "+square);
		System.out.println("last Digit: "+lastdigit);
		
		if(lastdigit==num) {
			System.out.println(num+" is a automorphic number");
		}
		else
			System.out.println(num+" is not automorphic number");
	}

}
