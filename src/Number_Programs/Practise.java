package Number_Programs;

import java.util.*;

import Array_Programs.LinearSearch;

public class Practise {
	public static void main(String[]args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		
		int arr[]= new int[size];
		System.out.println("Enter "+arr.length+" values to store into an array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("orginal Array:");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		bubbleSort(arr);
	
	}
	
	public static void bubbleSort(int[]arr) {
		if(arr==null || arr.length<=1) {
			System.out.println("atleast 2 element should present");
			return;
		}
		int n=arr.length-1;
		boolean swapped;
		for(int i=0;i<=n;i++) {
			swapped=false;
			for(int j=0;j<n-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		System.out.println("Sorted Array:");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		
	}
}
