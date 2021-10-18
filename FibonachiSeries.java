package com.Tricky.ProgramesPractice;

public class FibonachiSeries {
	public static void main(String[] args) {
		//Fibonachi 
		//0 1 1 2 3 5 8 13 21 34 etc
		int num1=0,num2=1,sum=0;
		
		System.out.print(num1+" "+num2);//0 1
		
		for(int i=2; i<=10; i++) {
			
			sum=num1+num2;
			System.out.print(" "+sum);//1
			num1=num2;//num1=1,num1=1,num1=2
			num2=sum;//num2=1,num2=2,num2=3
			
		}
	}
}
