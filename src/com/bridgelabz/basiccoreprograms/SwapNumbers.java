package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class SwapNumbers {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the First Number : ");
		int num1 = scan.nextInt();
		System.out.print("Enter the Second Number : ");
		int num2 = scan.nextInt();
		System.out.println("Before Swapping First Number : "+num1+" , Second Number : "+num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After  Swapping First Number : "+num1+" , Second Number : "+num2);
	}
}
