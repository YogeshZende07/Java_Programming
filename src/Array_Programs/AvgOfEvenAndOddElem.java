
package Array_Programs;
import java.util.Scanner;
public class AvgOfEvenAndOddElem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size  of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int sum=0;
		int evensum=0;
		int oddsum=0;
		int evencount=0;
		int oddcount=0;
		System.out.println("enter the "+arr.length+" values");;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
			if(arr[i]%2==0) {
				evensum+=arr[i];
				evencount++;
			}
			else {
				oddsum+=arr[i];
				oddcount++;
			}
		}
			

			System.out.println("Average of all element  is  :"+sum/arr.length);
			System.out.println("average  of even element is :"+evensum/evencount);
			System.out.println("average  of odd element is :"+oddsum/oddcount);
			
					
						
}
}
//