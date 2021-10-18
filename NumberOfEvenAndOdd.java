package com.Tricky.ProgramesPractice;

import java.util.Scanner;

public class NumberOfEvenAndOdd {
	 public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter Number");
			int number=input.nextInt();
			int evenCount = 0;
			int OddCount =0;
			while(number>0) {
				int rem=number%10;
				if(rem%2 == 0) {
					evenCount++;
				}else {
					OddCount++;
				}
				number=number/10;
			}
			
			System.out.println("Number of Even Digits: "+evenCount);
			System.out.println("Number of Odd Digits: "+OddCount);
			input.close();
		}
}
 