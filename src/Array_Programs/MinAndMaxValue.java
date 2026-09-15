package Array_Programs;
import java.util.*;

public class MinAndMaxValue {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array");
		int size= sc.nextInt();
		int arr[]= new int [size];
		System.out.println("enter "+arr.length+" values to store");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}		
		
		minAndMax(arr);
	}
	
	public static void minAndMax(int arr[]) {
		int min= arr[0];
		int max= arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if (arr[i]>max) {
				max= arr[i];
			}
			else if( arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(max+" is a max value present in array");
		System.out.println(min+" is a minimum value present in array");
	}

}
