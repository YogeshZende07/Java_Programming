 package Array_Programs;

import java.util.Scanner;

public class LinearSearch {
	public static int search(int arr[], int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
			
		}
		return -1;
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size  of array");
		int size= sc.nextInt();
		int [] num=new int[size];
		System.out.println("Enter " + num.length+" values");
		
		for(int i=0;i<num.length;i++) {
			num[i]= sc.nextInt();
		}
		System.out.println("Enter value to search");
		int target= sc.nextInt();
		int result=search(num, target);
		if(result!=-1) {
			System.out.println("element  found at index "+ result);
		}
		else
			System.out.println("element not found in the array");
	}

}
