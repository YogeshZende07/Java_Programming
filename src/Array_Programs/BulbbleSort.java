package Array_Programs;
import java.util.Scanner;

public class BulbbleSort {
	public static void bubbleSort(int arr[]) {
		if ( arr== null || arr.length<=1) {
			System.out.println("Atleast 2 element should to be present in array");
			return;
		}
		int n= arr.length;
		boolean swapped;
		
		for(int i=0;i<n-1;i++) {
			swapped= false;
			
			for( int j=0;j< n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size= sc.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter "+arr.length+" values to store in array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		bubbleSort(arr);
		
	}

}
