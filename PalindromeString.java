package com.Tricky.ProgramesPractice;

import java.util.Scanner;

public class PalindromeString {
	static String rev="";
		public static String reverse(String s) {
			char[] ch=s.toCharArray();
			
			for(int i=ch.length-1;i>=0; i--) {
				rev+=ch[i];
			}
			return rev;
		}
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter Words needs to be Reversed");
			String string=input.next();
			reverse(string);
			if(string.equals(rev)) {
				
			System.out.println("String Is Palindrome"+rev);
			}else {
				System.out.println("Is not Palindrome");
			}
			
			input.close();
			
			
		}
}
