package com.kodnest.concepts;

public class Mobile {
	String brand;
	String color;
	int cost;
	public Mobile(String brand,String color,int cost)
	{
		this.brand = brand;
		this.color = color;
		this.cost = cost;
	}
	void allowToCall()
	{
		System.out.println("Tring...Tring...Calling....");
	}
	void allowToPlay()
	{
		System.out.println("Start Playing BGMI....");
	}

}
