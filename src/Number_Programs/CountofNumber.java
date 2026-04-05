package Number_Programs;

import java.util.Scanner;

public class CountofNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int Num=sc.nextInt();
		int Count=0;
	
		do {
			Count++;
		}
		while(Num!=0) ;
			Count++;
			System.out.println(Count);
			Num/=10;
	}
		
	

}
