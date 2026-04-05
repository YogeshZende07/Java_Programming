package Number_Programs;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to check");
		int Num=sc.nextInt();
		int Sum=0;
		for(int i=1;i<=Num/2;i++){
		if(Num%i==0) {
			
			Sum+=i;
		}
		}
		if(Sum==Num) {
			System.out.println(Num+" is a perfect Number");
		}
		else
			System.out.println(Num+" is not a Perfect Number");
	}

}
