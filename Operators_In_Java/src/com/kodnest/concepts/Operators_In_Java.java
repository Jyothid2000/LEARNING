package com.kodnest.concepts;

public class Operators_In_Java {
	public static void main(String[] args) {
		//Binary Operators
		//1.Arithmetic Operators
		int x=10;
		int y=20;
		System.out.println("Addition Result is "+(x+y));
		System.out.println("Subtraction Result is "+(y-x));
		System.out.println("Multiplication Result is "+(x*y));
		System.out.println("Division Quotient Result is "+(y/x));
		System.out.println("Division Remainder Result is "+(y%x));
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		//2.Comparision Operators (or) Relational Operators
		int a=10;
		int b=20;
		int c=10;
		System.out.println("Is a equal to c? "+(a==c));
		System.out.println("Is a not equal to b? "+(a!=b));
		System.out.println("Is a greater than b? "+(a>b));
		System.out.println("Is a less than b? "+(a<b));
		System.out.println("Is a greater than or equal to b? "+(a>=b));
		System.out.println("Is a less than or equal to b? "+(a<=b));
		System.out.println("Is b greater than or equal to a? "+(b>=a));
		System.out.println("Is a greater than or equal to c? "+(a>=c));
		System.out.println("Is c less than or equal to b? "+(c<=b));
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		//3.Logical Operators
		boolean m = true;
		boolean n = false;
		System.out.println(m&&n);
		System.out.println(n&&n);
		System.out.println(m&&m);
		System.out.println(m||n);
		System.out.println(n||n);
		System.out.println(m||m);
		System.out.println("========================================");
		
		//4.Bitwise Operators
		int d = 8;
		int e = 9;
		System.out.println("Value of d&e is: "+(d&e));
		System.out.println("Value of d|e is: "+(d|e));
		System.out.println("Value of d^e is: "+(d^e));
		System.out.println("Bitwise complement of d is: "+(~d));
		System.out.println("Bitwise complement of e is: "+(~e));
		System.out.println("Result of d<<2 is: "+(d<<2));
		System.out.println("Result of e>>2 is: "+(e>>2));
		System.out.println("=========================================");
		
		//Unary Operators
		//Incrementation Operators
		//1.Post Incrementation Operator
		int f=11;
		int g;
		g = f++;
		System.out.println(f);
		System.out.println(g);
		
		//2.Pre Incrementation Operator
		int h;
		h = ++f;
		System.out.println(f);
		System.out.println(h);
		
		//Decrementation Operators
		//1.Post Decrementation Operator
		int i;
		i = f--;
		System.out.println(f);
		System.out.println(i);
		
		//2.Pre Decrementation Operator
		int j;
		j = --f;
		System.out.println(f);
		System.out.println(j);
	}

}
