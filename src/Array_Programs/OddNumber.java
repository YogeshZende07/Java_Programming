package Array_Programs;
import java.util.Scanner;

public class OddNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a size of array");
		int size=s.nextInt();
		int[]arr=new int[size];
		System.out.println("enter the"+arr.length+"Number");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();}
		
		System.out.println("result");
		for (int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
			System.out.println(arr[i]);
		}
	}
		}
}
