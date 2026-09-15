package Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArraybyK {
	public void rotate(int[]arr,int k) {
		if(arr==null || arr.length<=1) {
			return;
		}
		int n=arr.length;
		k=k%n;
		reverse(arr, 0, n-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
		for(int num:arr) {
			System.out.print(num+" ");
		}
		
	}
	private void reverse(int[]arr,int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size an array");
		int size= sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter "+arr.length+" values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter 'k' to rotate ");
		int k=sc.nextInt();
		RotateArraybyK r=new RotateArraybyK();
		System.out.println("Original array: "+Arrays.toString(arr));
		System.out.print("rotated array: ");
		r.rotate(arr, k);
	}

}
