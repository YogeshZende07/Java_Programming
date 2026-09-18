package Array_Programs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.*;  

public class SlidingWindowMax {
	public static int[]maxSlidingWindow(int []arr, int k){
		int n=arr.length;
		int result[]=new int[n-k+1];
		int resulti=0;
		Deque<Integer>deque= new ArrayDeque<>();
		for(int i=0;i<n;i++) {
			if(!deque.isEmpty() && deque.peek()<i-k+1) {
				deque.poll();
			}
			while(!deque.isEmpty() && arr[deque.peekLast()]<arr[i]) {
				deque.pollLast();
			}
			deque.offer(i);
			if(i>=k-1) {
				result [resulti++]=arr[deque.peek()];
			}
		}
		return result;
	}
	
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size=sc.nextInt();
		int[]arr=new int[size];
		System.out.println("Enter "+arr.length+" values to store");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter window size(k)");
		int k= sc.nextInt();
		int[]maxElements=maxSlidingWindow(arr, k);
		System.out.println("Input Array: " + Arrays.toString(arr));
        System.out.println("Window Size (k): " + k);
        System.out.println("Sliding Window Maximums: " + Arrays.toString(maxElements));
	}

}
