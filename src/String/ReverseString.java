package String;

import java.util.Scanner;

public class ReverseString {
	public static String reverse(String str) {
		if(str==null||str.isEmpty()) {
			return str;
		}
		String reversed="";
		for (int i=str.length()-1;i>=0;i--) {
			reversed+=str.charAt(i);
		}
		return reversed;
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter String ");
		String str= sc.nextLine();
		System.out.println(reverse(str));
	}

}
