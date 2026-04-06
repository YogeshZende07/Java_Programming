package Number_Programs;

import java.util.Scanner;

public class PrimeNumberInRange {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a starting number of Range");
		int LowerRange= sc.nextInt();
		System.out.println("enter a ending number of Range");
		int HigherRange =sc.nextInt();
		for (int i=LowerRange;i<=HigherRange;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				
				}
			if(count==2) {
				System.out.print(i+" ");
			}
			
		}
		
		
	
	}
	
}
