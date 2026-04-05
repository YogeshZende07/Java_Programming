package Number_Programs;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int Num= sc.nextInt();
		int Temp=Num;
		int Sum=0;
		while(Num!=0) {
			int Rem = Num%10;
			int Fact=1;
			for(int i=1;i<=Rem;i++) {
				Fact*=i;
			}
			Sum+=Fact;
			Num/=10;
		}
		System.out.println(Sum);
		if(Sum==Temp) System.out.println(Sum+" is Strong Number");
		else System.out.println(Sum+" Not an Strong Number");
		
	}

}
