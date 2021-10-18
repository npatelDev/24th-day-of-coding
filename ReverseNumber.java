package com.Tricky.ProgramesPractice;

import java.util.Scanner;

public class ReverseNumber {
		static int rev=0;
		
		public static int reverse(int n) {
			int rem=0;
			while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
			}
			return rev;
		}
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter Number to Find Reverse of it");
			int num=input.nextInt();
			
			reverse(num);
			System.out.println(rev);
			input.close();
		}
}
