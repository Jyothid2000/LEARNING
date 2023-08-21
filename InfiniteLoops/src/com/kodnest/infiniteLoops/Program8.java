package com.kodnest.infiniteLoops;

public class Program8 {
	public static void main(String[] args) {
		for(;;)
		{
			System.out.println("Hello");
			while(false)
			{
				System.out.println("Kodnest");
			}
			System.out.println("Technologies");
			break;
		}
	}

}
