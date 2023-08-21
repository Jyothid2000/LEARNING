package com.kodnest.coding;

import java.util.Scanner;

public class DaysApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number between 1-7");
		int num = scan.nextInt();
		Days d = new Days();
		d.printDays(num);
	}

}
