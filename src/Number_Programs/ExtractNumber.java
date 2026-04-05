package Number_Programs;

import java.util.Scanner;

public class ExtractNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int Num=sc.nextInt();
	while(Num!=0) {
		int rem=Num%10;
		System.out.print(rem);
		Num/=10;
	}
	
}
}
