package Number_Programs;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter base");
		int Base= sc.nextInt();
		System.out.println("Enter exp");
		int Exp= sc.nextInt();
		int Power=1;
		for(int i=1;i<=Exp;i++) {
			Power=Power*Base;
		}
		System.out.println(Power);
		
	}
	

}
