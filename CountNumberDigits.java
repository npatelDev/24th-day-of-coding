package com.Tricky.ProgramesPractice;

import java.util.Scanner;

public class CountNumberDigits {
	static int count;
	static int CountDigits(int num) {
		int[] integer=new int[num];
		 count=integer.length;
		return count;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number");
		int inputNumber=input.nextInt();
		CountDigits(inputNumber);
		System.out.println("Number of Digits in Given Number :"+count);
		input.close();
	}
}
