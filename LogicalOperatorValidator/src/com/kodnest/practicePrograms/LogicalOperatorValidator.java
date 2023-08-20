package com.kodnest.practicePrograms;

import java.util.Scanner;

public class LogicalOperatorValidator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Is input valid(true/false): ");
		boolean a = scan.nextBoolean();
		System.out.println("Does input meets a certain condition(true/false): ");
		boolean b =scan.nextBoolean();
		isValidInput(a,b);
		if(a && b)
		{
			System.out.println("Input is valid.");
		}
		else
		{
			System.out.println("Invalid input");
		}
	}
	public static boolean isValidInput(boolean a,boolean b)
	{
		return a && b;
	}
}
