package Number_Programs;

import java.util.Scanner;

public class PrimeUpperToLowerRange {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Lower Range");
		int LowerRange=sc.nextInt();
		System.out.println("Enter Higher Range");
		int HigherRange=sc.nextInt();
		System.out.println("prime number between "+LowerRange+" to "+HigherRange+" are:");
		for(int i=HigherRange;i>=LowerRange;i--) {
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
