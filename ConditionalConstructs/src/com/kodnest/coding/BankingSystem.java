package com.kodnest.coding;

import java.util.Scanner;

public class BankingSystem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Any Number Among 1 and 2");
		int num = scan.nextInt();
		System.out.println("Enter The Amount In Rupees");
		int amount = scan.nextInt();
		if(num==1)
		{
			System.out.println("You Are Entered Into Credit Section");
		}
		else if(num==2)
		{
			System.out.println("You Are Entered Into Debit Section");
			if(amount<2000)
			{
				System.out.println("NetBanking Is Not Permitted");
			}
			else if(amount>=2000 && amount<=25000)
			{
				System.out.println("Start NetBanking");
			}
			else
			{
				System.out.println("Invalid Amount");
			}
		}
		else
		{
			System.out.println("Enter The Valid Number");
		}
		
	}
}
