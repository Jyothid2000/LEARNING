package com.kodnest.practicePrograms;

import java.util.Scanner;

public class BitwiseSwapper {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int first = scan.nextInt();
		System.out.println("Enter the second integer: ");
		int second = scan.nextInt();
		swapUsingBitwise(first,second);
	}
	public static void swapUsingBitwise(int first,int second) {
		first = first ^ second;
		second = first ^ second;
		first = first ^ second;
		System.out.println("After Swapping: First = "+first+", Second = "+second);
	}

}
