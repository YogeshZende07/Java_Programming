package String;

import java.util.Scanner;

public class CountofWords {
	public static int countOfWords(String str) {
		if(str==null|| str.trim().isEmpty()) {
			return 0;
		}
		int count=1;
		str=str.trim();
		
		for(int i=0;i<str.length();i++) {
			//char ch = str.charAt(i);
			if(str.charAt(i)==' '&& str.charAt(i+1)!=' ') {
				count++;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter string to count");
	String str= sc.nextLine();
	System.out.println("count of words are:" +countOfWords(str));
	}

}
