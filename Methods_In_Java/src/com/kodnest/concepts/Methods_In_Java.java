package com.kodnest.concepts;

public class Methods_In_Java {
	public static void main(String[] args) {
		greet();
		add();
		System.out.println(sub());
		int m=5;
		int n=3;
		multiply(m,n);
		int p=20;
		int q=2;
		System.out.println(div(p,q));
	}
	public static void greet()
	{
		System.out.println("Hello World!...");
	}

	//Types Of Methods
	//1.Type-1:
	public static void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	//2.Type-2:
	public static int sub()
	{
		int x=50;
		int y=30;
		int z=x-y;
		return z;
	}
	
	//3.Type-3:
	public static void multiply(int m,int n)
	{
		int o = m*n;
		System.out.println(o);
	}
	
	//Type-4:
	public static int div(int p,int q)
	{
		return p/q;
	}
}
