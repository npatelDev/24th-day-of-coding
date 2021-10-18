package com.StringPrograms.StringTopic;

import java.util.Scanner;

public class CountWordInString {
	public static int countString(String str) {
		
		char[] ch=str.toCharArray();
		int a=ch.length;
		return a ;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Words to be Count");
		String Number=input.next();
		System.out.println(countString(Number));
		input.close();
	} 
}
