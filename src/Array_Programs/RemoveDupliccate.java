package Array_Programs;

import java.util.Scanner;

public class RemoveDupliccate {
	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter size of an array");
//		int size= sc.nextInt();
//		int []arr= new int [size];
//		System.out.println("enter "+arr.length+" elements to store in an array");
//		for (int i=0;i<arr.length;i++) {
//			arr[i]= sc.nextInt();
//		}
		int[]arr= {1,2,2,1,2,2,1,2,1,2,2,3,1,4,2,21};

		RemoveDupliccate rd=new RemoveDupliccate();
		System.out.println();rd.sort(arr);
		System.out.println();
		int uniqueLength=rd.removeDuplicate(arr);
		for( int i=0;i<uniqueLength;i++) {
			System.out.print(arr[i]+" ");
		}


	}
	public void sort(int []arr) {
		if(arr==  null|| arr.length<=1) {
			return;
		}
		int n=arr.length;
		for( int i=1;i<n;i++) {
			int key= arr[i];
			int j= i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for(int num :arr) {
			System.out.print(num+" ");
		}
		
	}
	public int removeDuplicate(int [] arr) {
		if(arr==  null|| arr.length<=1) {
			return 0;
		}
		int uniqueIndex=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!= arr[uniqueIndex]) {
				uniqueIndex++;
				arr[uniqueIndex]=arr[i];
			}
		}
		return uniqueIndex+1;
	}
	// Another way to remove duplicate.
	
	public void swayToRemoveDuplicate(int []arr) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			boolean isDuplicate= false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
