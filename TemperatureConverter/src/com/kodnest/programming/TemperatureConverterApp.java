package com.kodnest.programming;

import java.util.Scanner;

public class TemperatureConverterApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Temperature");
		double fahrenheit = scan.nextDouble();
		TemperatureConverter t1 = new TemperatureConverter();
		double res = t1.convertFahrenheitToCelsius(fahrenheit);
		System.out.println(res);
	}

}
