package Array_Programs;
import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int[]arr=new int[size];
		System.out.println("Enter "+arr.length+" values to store into an array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Orginal Array: "+Arrays.toString(arr));
	    selectionSort(arr);
		System.out.println("Sorted Array:  "+Arrays.toString(arr));
		
	}
	public static void selectionSort(int[]arr) {
		int n=arr.length-1;
		for(int i=0;i<=n;i++) {
			int minIdx=i;
			for(int j=i+1;j<=n;j++) {
				if(arr[j]<arr[minIdx]) {
					minIdx=j;
				}
			}
			int temp=arr[minIdx];
			arr[minIdx]=arr[i];
			arr[i]=temp;
		}
	}

}
