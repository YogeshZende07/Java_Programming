package Number_Programs;
import java.util.*;

public class Practise {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter Number");
			int Num= sc.nextInt();
			while(Num!=0) {
				int Rem=Num%10;
				System.out.print
				(Rem);
				Num/=10;
			}
		
	}

}
