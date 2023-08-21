package com.kodnest.coding;

import java.util.Scanner;

public class School {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = scan.next();
		System.out.println("Enter Your ID Number");
		int id = scan.nextInt();
		System.out.println("Enter Admission Date");
		int date = scan.nextInt();
		if(id>=1 && id<=60)
		{
			System.out.println(name+" is studying in 10th standard");
		}
		else
		{
			if(date==1)
			{
				System.out.println("Admission Completed Go To Class");
			}
			else
			{
				System.out.println("Student Data Not Found");
			}
		}
	}

}
