package String;

import java.util.Scanner;

public class CountOfVovelsandConsonent {
	public static void count(String str) {
		str=str.toLowerCase();
		int vovels=0;
		int consonent=0;
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vovels++;
			}
			else if(ch>='a' && ch<='z') {
				consonent++;
			}
		}
		System.out.println("vovel are:"+vovels);
		System.out.println("consonent are: "+consonent);
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string to  count");
		String str= sc.nextLine();
		count(str);
	}

}
