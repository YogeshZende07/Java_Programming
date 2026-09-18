package Number_Programs;

import java.util.*;

public class Practise {
	public static  int[]merged(int[]arr1, int []arr2){
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
	public static void main(String[]args) {
		int[]arr1= {1,2,3,8,9,10};
		int[]arr2= {4,5,6,13,14,12,11};
		int[]result=merged(arr1,arr2);
		Arrays.sort(result);
		System.out.println("merged array: "+Arrays.toString(result));
	}
}
