package Number_Programs;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter number to check fibonacci Series");
		int Num=sc.nextInt();
		int First=0;
		int Second=1;
		for(int i=1;i<=Num;i++) {
			System.out.print(First+" ");
			int Third= First+Second;
			First=Second;
			Second=Third;
		}
		
	}

}
