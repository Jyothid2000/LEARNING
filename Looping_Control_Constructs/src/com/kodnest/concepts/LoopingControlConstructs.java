package com.kodnest.concepts;

public class LoopingControlConstructs {
	public static void main(String[] args) {
		
		//1.for loop:
		for(int i=1; i<=5; i++)
		{
			System.out.println("KODNEST");
		}
		System.out.println("+++++++++++++");
		
		//2.while loop:
		int i=1;
		while(i<=5)
		{
			System.out.print("Welcome! ");
			i++;
		}
		System.out.println();
		System.out.println("++++++++++++++");
		
		//3.do while loop:
		int a=1;
		do
		{
			System.out.print("Congrats! ");
			a++;
		}while(a<=5);
		System.out.println();
		System.out.println("+++++++++++++++");
		
		//Nested for loop:
		for(int j=1;j<=5;j++)
		{
			for(int k=1;k<=5;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("++++++++++++++++");
		
		//Nested while loop:
		int m=1;
		while(m<=5)
		{
			int n=1;
			while(n<=5)
			{
				System.out.print(m+n+" ");
				n++;
			}
			System.out.println();
			m++;
		}
		System.out.println("+++++++++++++++++");
		
		//Nested do while loop:
		int x=1;
		do
		{
			int y=1;
			do
			{
				System.out.print(x*y+" ");
				y++;
			}while(y<=5);
			System.out.println();
			x++;
		}while(x<=5);
		
	}

}
