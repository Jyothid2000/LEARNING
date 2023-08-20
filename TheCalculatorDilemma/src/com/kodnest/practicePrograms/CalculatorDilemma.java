package com.kodnest.practicePrograms;

import java.util.Scanner;

public class CalculatorDilemma {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any two numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("Enter a number between 1-4 to perform a mathematical operation");
		int choose = scan.nextInt();
		switch(choose) {
		case 1:
			System.out.println("Addition Result Is "+add(num1,num2));
			break;
		case 2:
			System.out.println("Subtraction Result Is "+sub(num1,num2));
			break;
		case 3:
			System.out.println("Multiplication Result Is "+multiply(num1,num2));
			break;
		case 4:
			System.out.println("Division Result Is "+div(num1,num2));
			break;
		default :
			System.out.println("No Such Mathematical Operations Matching This Number");
			break;
		}
	}
	public static int add(int num1,int num2) {
		return num1+num2;
	}
	public static int sub(int num1,int num2) {
		return num1-num2;
	}
	public static int multiply(int num1,int num2) {
		return num1*num2;
	}
	public static int div(int num1,int num2) {
		return num1/num2;
	}
}

