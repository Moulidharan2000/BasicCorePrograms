package com.bridgelabz.basiccoreprograms;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		System.out.print("Enter Number of Times to Flip the Coin : ");
		int num = scan.nextInt();		
		int head = 0;
		int tail = 0;
		
		for(int i=0; i<num; i++) {
			double randomNum = random.nextInt(2);
			if(randomNum < 0.5) 
				tail++;
			else
				head++;
		}
		double heads = head/(double)num * 100;
		double tails = tail/(double)num * 100;
		System.out.println("Percentage of Heads : "+heads+"%");
		System.out.println("Percentage of Tails : "+tails+"%");	
	}
}
