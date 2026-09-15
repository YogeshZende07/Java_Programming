package Array_Programs;

import java.util.Scanner;

public class SecondLargestandSecondMIn {
	public static void secondMinandSecondMax(int arr[]) {
		if ( arr== null || arr.length<2) {
			System.out.println("in array atlest 2 element shuold present");
			return;
		}
		int min= Integer.MAX_VALUE;
		int sMin=Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;
		int sMax= Integer.MIN_VALUE;
		
		for( int i=0; i<arr.length;i++) {
			if( arr[i]>max) {
				sMax= max;
				max=arr[i];
			}
			else if( arr[i]>sMax && arr[i]!=max) {
				sMax=arr[i];
			}
			
			if(arr[i]<min) {
				sMin=min;
				min=arr[i];
			}
			else if(arr[i]<sMin && arr[i]!=min) {
				sMin=arr[i];
			}
		}
		System.out.println(max+" is a maximum value present in this array");
		System.out.println(sMax+" is a second maximum value present in this array");
		System.out.println(min+" is a minimum value present in this array");
		System.out.println(sMin+" is a second minimum value present in this array");
		System.out.println((sMax==Integer.MIN_VALUE?"none":sMax));
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("ENter size of an array");
		int size= sc.nextInt();
		int arr[]=new int [size];
		System.out.println("  enter "+arr.length+" values to store");
		
		for(int i=0;i<arr.length;i++){
			arr[i]= sc.nextInt();
		}
		
		secondMinandSecondMax(arr);
	}

}
