package Number_Programs;

import java.util.*;

public class Practise {
	public static int[]twoSum(int[]arr,int target){
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int neededVal=target-arr[i];
			if(map.containsKey(neededVal)) {
				return new int[] {map.get(neededVal),i};
			}
			map.put(arr[i], i);
		}
		return new int[] {};
	}
	public static void main(String[]args) {
		int []arr= {1,2,3,4,56,7,62,8,6,55,4,3,2};
		int target=63;
		int []result=twoSum(arr,target);
		if(result.length==0) {
			System.out.println("target not present in array");
		}
		else
		System.out.println("by adding index number "+Arrays.toString(result)+"we get Addition as "+target);
	}
}
