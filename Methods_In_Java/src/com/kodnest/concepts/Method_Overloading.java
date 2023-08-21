package com.kodnest.concepts;

public class Method_Overloading {
	public static void main(String[] args) {
		teabill();
		teabill(10);
		teabill("Ginger");
		teabill("Green",10);
	}
	public static void teabill()
	{
		System.out.println("Bill for tea is 10Rs");
	}
	public static void teabill(int n)
	{
		System.out.println("Bill for "+n+" tea is "+(n*10));
	}
	public static void teabill(String type)
	{
		System.out.println("Bill for "+type+" tea is 15Rs");
	}
	public static void teabill(String type,int n)
	{
		System.out.println("Bill for "+n+" "+type+" tea is "+(n*15));
	}

}
