package com.kodnest.programming;

import java.util.Scanner;

public class JourneyCalculatorApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Speed and Time");
		double speed = scan.nextDouble();
		double time = scan.nextDouble();
		JourneyCalculator j1 = new JourneyCalculator();
		double distance=j1.calculateDistance(speed, time);
		System.out.println(distance);
	}
	
}
