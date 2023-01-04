package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Year : ");
		int year = scan.nextInt();
		
		if(year % 400 == 0 && year %4 == 0 && year > 1582)
			System.out.println("Year : "+year+" is a Leap Year");
		else
			System.out.println("Year : "+year+" is Not a Leap Year");
	}

}
