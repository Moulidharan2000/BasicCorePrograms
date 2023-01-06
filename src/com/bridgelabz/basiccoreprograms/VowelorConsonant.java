package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class VowelorConsonant {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Letter : ");
		char alphabet = scan.next().charAt(0);
	
		if(alphabet=='a' || alphabet=='e'|| alphabet=='i' || alphabet=='o' || alphabet=='u' )
			System.out.println("The Alphabet '"+alphabet+"'"+" is a Vowel");
		else
			System.out.println("The Alphabet '"+alphabet+"'"+" is a Consonant");
	}
}
