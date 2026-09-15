package Array_Programs;
import java.util.*;
public class CountFrequency {
	public void countofFrequency(int []arr) {
		 Map<Integer,Integer>frequencyMap= new HashMap<>();
		 for(int num:arr) {
			 frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1); 
		 }
		 System.out.println("element frequency: ");
		 
		 for(Map.Entry<Integer, Integer> entry:frequencyMap.entrySet()) {
			 System.out.println(entry.getKey()+" appears "+entry.getValue()+" times");
		 }
		 System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size  of an array");
		int size= sc.nextInt();
		int []arr = new int[size];
		System.out.println("Enter "+ arr.length+" values to store in an array");
		
		for( int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
	
		CountFrequency obj= new CountFrequency();
		obj.countofFrequency(arr);
	}

}
