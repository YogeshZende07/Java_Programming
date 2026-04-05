package Array_Programs;

public class Ex1 {
	public static void main(String[] args) {
		int[]arr=new int[10];//create array object
		arr[0]=1;// assign the value in array object
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		arr[6]=7;
		arr[7]=8;
		arr[8]=9;
		arr[9]=10;
		for(int i=0;i<arr.length;i++) {//iterate every block  of array object
			if(arr[i]%2==0) { //if reminder=0 then condition true and enter inside block
				System.out.println(arr[i]);
			}
		}
	}

}
