package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class EvenOrOdd {

	static void EvenorOdd(int number) {
		if(number%2 == 0)
			System.out.println("The Given Number "+number+" is Even");
		else
			System.out.println("The Given Number "+number+" is Odd");
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number = scan.nextInt();
		EvenorOdd(number);
	}
}
