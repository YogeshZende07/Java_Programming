package Array_Programs;
import java.util.Scanner;
public class ReverseTheElement {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr []=new int[size];
		System.out.println("enter the"+arr.length+"number");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		// logic to reverse array
		int start=0;
		int end=arr.length-1;
		
		
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		System.out.println("the result is :");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	

}///wajp for array palindrome
