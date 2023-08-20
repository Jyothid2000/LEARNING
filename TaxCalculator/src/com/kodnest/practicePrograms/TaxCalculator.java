package com.kodnest.practicePrograms;

import java.util.Scanner;

public class TaxCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the purchase amount: ");
		double purchase_amount = scan.nextDouble();
		System.out.println("Enter the tax rate (in decimal form): ");
		double tax_rate = scan.nextDouble();
		System.out.println("Total cost including tax: "+calculateTotalWithTax(purchase_amount,tax_rate));
	}
	public static double calculateTotalWithTax(double purchase_amount,double tax_rate)
	{
		return (purchase_amount*tax_rate)+purchase_amount;
	}

}
