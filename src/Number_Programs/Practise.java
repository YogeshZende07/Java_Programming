package Number_Programs;
import java.util.*;

public class Practise {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number to get  factorial");
		int num= sc.nextInt();
		int temp= num;
		int res=0;
		
		while(num!=0) {
			int rem= num%10;
			res= res*10+rem;
			num/=10;
		}
		
		if (res==temp) {
			System.out.println(temp+" is  a palindrome number");
		}
	}
}
