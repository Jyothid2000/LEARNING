package com.kodnest.concepts;

public class DataTypes_In_Java {
	public static void main(String[] args) {
		//Primitive Data Types
		char a = '$';
		byte b = 126;
		short c = 32752;
		int d = 2147483645;
		long e = 92233214736085803L;
		float f = 3.1f;
		double g = 3.14139625;
		boolean h = false;
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);
		System.out.println("=====================================");
		
		//Type Casting
		//1.Implicit Type Casting
		char x = 'Z';
		int y;
		y = x;
		System.out.println(x);
		System.out.println(y);
		
		//2.Explicit Type Casting
		double m=3.147;
		int n;
		n = (int)m;
		System.out.println(m);
		System.out.println(n);
		
	}

}
