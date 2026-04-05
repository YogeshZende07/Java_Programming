package Number_Programs;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int Num= sc.nextInt();
		int Num1= Num;
		int Exp=0;
		int Fact=1;
		int Sum=0;
		while(Num!=0) {
		Exp++;
		Num/=10;
		
		for(int i=1;i<=Exp;i++) {
			Fact= Fact*Num1;
		}
		}
		
		System.out.println(Exp);
		System.out.println(Fact);
					
			
	}

}
