package Array_Programs;

import java.util.Scanner;

public class MaxofSubArray {
	public static int  sumofSubArray(int []arr) {
		int n=arr.length;
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int currentsum=0;
			for(int j=i;j<n;j++) {
				 currentsum+=arr[j];
				if(currentsum>maxsum) {
					maxsum=currentsum;
				}
			}
		}
		return maxsum;
	}
	
	public static int sumOfMaxSubArray(int[]arr) {
		int globalmax=arr[0];
		int currentSum=arr[0];
		int n=arr.length;
		for(int i=1;i<n;i++) {
			currentSum=Math.max(arr[i], currentSum+arr[i]);
			globalmax=Math.max(currentSum, globalmax);
		}
		return globalmax;
	}
	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter size of an array");
//		int size=sc.nextInt();
//		int []arr=new int [size];
//		System.out.println("Enter "+arr.length+" elements to add in array");
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.println(sumofSubArray(arr));
		int []arr= {1,2,3,4,4,-7,8};
		System.out.println("maximum addition of all element is "+sumofSubArray(arr));
		System.out.print("maximum addition of all element is "+sumOfMaxSubArray(arr));
	}

}
