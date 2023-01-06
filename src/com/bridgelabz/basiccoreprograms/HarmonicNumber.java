package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int N = scan.nextInt();
		double num = 0;
		double result = 0;
		
		if(N!=0) {
		for(int i=1; i<=N; i++) {
			num = num + (double)1/i;
		}
		System.out.println("The Harmonic Value of  Number "+N+" is : "+num);
		}
		else
			System.out.println("Invalid Number");
	}	
}
