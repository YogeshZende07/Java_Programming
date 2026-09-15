package String;

import java.util.Scanner;

public class CharOccurance {
	public static int countOfChar(String str, char targetChar) {
		if(str==null|| str.isEmpty()) {
			return 0;
		}
		
		str=str.toLowerCase();
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==targetChar) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		char targetChar=sc.next().charAt(0);
		int res=countOfChar(str, targetChar);
		System.out.println(targetChar+" is  appears "+res+" times");
	}

}
