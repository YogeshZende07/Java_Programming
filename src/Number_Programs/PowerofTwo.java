package Number_Programs;

import java.util.Scanner;

public class PowerofTwo {
	public static boolean isPower(int num) {
		if(num<=0) {
			return false;	
		}
		while(num>1) {
			if(num%2!=0) {
				return false;
			}
			num/=2;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number to check");
		int num= sc.nextInt();
		if(isPower(num)) {
			System.out.println(num+" is power of 2");
		}
		else
			System.out.println(num+" is not power of 2");
		
		
	}

}
