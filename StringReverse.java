package com.Tricky.ProgramesPractice;

import java.util.Scanner;

public class StringReverse {
		public static String reverse(String s) {
			char[] ch=s.toCharArray();
			String rev="";
			for(int i=ch.length-1;i>=0; i--) {
				rev+=ch[i];
			}
			return rev;
		}
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter Words needs to be Reversed");
			String string=input.next();
			System.out.println("Reveresd Words:  "+reverse(string));
			input.close();
		}
}
