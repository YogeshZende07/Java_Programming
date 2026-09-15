package Pattern_Programe;
import java.util.*;
public class Neon_Number {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int temp=num;
		int square=num*num;
		int sum=0;
		
		while(square!=0) {
			int digit= square%10;
			sum+=digit;
			square/=10;
			
		}
		System.out.println("Addition of square digit is: "+sum);
		if(num==sum) {
			System.out.println(num+" is a neon number");
		}
		else
			System.out.println(num+" is not neon number");
	}

}
