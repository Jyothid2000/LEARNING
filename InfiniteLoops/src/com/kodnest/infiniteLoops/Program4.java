package com.kodnest.infiniteLoops;

public class Program4 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			for(;;)
			{
				System.out.println("KODNEST");
				break;
			}
		}
	}

}
