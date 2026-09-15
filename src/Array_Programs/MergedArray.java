package Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class MergedArray {
	public static int[] merged(int []arr1,int []arr2) {
		int n1=arr1.length;
		int n2=arr2.length;
		int[]merged=new int[n1+n2];
		int i=0,j=0,k=0;
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				merged[k]=arr1[i];
				i++;
			}
			else {
				merged[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			merged[k]=arr1[i];
			i++;
			k++;
		}
		while(j<n2) {
			merged[k]=arr2[j];
			j++;
			k++;
		}
		return merged;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of an array 1");
		int size1=sc.nextInt();
		int []arr1=new int [size1];
		System.out.println("Enter "+arr1.length+" to store in an array1");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter size of an array 2");
		int size2=sc.nextInt();
		int []arr2=new int [size2];
		System.out.println("Enter "+arr2.length+" to store in an array2 ");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		int[]result=merged(arr1, arr2);
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
	}
	

}
