package Array_Programs;
import java.util.Scanner;
public class ArrayPalindrome {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size");
	int size= sc.nextInt();
	int  arr[]=new int[size];
	System.out.println("enter the "+arr.length+"number to check");
	
	 for(int i=0;i<arr.length;i++) {
		 arr[i]=sc.nextInt();
	 }
	 boolean  flag=true;
	 int rev[]=new int[size];
	int j=0;
	
	for(int i=arr.length-1;i>=0;i--) {
		rev[j]=arr[i];
		arr[i]--;
		arr[j]++;
		if(arr[i]!=arr[j]) {
			System.out.println("given number is palndrome");
			break;
	}
		else
			System.out.println("is not a palindrome");
	
	}
	
	
	
	}
}
/*3rd way

int start=0
int end=arr.length-1;
while(start<end)
{
if(arr[start]!=arr[ende])
{
sopln("not a pslindrome");
return
}
start++;
end--;
}
sopln("palindrome)*/
