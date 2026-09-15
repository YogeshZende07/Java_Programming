package Array_Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
	public static int[] twoSum(int [] arr,int target) {
		HashMap<Integer,Integer> map= new HashMap<>();
		for( int i=0;i<arr.length;i++) {
			int neededval=target-arr[i];
			if(map.containsKey(neededval)) {
				return new int [] {map.get(neededval),i};
			}
			map.put(arr[i], i);
			
		}
		return new int[] {};
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size= sc.nextInt();
		int []arr= new int[size];
		System.out.println("enter "+arr.length+" values to store ");
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Enter target");
		int target=sc.nextInt();
		System.out.println("Add index no. "+Arrays.toString(twoSum(arr, target))+" for "+target);
		
	}

}
