package com.Tricky.ProgramesPractice;

import java.util.Scanner;

//Palindrome number remains same when digits are reversed
//16461  reverse 16461

public class PalindromeNumber {
	public static int reverse(int n) {
		int revNum=0;
		int rem=0;
		while(n>0) {
			rem=n%10;
			revNum=(revNum*10) +rem;
			n=n/10;
		}
		return revNum;
	}
			public static void main(String[] args) {
				Scanner input=new Scanner(System.in);
				System.out.println("Enter Palindrome Number");
				int num=input.nextInt();
				if(num == reverse(num)) {
					System.out.println("Enter Number is Palindrome Number");
				}else {
					System.out.println("Enter Number is Not Palindrome Number");
				}
				input.close();
			}
			
}
