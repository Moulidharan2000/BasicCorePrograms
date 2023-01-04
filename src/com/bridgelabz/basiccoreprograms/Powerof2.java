package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class Powerof2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Power : ");
		int power = scan.nextInt();
		int baseNum = 2;
		if (power >= 0 && power < 31) {
			for(int i=1; i<=power; i++) {
				int result = (int)Math.pow(baseNum, i);
				System.out.println(baseNum+" Power "+i+" is : "+result);
				}
		}
		else
			System.out.println("Invalid Power Value");
	}
}
