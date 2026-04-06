package Number_Programs;
import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter Starting range");
		int LowerRange = sc.nextInt();
		System.out.println("enter end");
		int HIgherRange = sc.nextInt();
		
		for(int i= LowerRange;i<=HIgherRange;i++) {
			int count=0;
			for(int j=1; j<=i;  j++) {
				if (i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+" ");  
		
			}
			
	    }
		
	}
}
