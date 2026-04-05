package Number_Programs;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number to reverse");
		int Num=sc.nextInt();
		int sum=0;
		while(Num!=0) {
			int Rem=Num%10;
			sum=sum*10+Rem;
			Num/=10;
		}
		System.out.println(sum);
	}

}
