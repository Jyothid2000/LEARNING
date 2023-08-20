package com.kodnest.practicePrograms;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome To The Temperature Conversion Tool!");
		System.out.println("Select an option: \n 1. Convert Celsius to Fahrenheit \n 2. Convert Fahrenheit to Celsius");
		System.out.println("Enter your choice: ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1 :
			System.out.println("Enter the temperature in Celsius: ");
			double celsius = scan.nextDouble();
			double res1 = celsiusToFahrenheit(celsius);
			System.out.println(celsius+"C is equivalent to "+res1+"F");
			break;
		case 2 :
			System.out.println("Enter the temperature in Fahrenheit: ");
			double fahrenheit = scan.nextDouble();
			double res2 =  fahrenheitToCelsius(fahrenheit);
			System.out.println(fahrenheit+"F is equivalent to "+res2+"C");
			break;
		default :
			System.out.println("No Conversions Available For Your Choice");
		}
	}
	public static double celsiusToFahrenheit(double celsius) {
		return (celsius*9/5)+32;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit-32)*5/9;
	}
}
