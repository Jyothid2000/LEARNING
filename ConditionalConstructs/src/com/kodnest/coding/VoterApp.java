package com.kodnest.coding;

import java.util.Scanner;

public class VoterApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age = scan.nextInt();
		Voter v = new Voter();
		v.checkVoterAge(age);
	}

}
