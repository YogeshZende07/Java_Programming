package String;

import java.util.Scanner;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String input=sc.nextLine();
		char[]ochars=input.toCharArray();
		char[]newchars=new char[ochars.length];
		int newlength=0;
		for(int i=0;i<ochars.length;i++) {
			char ch=ochars[i];
			if(ch!=' ' && ch!='\t' && ch!='\n' && ch!='\r') {
				newchars[newlength]=ch;
				newlength++;
			}
		}
		String result= new String(newchars,0,newlength);
		System.out.println("Result: "+result);
		
	}

}
