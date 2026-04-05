package Number_Programs;
import java.util.*;
public class Factors {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number to check factorial");
		int Num= sc.nextInt();
		for(int i=1;i<=Num;i++) {
			if(Num %i==0) {
				System.out.print( i+", ");
		    }  
		}
	}
}
