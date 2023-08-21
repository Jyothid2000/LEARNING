package com.kodnest.coding;

import java.util.Scanner;

public class GradeApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Score");
		int score = scan.nextInt();
		Grade g = new Grade();
		g.giveGrade(score);
	}

}
