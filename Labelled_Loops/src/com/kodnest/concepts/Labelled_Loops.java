package com.kodnest.concepts;

public class Labelled_Loops {
	public static void main(String[] args) {
		
		//1.Labelled for loop
		rajini:for(int i=1;i<=5;i++)
		{
			yash:for(int j=1;j<=5;j++)
			{
				System.out.print("*");
				break rajini;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("=============");
		
		//2.Labelled while loop
		int m=1;
		rajini:while(m<=5)
		{
			int n=1;
			yash:while(n<=5)
			{
			System.out.print("* ");
			n++;
			break rajini;
			}
			System.out.println();
			m++;
		}
		System.out.println();
		System.out.println("=============");
		
		//3.Labelled do while loop
		int i=1;
		rajini:do
		{
			int j=1;
			yash:do
			{
				System.out.print("* ");
				j++;
				if(j==2)
				{
				break rajini;
				}
			}while(j<=5);
			System.out.println();
			i++;
		}while(i<=5);
	}

}
