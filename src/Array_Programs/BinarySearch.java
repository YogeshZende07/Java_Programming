package Array_Programs;

import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int[] arr, int target) {
		if(arr== null) {
			return -1;
		}
		int left=0;
		int right= arr.length-1;
		
		while(left<=right) {
			int mid= left+ (right- left)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			
			if(arr[mid]<target) {
				left= mid+1;
			}
			else {
				right= mid-1;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of an array");
		int size= sc.nextInt();
		int []arr= new int [size];
		System.out.println("Enter "+arr.length+" values");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println("enter vaue to search");
		int target= sc.nextInt();
		int result=binarySearch(arr,target);
		if(result!=-1) {
			System.out.println(target+" present at index: "+result);
		}
		
	}

}
