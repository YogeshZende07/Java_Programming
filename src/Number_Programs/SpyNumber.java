package Number_Programs;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int Num =sc.nextInt();
		int Sum=0;
		int Prod=1;
		
		while(Num!=0) {
			int Rem=Num%10;
			Sum+=Rem;
			Prod*=Rem;
			Num/=10;
		}
		if(Sum==Prod) {
			System.out.println("Spy Number");
		}
		else
			System.out.println("Not an Spy Number");
		
		
	}

}
