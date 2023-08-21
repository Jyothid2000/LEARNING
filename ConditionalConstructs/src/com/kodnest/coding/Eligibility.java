package com.kodnest.coding;

import java.util.Scanner;

public class Eligibility {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks scored");
		int marks = scan.nextInt();
		System.out.println("Welcome To Kodnest");
		EligibilityApp e1 = new EligibilityApp();
		e1.checkEligibility(marks);
	}

}
