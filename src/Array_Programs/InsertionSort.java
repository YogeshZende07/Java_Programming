package Array_Programs;
import java.util.*;

public class InsertionSort {
	public void insertionSort(int []arr) {
		if(arr==null || arr.length<=1) {
			return;
		}
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=  arr[i];
			int j= i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an  array");
		int size= sc.nextInt();
		int  [] arr=  new int [size];
		System.out.println("enter  "+arr.length+" elemnts");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		InsertionSort obj= new InsertionSort();
		obj.insertionSort(arr);
		
		for(  int val: arr) {
			System.out.print(val+" ");
		}
	}
}
