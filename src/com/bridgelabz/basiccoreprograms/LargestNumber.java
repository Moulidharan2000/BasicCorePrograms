package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class LargestNumber {

	static void LargestinThree(int num1, int num2, int num3) {
		if(num1>num2 && num1>num3)
			System.out.println("Number "+num1+" is Largest Among Three Numbers");
		else if(num2>num3 && num2>num1)
			System.out.println("Number "+num2+" is Largest Among Three Numbers");
		else
			System.out.println("Number "+num3+" is Largest Among Three Numbers");
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the First Number : ");
		int num1 = scan.nextInt();
		System.out.print("Enter the Second Number : ");
		int num2 = scan.nextInt();
		System.out.print("Enter the Third Number : ");
		int num3 = scan.nextInt();
		
		LargestinThree(num1, num2, num3);
	}
}
