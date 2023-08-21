package com.kodnest.coding;

import java.util.Scanner;

public class DonateBlood {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = scan.next();
		System.out.println("Enter Your Age");
		int age = scan.nextInt();
		System.out.println("Enter The Haemoglobin Level");
		float haemoglobin = scan.nextFloat();
		System.out.println("Enter The Systalic Blood Pressure");
		int sbp = scan.nextInt();
		System.out.println("Enter The Diastalic Blood Pressure");
		int dbp = scan.nextInt();
		if(age>18 && age<60)
		{
			if(haemoglobin>=12.5 && haemoglobin<=20.0)
			{
				if(sbp>=120 && sbp<=129)
				{
					if(dbp>=80 && dbp<=89)
					{
			          System.out.println(name+" is eligible to donate the blood");
					}
				}
			}
		}	
	}
}
