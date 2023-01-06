package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class QuotientandRemainder {

	static int getQuotient(int dividend,int divisor) {
		int quotient = dividend / divisor;
		return quotient;
	}
	
	static int getRemainder(int dividend, int divisor) {
		int remainder = dividend%divisor;
		return remainder;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number for Dividend : ");
		int dividend = scan.nextInt();
		System.out.print("Enter the Number for Divisor : ");
		int divisor = scan.nextInt();
		
		System.out.println("Quotient : "+getQuotient(dividend,divisor));
		System.out.println("Remaider : "+getRemainder(dividend, divisor));	
	}
}
